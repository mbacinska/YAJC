package com.mbacinska;

public class HammerMain {

    public static void main(String[] args) {

//        Hammer hammer = new Hammer();
//        System.out.println(hammer.getColour());
//        System.out.println(hammer.getWeight());

        Hammer hammer = new Hammer(500,"Yellow");
        hammer.hammers("nails");
        System.out.println(hammer.getColour());

        Hammer hammer1 = new Hammer(200,"Pink");
        hammer1.hammers(" two nails");

        HammerWithRemoval hammerWithRemoval = new HammerWithRemoval("red");
        hammerWithRemoval.remove();
        System.out.println(hammerWithRemoval.getWeight());
        System.out.println(hammerWithRemoval.getColour());
        hammerWithRemoval.hammers("nails");
        hammerWithRemoval.hammers("nails & something");




    }
}
