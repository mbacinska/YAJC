package org.mbacinska.duck;

public class Leg extends AbstractLeg {


    public Leg(String name) {
        super(name);
    }

    @Override
    void go() {
        System.out.println("Clap Clap!! " + name);
    }

}
