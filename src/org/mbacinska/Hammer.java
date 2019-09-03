package org.mbacinska;

public class Hammer extends AbstractHammer {

    public Hammer(HammerPiece handle, HammerPiece head) {
        super(handle, head);
    }

    @Override
    public void hit() {
        System.out.println("Hammer hits");
    }

    public void hammers (String what){
        System.out.println("Hammer hammers "+what);
    }
}
