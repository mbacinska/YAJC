package org.mbacinska;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOfLists {

    public static void main(String[] args) {

        List<List<String>> listOfList = new ArrayList<>();

        for (int counter = 0; counter < 10; counter++) {
            listOfList.add(new LinkedList<>());
            listOfList.add(new ArrayList<>());
        }
    }
}
