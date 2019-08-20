package com.mbacinska;

public class Operators {

    public static void main(String[] args) {
        int val = 10;
        val++;
        System.out.println(val);

//        int val2 =10;
//        int result = val2++;
//        System.out.println(val);
//        System.out.println(result);

        int val2 = 10;
        val2++; //val2+=1
        System.out.println(val2);
        System.out.println((val--) - (-1));

        int val3 = 10;
        int secondOne = 0;
        if (val3 > 11) {
            secondOne = val3 * 2;
        } else {
            secondOne = val3 - 1;
        }

        int anotherOne = val3 > 11 ? val3 * 2 : val3 - 1; //ternary operator
    }
}
