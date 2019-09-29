package org.mbacinska;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void main(String[] args) {


            System.out.println(countObjects(makeObjects(120)));

    }


    public static List<Simple> makeObjects(int N) {

        List<Simple> severalSimpleObjects = new ArrayList<>();


        try {

            for (int number = 0; number < N; number++) {
                try {
                    Simple simple = new Simple(number);
                    severalSimpleObjects.add(simple);
                    System.out.println(" Adding simple object:" +number);
                } catch (OddArgumentException exception) {
                    System.out.println("Throwing OddArgumentException and do not break the loop");
                }


            }

        } catch (NoAvailableObjectException exception) {
            System.out.println("Max number of Simple objects reached");

        }


        return severalSimpleObjects;
    }


    public static int countObjects(List<Simple> severalSimpleObjects) {
        int result = 0;
        for (Simple element : severalSimpleObjects) {
            result += element.getValue();
        }
        return result;
    }
}
