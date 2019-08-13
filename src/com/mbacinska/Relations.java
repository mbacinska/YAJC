package com.mbacinska;

public class Relations {

    public static void main(String[] args) {

        boolean lhs = true;
        boolean rhs = false;
        System.out.println(lhs&&rhs); //operator logiczny
        System.out.println(lhs&rhs); //operator bitowy
        System.out.println(lhs||rhs); //operator logiczny
        System.out.println(lhs|rhs); //operator bitowy

        System.out.println(!(lhs&rhs)==!lhs||!rhs);
    }
}
