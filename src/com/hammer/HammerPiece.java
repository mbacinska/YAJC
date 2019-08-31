package com.hammer;

public class HammerPiece {

    private final String colour;
    private final int weight;

    public HammerPiece(String colour, int weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }
}
