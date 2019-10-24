package org.mbacinska;

public class InstanceJava {


    static  class A{

    }

    static class B extends A{

    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        System.out.println(a instanceof A);
        System.out.println(b instanceof B);
        System.out.println(a instanceof B);
        System.out.println(b instanceof A);

        System.out.println(b.getClass().equals(A.class));
        System.out.println(b.getClass().equals(B.class));
    }

}
