package org.mbacinska;

public class Anything {

    private final String toBePrinted = " anything";

    public Anything() {
    }

    public String getToBePrinted() {
        return toBePrinted;
    }

    public static void main(String[] args) {

        Anything anything = new Anything();
        System.out.println(anything.getToBePrinted());
    }
}
