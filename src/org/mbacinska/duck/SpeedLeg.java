package org.mbacinska.duck;

public class SpeedLeg extends AbstractLeg {


    public SpeedLeg(String name) {
        super(name);
    }


    @Override
    void go() {
        System.out.println("Ziuuuuu!!");
    }
}
