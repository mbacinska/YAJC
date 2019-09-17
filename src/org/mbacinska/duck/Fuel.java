package org.mbacinska.duck;

public class Fuel {

    private final Double capacity;
    private double fuelLevel;

    public Fuel(Double capacity) {
        this.capacity = capacity;
        fuelLevel = 0;
    }

    public void addFuel(Double additional){
        fuelLevel=+additional;
    }

    public Double getFuelAlternative(Double requested) {
        Double result = requested > fuelLevel
                ? fuelLevel
                : requested;
        fuelLevel -= result;
        return result;
    }

    public boolean getFuel(Double requested) {
        if (requested > fuelLevel) {
            return false;
        }
        fuelLevel -= requested;
        return true;


    }
}
