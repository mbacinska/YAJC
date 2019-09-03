package com.mbacinska;

public class HammerMan {

    public static void main(String[] args) {
        AbstractHammer hammer = new AbstractHammer("black", 15, "yellow", 7);
        hammer.setHandleWeight(50);
        HammerPiece handle = new HammerPiece("black", 15);
        HammerPiece head = new HammerPiece("yellow", 7);

        AbstractHammer hammer1 = new AbstractHammer(handle, head);
        hammer1.setHandleWeight(50);
        System.out.println(handle.getWeight());

        //tak jest źle
        AbstractHammer hammer2 = new AbstractHammer(
                new HammerPiece("black", 15),
                new HammerPiece("yellow", 7));

    }
}
