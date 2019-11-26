package org.mbacinska.lesson14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleThreadsWithConstructor {


    public static final int N_THREADS = 2;

    @Test
    public void test() throws InterruptedException {

        List<Thread> threads = new ArrayList<>();
        for (int index = 0; index < N_THREADS; index++) {
            threads.add(new Thread(new SimpleWorker(index + 30)));
        }

        Timer.log("All starting");
        for (Thread thread : threads) {
            thread.start();
        }

//        for (Thread thread : threads) {
//            Timer.log("" +thread.getState());
//        }

        Timer.log("All joining");

        for (Thread thread : threads) {
            Timer.log("joining");
            thread.join();
        }

        Timer.log("After run");
    }

    class SimpleWorker implements Runnable {

        private Integer value;

        public SimpleWorker(Integer value) {
            this.value = value;
        }

        @Override
        public void run() {
            Timer.log("Start");
            Timer.consume(value);
            Timer.log("Finishing");
        }
    }
}


