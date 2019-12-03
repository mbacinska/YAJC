package org.mbacinska.homework14;

public class Timer {

    private static long startTime = System.currentTimeMillis();

    public static void log(String message) {
        long now = System.currentTimeMillis();
        System.out.printf(
                "%5d %-10s %s\n",
                now - startTime,
                Thread.currentThread().getName(),
                message
        );
        System.out.flush();
    }

    public static void consume(long millis) {
        if (millis > 0) {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < millis) {
            }
        }
    }

    public static void sync(long millis) {
        if (millis > 0) {
            long mask = -millis;
            long startTime = System.currentTimeMillis() & mask;
            while ((System.currentTimeMillis() & mask) == startTime) {
            }
        }
    }
}