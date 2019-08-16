package com.mbacinska;

public class FirstCheck {

    public static void main(String[] args) {

        System.out.println("Yet Another Camp in Java. Welcome!");
        System.out.println("Max integer number is:" +Integer.MAX_VALUE);
        System.out.println("Min integer number is:" +Integer.MIN_VALUE);
        int overflowInt = Integer.MAX_VALUE+1000;
        System.out.println("Overflow: " +overflowInt);
        int underflowInt = Integer.MIN_VALUE - 256784;
        System.out.println("Underflow: "+underflowInt);
        byte byteVarMax = Byte.MAX_VALUE;
        System.out.println("Byte max value is: "+byteVarMax);
        byteVarMax-=3;
        System.out.println("Byte max value -3 equals:"+byteVarMax);
        byteVarMax += 10;
        System.out.println("Byte max value overflowed :"+byteVarMax);

        System.out.println(0.0/0.0); //tylko dla l.zmiennoprzecinkowych
       // System.out.println(0/0);  //error
        System.out.println(-0.0<+0.0);
        System.out.println(1.0 + 1); //konwersja do float
    }
}
