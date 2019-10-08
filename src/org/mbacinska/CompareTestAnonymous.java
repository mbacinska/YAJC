package org.mbacinska;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTestAnonymous {

    public static void main(String[] args) {

        List data = Arrays.asList(-1, 5, 4, -9, 2, 7, 6);
        System.out.println("unsorted: " + data);
        Collections.sort(data, new Comparator<Integer>() {
            @Override
            public int compare(Integer lhs, Integer rhs) {
                return lhs - rhs;
            }
        });
        System.out.println(data);
    }

    //CompareTestAnonymous$1


}
