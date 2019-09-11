package org.mb.generic0;

public class GenericRunner {

    public static void main(String[] args) {

//        DtoExample.TwoIntegers twoIntegers = new DtoExample.TwoIntegers(3,7); //dobieramy sie do klasy wewnetrznej
//        System.out.println(twoIntegers.firstInt);
//        System.out.println(twoIntegers.secondInt);


        // po zrobieniu Object
        //DtoExample.TwoObjects twoObjects = new DtoExample.TwoObjects(3,7);
       // System.out.println(twoObjects.firstObject);
       // System.out.println(twoObjects.secondObject);


        DtoExample.TwoObjects twoObjects = new DtoExample.TwoObjects(3.5,7);
       // Integer first = (Integer)twoObjects.firstObject;//konieczny casting z Object na Integer
        System.out.println(twoObjects.firstObject);
        twoObjects.secondObject = twoObjects.firstObject;


        DtoExample.TwoWorkingThings<Integer> dto0 = new DtoExample.TwoWorkingThings<Integer>(3,5);
        Integer anotherFirst = dto0.firstElement;


    }

}
