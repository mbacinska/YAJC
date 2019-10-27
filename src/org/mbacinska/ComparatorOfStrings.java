package org.mbacinska;

import java.util.Arrays;
import java.util.List;

public class ComparatorOfStrings {

    static List<String> cities = Arrays.asList(
            "Milan",
            "London",
            "San Francisco",
            "Tokyo",
            "New Delhi"
    );

    public static void main(String[] args) {

        System.out.println(cities);

        cities.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(cities);


    }
}
