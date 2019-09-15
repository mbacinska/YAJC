package org.mbacinska;


public class Homework05_task2 {

    private static final int n = 10;
    private static final int m = 10;
    private static int[][] data = new int[n][m];

    public static void main(String[] args) {

        task2b();
        printTable();
        System.out.println("Sum of table elements = "+task2c());


    }

    public static void task2b() {


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                data[i][j] = i * j;
            }

        }

    }

    public static void printTable() {


        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static int task2c() {

        int sum = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                sum += i * j;
            }

        }
        return sum;
    }
}



