package org.mbacinska;

import java.util.Arrays;

public class Loops {

    public static void main(String[] args) {

        int[][] data = new int[10][20];

        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < data[rowIndex].length; columnIndex++) {
                data[rowIndex][columnIndex] =1500;

                //System.out.println(Arrays.toString(data[rowIndex]));
            }



        }

//        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
//            int[] row = data[rowIndex];
//            for (int columnIndex = 0; columnIndex < row.length; columnIndex++) {
//                row[columnIndex]=1500;
//            }
//
//        }
    }
}
