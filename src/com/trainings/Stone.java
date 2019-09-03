package com.trainings;

public class Stone implements Weightable {

    private int weight;

    public Stone(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
