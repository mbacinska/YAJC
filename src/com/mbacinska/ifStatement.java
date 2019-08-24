package com.mbacinska;

public class ifStatement {

    public static void main(String[] args) {

        double result1 = sqrtWrapper1(16.0);
        System.out.println(result1);
        result1 = sqrtWrapper1(-16.0);
        System.out.println(result1);
        double result2 = sqrtWrapper2(64.0);
        System.out.println(result2);
        result2 = sqrtWrapper2(-64.0);
        System.out.println(result2);

    }

    static double sqrtWrapper1(double arg) {

        if (arg < 0) {
            return 0.0;
        }

        return Math.sqrt(arg);
    }

    static double sqrtWrapper2(double arg) {

        Double d = new Double(arg);

        if (d.isNaN()) {
            return 0.0;

        }
        return Math.sqrt(arg);

    }



}
