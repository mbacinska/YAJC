package org.mbacinska;

public class Task02 {

    public static void main(String[] args) {



//        System.out.println(TriBool.OTHER);
//        System.out.println(TriBool.TRUE);
//        System.out.println(TriBool.FALSE);

        System.out.println(TriBool.OTHER.and(TriBool.OTHER));
        System.out.println(TriBool.TRUE.and(TriBool.TRUE));
        System.out.println(TriBool.OTHER.and(TriBool.FALSE));
    }
}
