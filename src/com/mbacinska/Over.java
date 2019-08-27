package com.mbacinska;

public class Over {

    public static void main(String[] args) {
        System.out.println(addNumbers(7));
        System.out.println(addNumbers(7, 9));
        System.out.println(addNumbers(7, 9, 8));
        System.out.println(addNumbers(7, 9, 10L));
    }

    //method overloading
    static int addNumbers(int arg1) {
        System.out.println("addNumbers(int arg1)");
        return arg1;
    }

    static int addNumbers(int arg1, int arg2) {
        System.out.println("addNumbers(int arg1, int arg2)");
        return arg1 + arg2;
    }

    static int addNumbers(int arg1, int arg2, int arg3) {
        System.out.println("addNumbers(int arg1, int arg2,int arg3)");
        return arg1 + arg2 + arg3;
    }

    static long addNumbers(int arg1, int arg2, long arg3) {
        System.out.println("addNumbers(int arg1, int arg2,int arg3)");
        return arg1 + arg2 + arg3;
    }

    //metody o dowolnej liczbie argumentów
    static void addAnyNumbers(int ... arg){}
    static void addAnyNumbers(boolean b,long value, int arg0, int ... arg){} // int ...arg musi byc zawsze na końcu
}
