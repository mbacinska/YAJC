package com.trainings;

public class HammerPiece implements Weightable {
    private final String colour;
    private int weight;

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

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
