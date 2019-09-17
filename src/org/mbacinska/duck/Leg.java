package org.mbacinska.duck;

public class Leg {

    protected final String name;



    public Leg(String name) {
        this.name = name;
    }

    void go(){
        System.out.println("Clap Clap!! " +name);
    }

}
