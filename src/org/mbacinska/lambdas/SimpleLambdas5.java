package org.mbacinska.lambdas;

import org.junit.Test;

import java.util.function.IntConsumer;

public class SimpleLambdas5 {

    public static void myMethod(int data) {
        System.out.println("hahahah " + data * 2);
    }

    @Test
    public void testA() {

        IntConsumer printer = SimpleLambdas5::myMethod;

        Monitor.monitor(printer);

        printer.accept(1500100900);
    }
}
