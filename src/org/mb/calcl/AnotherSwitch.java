package org.mb.calcl;

public class AnotherSwitch {

    private static final int NOTHING = 10;
    private static final int ANYTHING = 21;

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
            case 3: {
                System.out.println("Any 3");
                break;
            }
            default: {
                throw new Exception();
            }


        }
    }
}
