package org.mbacinska;

import java.util.ArrayList;
import java.util.List;

public class InstanceJava2 {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        B b = new B();

        A a = new A();

        a.a();

        if (a instanceof B) {

            B c1 = (B) a;
            c1.a();
            c1.b();
        }else{
            System.out.println("Nothing happens");
        }

    }

    static class A {
        public void a() {
            System.out.println("I am a()");
        }
    }

    static class B extends A {
        public void b() {
            System.out.println("I am b()");
        }
    }
}
