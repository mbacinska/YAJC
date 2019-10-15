package org.mb.lambda;

import java.util.function.Supplier;

public class NotSoSimple {

    static class SomeClass{
        public SomeClass() {
            System.out.println("constructor");
        }
    }

    public static void main(String[] args) {

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("go");
//            }
//        };
        Runnable r = () -> System.out.println("go");

        Supplier<Object> someObject = Object::new;//anonimowy akcesor do metory new w klasie Object
        someObject.get();
        //new Object(); zastepuje dwie powyzsze linijki

        Supplier<SomeClass> someNewObject = () ->new SomeClass();
        someNewObject.get();

    }
}
