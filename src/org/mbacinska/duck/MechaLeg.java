package org.mbacinska.duck;

public class MechaLeg extends AbstractLeg {

    public final Double FUEL_USAGE = 80.;
    private final Fuel fuel;

    public MechaLeg(String name,Fuel fuel) {
        super(name);
        this.fuel = fuel;
    }

    @Override
    void go() {
        if (fuel.getFuel(FUEL_USAGE)) {
            System.out.println("Brum brum !! " + name);
        } else {
            System.out.println("szszszszsz " + name);
        }
    }
}
