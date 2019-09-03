package com.trainings;

public class Cat implements Weightable {

    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
