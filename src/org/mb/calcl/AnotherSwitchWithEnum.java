package org.mb.calcl;

public class AnotherSwitchWithEnum {

    public static void main(String[] args) throws Exception {

        Selections input = Selections.ANYTHING;

        Selections input2 = Selections.valueOf("A");
        // System.out.println(input2);

        // Selections input3 = Selections.valueOf("AB");
        //System.out.println(input3);//java.lang.IllegalArgumentException: No enum constant org.mb.calcl

        Selections input6 = Selections.values()[0];
        System.out.println("values[0] = " + input6);

        for (Selections element : Selections.values()) {
            System.out.println(element);
        }

        if (input == Selections.ANYTHING) {
            System.out.println("Inside if statement");
        }

        if (Selections.NOTHING.compareTo(Selections.ANYTHING) < 0) {
            System.out.println("less than");
        }


        switch (input) {
            case NOTHING: {
                System.out.println("Nothing interesting");
                break;
            }
            case ANYTHING: {
                System.out.println("Any thing");
            }
            default: {
                throw new Exception();
            }
        }

    }

    private enum Selections {
        NOTHING,
        ANYTHING,
        A
    }

}

