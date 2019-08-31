package com.hammer;

public class Hammer extends AbstractHammer {

    public Hammer(HammerPiece handle, HammerPiece head) {
        super(handle, head);
    }

    public void hammers(String what) {

        System.out.println(getColour() + " hammer hammers " + what);
    }

    public static void main(String[] args) {

        HammerPiece handle1 = new HammerPiece("Yellow", 2);
        HammerPiece head1 = new HammerPiece("Black", 8);

        Hammer hammer = new Hammer(handle1, head1);
        hammer.hammers("nails");
    }
}
