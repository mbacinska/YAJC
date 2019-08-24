package com.mbacinska;


public class Surprise {


    public static boolean first() {
        System.out.println("first");
        return false;
    }

    public static boolean second() {
        System.out.println("second");
        return true;
    }

    public static void main(String[] args) {

        System.out.println(first() && second()); //jesli najpierw jest false, to drugiego operanda juz nie sprawdza, bo calosc jest false

        boolean lhs = false;
        boolean rhs = true;
        boolean result = isResult(lhs, rhs);
        System.out.println(result);

        System.out.println(1500_100_900);
        System.out.println(123_45_55_9876L);
    }

    private static boolean isResult(boolean lhs, boolean rhs) {
        return lhs && rhs;
    }


}
