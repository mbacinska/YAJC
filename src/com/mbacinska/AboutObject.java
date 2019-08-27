package com.mbacinska;

public class AboutObject {


    public static void main(String[] args) {

        MyObject object = new MyObject();
        System.out.println("My object looks like: " + object.toString());
        System.out.println("My object looks like: " + object);// object == object.toString()

//        Object object = new Object();
//        System.out.println(object.toString());
//        System.out.println("My object"+object);
    }
}
