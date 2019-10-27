package org.mb.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SimpleLambda {

    interface Goable {
        void go();
    }

    public static void main(String[] args) {

        Goable goAnonim = new Goable() {
            @Override
            public void go() {
                System.out.println("alal");
            }
        };

        Goable goVariable = () -> System.out.println("alal");
        goVariable.go();



        List<Integer> data = Arrays.asList(1, 5, 2, 11);

        // System.out.println(data);

        //using lambda to print out List elements
        data.forEach(integer -> System.out.println(integer));

//        data.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1-i2;
//            }
//        });

        data.sort((i1, i2) -> {
            System.out.println("inside comparator");
            return i1 - i2;

        });

        data.sort((i1, i2) -> i1 - i2);
        data.sort((i1, i2) -> {
            return i1 - i2;
        });

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return 0;
            }
        };

        System.out.println(data);
    }

}
