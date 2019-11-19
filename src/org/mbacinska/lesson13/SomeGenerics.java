package org.mbacinska.lesson13;

import org.junit.Test;

public class SomeGenerics {

    class MyClass<T> {
        //parametrized type

        Object /*T*/ value;
    }

    @Test
    public void testA() {
        MyClass<Integer> data = new MyClass<>();

    }
}
