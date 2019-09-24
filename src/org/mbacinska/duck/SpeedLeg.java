package org.mbacinska.duck;

public class SpeedLeg extends Leg {

    public SpeedLeg(String name) {
        super(name);
    }

    @Override
    void go() {
        System.out.println("Ziuuuuuuuuu");
    }
}
