package org.mbacinska.lesson14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SimpleThreads {

    public static final int N_THREADS = 2;

    @Test
    public void test() throws InterruptedException {

        //Timer.log("" + Runtime.getRuntime().availableProcessors());

        List<Thread> threads = new ArrayList<>();
        for (int index = 0; index < N_THREADS; index++) {
            threads.add(new Thread(new SimpleWorker()));
        }

        Timer.log("All start");
        for (Thread thread : threads) {
            thread.start();
        }

//        for (Thread thread : threads) {
//            Timer.log("" +thread.getState());
//        }

        Timer.log("All working now");

        for (Thread thread : threads) {
            Timer.log("joining");
            thread.join();
        }

        Timer.log("After run");
    }

    class SimpleWorker implements Runnable {

        @Override
        public void run() {
            Timer.log("Start");
            Timer.consume(50);
            Timer.log("Finishing");
        }
    }
}

