package org.mbacinska.lesson14;

import org.junit.Test;

public class SimpleThread {

    @Test
    public void test() throws InterruptedException {

        Timer.consume(5);
        Thread thread = new Thread(new SimpleWorker());
        Timer.log(thread.getState().toString());
        Timer.log(("All start"));

        //thread.run(); to nie ma nic wspólnego z wątkami
        thread.start();
        //Timer.consume(10);
        Timer.log(thread.getState().toString());
        thread.join(); //czeka aż wątek się skończy
        Timer.log("" + thread.getState());//pokazuje w jakim stanie jest wątek
        Timer.log("After run");

    }

    class SimpleWorker implements Runnable {

        @Override
        public void run() {
            Timer.log("Start");
            Timer.consume(10);
            Timer.log("Finishing");
        }
    }
}
