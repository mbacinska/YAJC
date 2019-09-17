package org.mbacinska;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<String> dataSet = new HashSet<>();
        dataSet.add("Ala");
        dataSet.add("ma");
        dataSet.add("asa");
        dataSet.add("asa");//taki juz jest, wiec go nie dokladamy
        dataSet.add(null); //mozna wstawic nulla; do TreeSetu już nie

        System.out.println(dataSet);
    }
}
