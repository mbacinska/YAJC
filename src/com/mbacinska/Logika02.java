package com.mbacinska;

public class Logika02 {


    public static void main(String[] args) {

        boolean lhs = false;
        boolean rhs = false;

        System.out.println(!(lhs || rhs) == (!lhs && !rhs));
//        System.out.println(!(lhs || rhs));
//        System.out.println(!lhs && !rhs);

        System.out.println("********************************");
        lhs = false;
        rhs = true;

        System.out.println(!(lhs || rhs) == (!lhs && !rhs));
//        System.out.println(!(lhs || rhs));
//        System.out.println(!lhs && !rhs);

        System.out.println("********************************");

        lhs = true;
        rhs = true;

        System.out.println(!(lhs || rhs) == (!lhs && !rhs));
//        System.out.println(!(lhs || rhs));
//        System.out.println(!lhs && !rhs);

        System.out.println("********************************");

        lhs = true;
        rhs = false;

        System.out.println(!(lhs || rhs) == (!lhs && !rhs));
//        System.out.println(!(lhs || rhs));
//        System.out.println(!lhs && !rhs);

        System.out.println("********************************");

    }
}
