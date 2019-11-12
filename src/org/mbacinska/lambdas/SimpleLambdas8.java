package org.mbacinska.lambdas;

import org.junit.Test;

import java.util.function.Supplier;

public class SimpleLambdas8 {

    @Test
    public void test() {
        Supplier<Integer> supplier = new Supplier<Integer>() {

            private Integer storage = 7;

            @Override
            public Integer get() {
                storage += 2;
                return storage;
            }
        };

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

    }
}
