package com.hammer;

public class AbstractHammer {

    private HammerPiece handle;
    private HammerPiece head;

    public AbstractHammer(HammerPiece handle, HammerPiece head) {
        this.handle = handle;
        this.head = head;
    }


    public String getColour() {
        return handle.getColour() + "," + head.getColour();

    }

    public int getWeight() {

        return handle.getWeight() + head.getWeight();
    }

    public static void main(String[] args) {

        HammerPiece handle1 = new HammerPiece("Brown", 1);
        HammerPiece head1 = new HammerPiece("Black", 5);

        AbstractHammer abstractHammer = new AbstractHammer(handle1, head1);
        System.out.println(abstractHammer.getColour());
        System.out.println(abstractHammer.getWeight());
    }

}
