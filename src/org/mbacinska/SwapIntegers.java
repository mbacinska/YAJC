package org.mbacinska;

public class SwapIntegers {

    public static void main(String[] args) {

        int a = 7;
        int b = 10;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a: "+a);
        System.out.println("b: "+b);


        //alternative solution; dluzsze ale bardziej czytelne

//        int savedA = a;
//        int savedB = b;
//        a = savedB;
//        b = savedA;
    }
}
