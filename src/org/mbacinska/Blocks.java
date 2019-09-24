package org.mbacinska;

public class Blocks {

    public static void main(String[] args) {

        int a1 = 7;

        {
            a1 = 10;

            //tu zaczyna zycie s1
            String s1 = "ala";
            //tu konczy zycie s1
        }


        int s1 = 36; //mozna bo s1 juz tu nie istnieje

        System.out.println("a1: " + a1); // a1=10
    }
}
