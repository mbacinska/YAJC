package org.mbacinska;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {

        Set<String> dataSet = new HashSet<>();
        dataSet.add("Ala");
        dataSet.add("ma");
        dataSet.add("asa");
        dataSet.add("asa");//taki juz jest, wiec go nie dokladamy
        //dataSet.add(null); //mozna wstawic nulla; do TreeSetu już nie

        System.out.println("HashSet: " +dataSet);



        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(7);
        numbers.add(11);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        System.out.println("HashSet: "+ numbers);


        Set<String> dataSet2 = new TreeSet<>();
        dataSet2.add("ala");
        dataSet2.add("ma");
        dataSet2.add("asa");
        dataSet2.add("asa");
       // dataSet2.add(null); --->  throws exception
        System.out.println("TreeSet: " +dataSet2);
    }
}
