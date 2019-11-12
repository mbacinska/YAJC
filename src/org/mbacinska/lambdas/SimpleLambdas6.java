package org.mbacinska.lambdas;

import org.junit.Test;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SimpleLambdas6 {


    @Test
    public void testA() {

        Consumer<SimpleClass> consumer = (item) -> {
            System.out.println(item.value);
            Monitor.monitor(item);
        };

        SimpleClass simpleClass = new SimpleClass(999);
        consumer.accept(simpleClass);
    }

    @Test
    public void TestB() {

        Supplier<SimpleClass> supplier = () -> new SimpleClass(2000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());//drugie wykonanie new; zupelnie nowy obiekt tworzymy
        Monitor.monitor(supplier);

    }

    @Test
    public void TestC() {
        Supplier<SimpleClass> supplier = () -> new SimpleClass(-13);

        Consumer<SimpleClass> consumer = (item) -> {
            Monitor.monitor(item);
            System.out.println(item.value);
        };

        consumer.accept(supplier.get());
    }

    class SimpleClass {
        final Integer value;

        SimpleClass(Integer value) {
            this.value = value;
        }
    }
}


