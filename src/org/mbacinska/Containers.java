package org.mbacinska;

import javafx.util.Pair;

public class Containers {

    public static void main(String[] args) {


      //Pair<key,value>
        Pair<String,Integer> data = new Pair<>("ala",10);
        System.out.println(data.getKey());
        System.out.println(data.getValue());
    }
}
