package org.mbacinska;

public class SwapIntegers {

    public static void main(String[] args) {

        int a = 7;
        int b = 10;

//        int savedA = a;
//        a = b;
//        b = savedA;
//
//        System.out.println(a);
//        System.out.println(b);


        //alternative solution; dluzsze ale bardziej czytelne

        int savedA = a;
        int savedB = b;
        a = savedB;
        b = savedA;
    }
}
