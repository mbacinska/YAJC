package org.mbacinska;

import java.util.Arrays;

public class Homework05_task1 {

    private static final int n = 10 ;
    private static int[] data = new int[n];


    public static void main(String[] args) {


        task1a();
        task1b();
        int[] data = task1c();
        task1d(data);


    }


    public static void task1a() {


        for (int i = 0; i < data.length; i++) {

            data[i] = 7;

        }

        System.out.println(Arrays.toString(data));
    }

    public static int task1b() {

        int sum = 0;


        for (int i = 0; i < data.length; i++) {

            sum += data[i];

        }

        System.out.println("Sum of table elements = " +sum);
        return sum;
    }

    public static int[] task1c() {

        for (int i = 0; i < data.length; i++) {

            data[i] = i;
            System.out.print(data[i]+"\t");

        }
        return data;

    }


    public static void task1d(int[] data) {


        for (int i = 0, i1 = data.length - 1; i < data.length; i++, i1--) {

            data[i1] = data[i];
        }

        System.out.println(Arrays.toString(data));
    }
}
