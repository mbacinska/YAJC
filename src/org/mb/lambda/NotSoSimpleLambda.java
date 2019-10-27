package org.mb.lambda;

public class NotSoSimpleLambda {


    public interface Goable{

        void go();
    }

    static public String anymethod(){
        return "any";
    }

    static String thing = "nothing";

    Goable goAnonim = new Goable() {
        @Override
        public void go() {
            System.out.println("Ala");
        }
    };

    String s1 = "__________";
    Goable goVariable = ()-> System.out.println("ala"+s1+thing+anymethod());
    //thing = "other";
    //goVariable.go();

}

