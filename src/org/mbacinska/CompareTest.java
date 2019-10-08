package org.mbacinska;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTest {


    public static void main(String[] args) {

        List data = Arrays.asList(-1, 5, -9, 2, 6);
        System.out.println("unsorted: " + data);
        Collections.sort(data);//optymalne wbudowane sortowanie
        System.out.println("sorted:  " + data);
        Collections.sort(data, new DataSorter());
        System.out.println("sorted:  " + data);
        Collections.sort(data, new DataSorter().reversed());
        System.out.println("reversed:  " + data);
    }

    static class DataSorter implements Comparator<Integer> {

        @Override
        public int compare(Integer lhs, Integer rhs) {
            //return Math.abs(lhs) % 2 -Math.abs(rhs) % 2;//sortuje parzyste, nieparzyste
            return lhs - rhs;
        }
    }
}
