package org.mbacinska.lambdas;

import java.lang.reflect.Method;

public class Monitor {

    public static void monitor(Object obj) {
        if (obj == null) {
            System.out.println("null");
            return;
        } else {
            System.out.println(obj.getClass().getName());
            for (Method item : obj.getClass().getDeclaredMethods()) {
                System.out.println("Method: " + item);

            }

        }
    }

    public static void main(String[] args) {
        Object obj = new Object();
        monitor(obj);
    }
}
