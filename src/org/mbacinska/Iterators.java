package org.mbacinska;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {


    public static void main(String[] args) {

        List<Integer> dataList = new ArrayList<>();
        dataList.add(10);
        dataList.add(15);
        dataList.add(20);
        dataList.add(25);

//        for (int index = 0; index < dataList.size(); index++) {  //dostep do zapisu elementow; mozna zmodyfikowac element o konkretnym indexie
//            System.out.println(dataList.get(index) + " ");
//        }

        for (Integer element : dataList) { //dostep do odczytu elementow; bez możliwości dobrania sie do elementu pod konkretnym indexie

            System.out.print(element + " ");
            element += 1500;
        }
         System.out.println(dataList);



        Iterator<Integer> iterator = dataList.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element + " + ");
        }

    }
}
