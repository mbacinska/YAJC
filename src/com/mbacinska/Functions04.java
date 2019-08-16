package com.mbacinska;

public class Functions04 {


    public static void main(String[] args) {

        int result = sumTwoIntegers(3, 5);
        System.out.println(result);

        result = sumThreeIntegers(3, 5, 7);
        System.out.println(result);

        result = sumFourIntegers(3, 5, 7, 10);
        System.out.println(result);


        result = sumThreeIntegers2(3, 5, 7);
        System.out.println(result);


        result = sumFourIntegers2(3, 5, 7, 10);
        System.out.println(result);

    }


    public static int sumTwoIntegers(int arg1, int arg2) {

        return arg1 + arg2;

    }


    public static int sumThreeIntegers(int arg1, int arg2, int arg3) {

        return arg1 + arg2 + arg3;
    }

    public static int sumFourIntegers(int arg1, int arg2, int arg3, int arg4) {

        return arg1 + arg2 + arg3 + arg4;
    }


    public static int sumThreeIntegers2(int arg1, int arg2, int arg3) {

        return sumTwoIntegers(arg1, arg2) + arg3;
    }

    public static int sumFourIntegers2(int arg1, int arg2, int arg3, int arg4) {

        return sumTwoIntegers(arg1, arg2) + sumTwoIntegers(arg3, arg4);
    }

}
