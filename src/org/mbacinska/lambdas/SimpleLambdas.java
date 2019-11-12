package org.mbacinska.lambdas;

import org.junit.Test;

public class SimpleLambdas {
    @Test
    public void testA() {
        Object data = new Object() {
            public void doSomething() {
                System.out.println("Inside doSomething() method");
            }
        };

        // Monitor.monitor(data);

        // data.doSomething() --> nie da sie dobrać do metody doSomething bo data jest z klasy Object a klasa Object nie ma metody doSomething()
    }

}
