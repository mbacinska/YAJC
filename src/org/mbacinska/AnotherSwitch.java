package org.mbacinska;

public class AnotherSwitch {

    private static final int NOTHING = 0; //wartosci musza byc unikalne
    private static final int ANYTHING = 1;

    public static void main(String[] args) throws Exception {

        int input = 1;

        switch (input) {

            case NOTHING: {
                System.out.println("Nothing interesting");
                break;
            }
            case ANYTHING: {
                System.out.println("Any thing");
                break;
            }
            default: {
                throw new Exception();
            }
        }
    }
}

