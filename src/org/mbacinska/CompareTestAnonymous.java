package org.mbacinska;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTestAnonymous {

    static class DataSorter implements Comparator<Integer> {

        @Override
        public int compare(Integer lhs, Integer rhs) {
            //return Math.abs(lhs) % 2 -Math.abs(rhs) % 2;//sortuje parzyste, nieparzyste
            return lhs - rhs;
        }
    }

    public static void main(String[] args) {

        List data = Arrays.asList(-1, 5, 4, -9, 2, 7, 6);
        System.out.println("unsorted: " + data);
        Collections.sort(data, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });
        System.out.println(data);
    }
}
