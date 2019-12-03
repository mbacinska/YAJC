package org.mbacinska.homework14;

import java.util.concurrent.atomic.AtomicInteger;



//public class ConcurrentCounter {
//
//    private static final Counter counter = new Counter();
//
//    public static int get() {
//        return counter.value;
//    }
//
//    public static void clear() {
//        synchronized (counter) {
//            counter.value = 0;
//        }
//    }
//
//    public static void increment() {
//        synchronized (counter) {
//            counter.value++;
//        }
//    }
//
//    static class Counter {
//        int value = 0;
//    }
//}


//public class ConcurrentCounter {
//
//    private static int counter = 0;
//
//    public static int get() {
//        return counter;
//    }
//
//    public synchronized static void clear() {
//        counter = 0;
//    }
//
//    public synchronized static void increment() {
//        counter++;
//    }
//}


public class ConcurrentCounter {

    private static AtomicInteger counter = new AtomicInteger(0);

    public static int get() {
        return counter.get();
    }

    public synchronized static void clear() {
        counter.set(0);
    }

    public synchronized static void increment() {
        counter.incrementAndGet();
    }
}

