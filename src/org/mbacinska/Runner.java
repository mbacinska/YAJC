package org.mbacinska;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {



        Integer a = null;
        if (a.equals(11)) { //'a' nie ma niczego, nawet metody equals() bo jest nullem
        }
    }

    static public List<Integer> getSomeList(int N) {

        if (N < 3 || N > 5) {

        }
        return new ArrayList<>(N);
    }
}
