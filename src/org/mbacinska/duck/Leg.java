package org.mbacinska.duck;

public class Leg extends AbstractLeg {

    public Leg(String name) {
        super(name);
    }

    void go(){
        System.out.println("Clap Clap!! " +name);
    }

}
