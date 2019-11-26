package org.mbacinska.lesson14;

import java.util.concurrent.ThreadLocalRandom;

public class Timer {

    private static long startTime = System.currentTimeMillis();

    public static void consume(long millis) {
        long startTime = System.currentTimeMillis();
        while (System.currentTimeMillis() - startTime < millis) {
            ThreadLocalRandom.current().nextDouble();
        }
    }

    synchronized public static void log(String message) {
        System.out.printf(
                "%5d %-10s %s\n",
                System.currentTimeMillis() - startTime,
                Thread.currentThread().getName(),
                message
        );
        System.out.flush();
    }

    public static void main(String[] args) {

        log("Start");
        long startTime = System.currentTimeMillis();

        consume(5);

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        log("Finish");
    }
}