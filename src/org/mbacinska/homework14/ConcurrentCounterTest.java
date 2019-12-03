package org.mbacinska.homework14;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcurrentCounterTest {

    static class testConcurrentCounterAsyncWorker implements Runnable {
        final Lock lock;

        public testConcurrentCounterAsyncWorker(Lock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();
            Timer.sync(4);
            ConcurrentCounter.increment();
            lock.unlock();  // lock() / unlock pair to be fair
        }
    }

    @Test
    public void testConcurrentCounterAsync() throws InterruptedException {
        final int N_THREADS = 32;

        Timer.log("Start");
        ConcurrentCounter.clear();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        Lock readLock = readWriteLock.readLock();
        Lock writeLock = readWriteLock.writeLock();
        writeLock.lock();

        Thread[] threads = new Thread[N_THREADS];
        for (int index = 0; index < threads.length; index++) {
            Thread thread = new Thread(new testConcurrentCounterAsyncWorker(readLock));
            thread.start();
            threads[index] = thread;
        }
        Assert.assertEquals(0, ConcurrentCounter.get());

        Timer.log("Go");
        writeLock.unlock();

        for (Thread thread : threads) {
            thread.join();
        }

        Timer.log("Done: " + ConcurrentCounter.get() + " of " + N_THREADS);
        Assert.assertEquals(N_THREADS, ConcurrentCounter.get());
    }
}
