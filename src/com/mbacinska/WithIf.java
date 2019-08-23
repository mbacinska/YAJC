package com.mbacinska;

public class WithIf {

    static public int test01(int value) {
        if (value >= 0) {
            System.out.println("Value greater than 0");
            return 2 * value;

        } else {
            System.out.println("Value less than 0");
            return 0;
        }
    }

    static public int test02(int value) {
        if (value < 0) {
//      if (!(value >= 0)) {
            return 0;
        }
        System.out.println("Value greater than 0");
        return 2 * value;
    }

    static public int test03(int lhs, int rhs) {
        if ((lhs < 0) && (rhs >= 0)) {
            return 0;
        }
        System.out.println("Value greater than 0");
        return 2 * lhs;
    }

    static public int test03a(int lhs, int rhs) {
        if ((lhs >= 0) || (rhs < 0)) {
            System.out.println("Value greater than 0");
            return 2 * lhs;
        }
        return 0;
    }

    public static void main(String[] args) {

        int value = 5;

        System.out.println(test01(value));

      //  value = -100;
      //  System.out.println(test01(value));

        if (value > 11) {
            System.out.println("More than 11");
        } else if (value < 6) {
            System.out.println("Not more than six");
        }
        System.out.println("Really");
    }
}


