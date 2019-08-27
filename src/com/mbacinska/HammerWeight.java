package com.mbacinska;

public class HammerWeight {

    boolean valid;
    int weight;

    public HammerWeight(int weight) {
        this.valid = true;
        this.weight = weight;
    }

    public HammerWeight() {
        this.valid = false;
        this.weight = 0;
    }

    String getWeight() {
        return valid ? Integer.toString(weight) : "weightless";
    }
}
