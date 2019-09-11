package org.mb.arrays;

public class ExampleArrays {

    static int sumArguments(int ...arg){
        int result = arg[0];
        System.out.println(arg.length);
        System.out.println("-----------"+arg[0]);
        System.out.println("-----------"+arg[1]);
        return 0;
    }

    public static void main(String[] args) {

        String[] words; //deklaracja tablicy


        String[] anotherWords = new String[5]; //tablica 5 -cio elementowa; nie mozna zmienić jej długości

        //String fifth = anotherWords[5]; ERROR: ArrayIndexOutOfBoundsException

        System.out.println(anotherWords.length); //pole 'length' które jest final

        System.out.println(anotherWords[2]);

        anotherWords[2] = "Second";

        System.out.println(anotherWords[2]);

        String[] afterClone = anotherWords.clone();

        System.out.println(afterClone.length);

        System.out.println(afterClone[2]);

        anotherWords[1] = "First";

        System.out.println(anotherWords[1]);

        System.out.println(afterClone[1]);

        System.out.println(sumArguments(1,3,5));
    }
}
