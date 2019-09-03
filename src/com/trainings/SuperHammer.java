package com.trainings;

public class SuperHammer extends AbstractHammer {

    public SuperHammer(HammerPiece handle, HammerPiece head) {
        super(handle, head);
    }

    @Override
    public void hit() {
        System.out.println("SuperHammer hits");
    }

    public void hammers (String what){

        System.out.println("SuperHammer hammers "+what);
    }
}
