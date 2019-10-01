package org.mbacinska;

public class SimpleSwitch {

    public static void main(String[] args) throws Exception {

        String input = "something";

        switch (input) {

            case "nothing": {
                System.out.println("Nothing interesting");
                break;
            }
            case "somethin": {
                System.out.println("Any thing");
                break;
            }
            default:
            {
                throw new Exception();
            }
        }
    }
}
