package org.mb.loops;

public class SimpleLoops {

    public static void main(String[] args) {

        System.out.println("Before");

        for (int index = 0; index < 6; index++) {

            System.out.println(index);

        }
        System.out.println("After");

// TAK MOŻNA I JEST ELEGANCKO : wszystkie zmienne sterujace petla sa zadeklarowane w jednym miejscu
//        for (int index1 = 0, index2 =1; index2<6;  index1++,index2+=2) {
//
//            System.out.println("****************" + index1+ " " +index2);
//
//        }
    }
}
