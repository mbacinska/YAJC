package com.mbacinska;

public class AbstractHammer {

    //nie chcemy tworzyc instancji tej klasy

    private HammerPiece handle;
    private HammerPiece head;


    public AbstractHammer(HammerPiece handle, HammerPiece head) {
        this.handle = handle;
        this.head = head;
    }

    public AbstractHammer(String handleColour, int handleWeight, String headColour, int headWeight) {
        this.handle = new HammerPiece(handleColour, handleWeight);
        this.head = new HammerPiece(headColour, headWeight);
    }

    public void setHandleWeight(int newWeight) {
        handle.setWeight(newWeight);
    }


    public int getWeight() {
        return handle.getWeight() + head.getWeight();
    }
}