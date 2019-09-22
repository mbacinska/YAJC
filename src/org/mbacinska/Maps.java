package org.mbacinska;

import java.util.HashMap;
import java.util.Map;

public class Maps {


    public static void main(String[] args) {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("ala", 40);
        dict.put("ala", 50);
        dict.put("ola", 50);
        System.out.println(dict);
    }

}
