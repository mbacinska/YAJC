package org.mb.statics;

public class ExampleStatic {

    static class Inner{

         public static int staticData = 7;

    }

    public static void main(String[] args) {

        System.out.println(Math.PI);

        Inner inner = new Inner();
        System.out.println(inner.toString());
        //inner.staticData ---> nie ma dostepu do pola 'staticData' poprzez obiekt klasy Inner

        System.out.println(Inner.staticData); //dostep do pola 'staticData' tylko przez nazwe klasy

    }
}
