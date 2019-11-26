package org.mbacinska.lesson14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SharedThreadsWithHazard {

    public static final int N_THREADS = 3;

    @Test
    public void test() throws InterruptedException {


        SharedDTO sharedValue = new SharedDTO();

        List<Thread> threads = new ArrayList<>();
        for (int index = 0; index < N_THREADS; index++) {
            threads.add(new Thread(new SimpleWorker(sharedValue)));
        }

        Timer.log("All starting");
        for (Thread thread : threads) {
            thread.start();
        }

        for (int index = 0; index < 30; index++) {
            Timer.consume(1);
            sharedValue.next();
        }

        Timer.log("All joining");

        for (Thread thread : threads) {
            Timer.log("joining");
            thread.join();
        }

        Timer.log("After run");
    }

    class SharedDTO {

        public int value = 0;

        synchronized public void next() {
            synchronized (this) {
                value++;
            }
        }

        synchronized public void prev() {
            synchronized (this) {
                value--;
            }
        }

        @Override
        public String toString() {
            return "SharedDTO{value = " + value + '}';
        }
    }

    class SimpleWorker implements Runnable {

        private SharedDTO sharedValue;

        public SimpleWorker(SharedDTO sharedValue) {

            this.sharedValue = sharedValue;
        }

        @Override
        public void run() {
            Timer.log("Start");
            for (int index = 0; index < 30; index++) {
                Timer.consume(1);
                Timer.log("" + sharedValue);
            }
            Timer.log("Finishing");
        }
    }

}
