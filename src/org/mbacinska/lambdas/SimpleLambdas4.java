package org.mbacinska.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntConsumer;

public class SimpleLambdas4 {

    @Test
    public void testA() {


        List<Integer> data = Arrays.asList(1, 5, 7, 3);
        //data.forEach(System.out::println);


        IntConsumer printer = System.out::println;
        Monitor.monitor(System.out);
        Monitor.monitor(printer);

    }
}
