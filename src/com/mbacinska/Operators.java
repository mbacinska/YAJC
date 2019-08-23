package com.mbacinska;

public class Operators {


//    public static void main1(String[] args) {
//
////        int val = 10;
////        int result = val ++;
//
//        int val = 10;
////        val++;
//        ++val;
////        val += 1;
//        int result = val;
//
//
//        System.out.println(val);
//        System.out.println(result);
//
//        System.out.println(val++ + +1);
//    }


    public static void main(String[] args) {

        int value = 13;

        int secondOne = 0;
//
//        if (value > 11) {
//            secondOne = value * 2;
//        } else {
//            secondOne = value - 1;
//        }

        secondOne=value>11?value*2:value-1;

        System.out.println("secondOne = " +secondOne);

        int anotherValue = value > 11
                ? value * 2
                : value - 1;


    }
}