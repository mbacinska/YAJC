package com.mbacinska;

public class HammerWithRemoval extends Hammer {


    public HammerWithRemoval(String colour) {
        super(colour);
        System.out.println("Constructor HammerWithRemoval ");
    }

    public HammerWithRemoval(int weight, String colour) {
        super(weight, colour);
        System.out.println("Constructor HammerWithRemoval ");
    }

    void remove() {
        System.out.println("Removing something");
    }

    @Override
    public void hammers(String what) {
        System.out.println(getColour() + " removal tool hammers " + what);
        super.hammers(what);
    }

}
