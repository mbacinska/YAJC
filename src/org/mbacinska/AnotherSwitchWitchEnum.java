package org.mbacinska;

public class AnotherSwitchWitchEnum {

    public static void main(String[] args) throws Exception {

        Selections input = Selections.NOTHING;

        for (Selections element: Selections.values() ){
            System.out.println(element);
        }

        System.out.println(Selections.valueOf("ANYTHING"));
        //porownanie enumów, nie potrzeba equals()
        // if(input==elections.ANYTHING){}

        if(Selections.NOTHING.compareTo(Selections.ANYTHING) <0){
            System.out.println("Less than");
        }

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


    private enum Selections{

        //to sa identyfiaktory (final) i musza byc rozne od siebie; kolejnosc jest dokladnie taka, jak napisano
        NOTHING, //ma mniejsza wartosc
        ANYTHING //niz ten
    }


}
