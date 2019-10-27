package org.mb.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class NotSoSimple {

    public static void main(String[] args) {

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("go");
//            }
//        };
        Runnable r = () -> System.out.println("go");

        Supplier<Object> someObject = Object::new;//anonimowy akcesor do metody new w klasie Object
        someObject.get();
        //new Object(); zastepuje dwie powyzsze linijki

        Supplier<SomeClass> someNewObject = () -> new SomeClass();
        someNewObject.get();

        Function<Integer, Integer> f = (i1) -> {
            System.out.println("In function");
            return i1 + 1500;
        };
        System.out.println(f.apply(200));

    }
    static class SomeClass {
        public SomeClass() {
            System.out.println("constructor");
        }
    }


}
