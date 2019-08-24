package com.mbacinska;

public class Ternary {

    public static void main(String[] args) {

        int result = ternary();
        System.out.println(result);

    }

    static int ternary() {

        return
                (8 + 7) < 6 ? (5 * 4) : (3 / 2);
    }
}

