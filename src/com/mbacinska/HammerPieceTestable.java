package com.mbacinska;

public class HammerPieceTestable extends HammerPiece {

    public HammerPieceTestable(String colour, int weight) {
        super(colour, weight);
        weightCounter = 0;
    }
    private int weightCounter;

    //DEKORATOR
    @Override
    public int getWeight() {
        weightCounter++;//zlicza wystapienia
        return super.getWeight();
    }

    public int getWeightCounter() {
        return weightCounter;
    }
}
