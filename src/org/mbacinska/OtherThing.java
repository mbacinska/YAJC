package org.mbacinska;

public class OtherThing {

    private final String toBePrinted = "other thing";

    public OtherThing() {
    }

    public String getToBePrinted() {
        return toBePrinted;
    }

    public static void main(String[] args) {

        OtherThing otherThing = new OtherThing();
        System.out.println(otherThing.getToBePrinted());
    }
}
