package org.mbacinska.lambdas;

public class SimpleLambdas2a {

    @FunctionalInterface
    interface Doable {
        void doSomething();
    }

    public static void main(String[] args) {
        //comparator replaced with lambda
        SimpleLambdas2.Doable data = () -> System.out.println("Inside doSomething");
        data.doSomething();

    }
}

