package org.mbacinska.lesson14;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SharedThreads {

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

        sharedValue.value = 13;
        Timer.log("All joining");

        for (Thread thread : threads) {
            Timer.log("joining");
            thread.join();
        }

        Timer.log("After run");
    }

    class SharedDTO {

        public Integer value = 0;


        @Override
        public String toString() {
            return "SharedDTO{" + " value = " + value + '}';
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
            Timer.consume(30);
            Timer.log("" + sharedValue.value);
            Timer.log("Finishing");
        }
    }
}



