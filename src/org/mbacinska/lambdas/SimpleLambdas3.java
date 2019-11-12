package org.mbacinska.lambdas;

import org.junit.Test;

import java.util.Comparator;

public class SimpleLambdas3 {

    @Test
    public void testA() {

//        Comparator<Integer> intComparator= new Comparator<Integer>() {
//            @Override
//            public int compare(Integer lhs, Integer rhs) {
//                return lhs.compareTo(rhs);
//            }
//        };

        //Comparator<Integer> intComparator = (lhs, rhs) -> lhs.compareTo(rhs);
        //intComparator to obiekt klasy anonimowej(komparator wie jak sie ona nazywa),
        //ktory implementuje interfejs Comparator i implementuje w ciele lambdy funkcje z interfejsu Comparator

        //lambda replaced with method reference
        Comparator<Integer> intComparator = Integer::compareTo;

        Monitor.monitor(intComparator);
    }
}
