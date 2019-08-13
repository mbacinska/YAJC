package com.mbacinska;

public class Functions {

    public static void main(String[] args) {

        float side = 2.0f;
        float result = square(side);
        System.out.println(result);
    }

    static float square(float x){
        return x*x; //zmienna lokalna funkcji square
    }
}
