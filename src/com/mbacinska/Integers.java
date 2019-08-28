package com.mbacinska;

public class Integers {

    public static void main(String[] args) {

        Integer x = 10; //Integer x = new Integer(10);
        Integer y = 10;
        System.out.println(x == y);

        x = 1000;
        y = 1000;
        System.out.println(x == y);

        x = new Integer(10);
        y = new Integer(10);
        System.out.println(x == y);

        System.out.println(x.equals(y));


    }
}
