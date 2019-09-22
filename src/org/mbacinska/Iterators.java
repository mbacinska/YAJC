package org.mbacinska;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators {


    public static void main(String[] args) {

        List<Integer> dataList = new ArrayList<>();
        dataList.add(10);
        dataList.add(17);
        dataList.add(20);
        dataList.add(25);

       // System.out.println("Elements of List: " +dataList);





//        for (int index = 0; index < dataList.size(); index++) {  //dostep do zapisu elementow; mozna zmodyfikowac element o konkretnym indexie
//            System.out.println(dataList.get(index) + " ");
//        }





/*
        int sum = 0;
        System.out.print("Elements of List: ");
        for (Integer element : dataList) {
            System.out.print(element + " ");
            sum += element;
        }
        System.out.println();
       // System.out.println(dataList);
        System.out.println("sum of elements: " +sum);
*/



/*
        for (Integer element : dataList) { //dostep do odczytu elementow; bez możliwości dobrania sie do elementu pod konkretnym indexie

            System.out.print(element + " ");
            element += 1500;

        }

*/




//        Iterator<Integer> iterator = dataList.iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            System.out.print(element + " + ");
//       }




/*
        Iterator<Integer> iterator2 = dataList.iterator();
        while (iterator2.hasNext()) {
            Integer element = iterator2.next();
            System.out.print(element + " + ");
            if (element == 17 ) {
                iterator2.remove();
            }

        }
        System.out.println(dataList);
        */




        ListIterator<Integer> secondIterator = dataList.listIterator();
        while (secondIterator.hasNext()) {
            Integer element = secondIterator.next();
            System.out.print(element + " + ");
            secondIterator.set(1500);
//            if (element.equals(10)) {
//                secondIterator.add(1500100900);
//            }
        }
        System.out.println(dataList);


    }




}
