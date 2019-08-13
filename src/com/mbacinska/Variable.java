package com.mbacinska;

public class Variable {

    public static void main(String[] args) {
        int a = 10; //inicializujmy zmienna jednoczesnie z deklaracja
        System.out.println(a);
        int b = 20, c = 30; //tak nie robimy
        int d = 40;
        d = d + 3;
        d += 3;
    }

}
