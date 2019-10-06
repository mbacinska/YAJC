package org.mbacinska.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckFactoryWithEnum {


    public static AbstractLeg legFactory(LegKind what, String name, Fuel fuel) {

        if (what == LegKind.SIMPLE) {

            return new Leg(name);

        } else if (what == LegKind.SPEEDY) {

            return new SpeedLeg(name);

        } else if (what == LegKind.MECHA) {

            return new MechaLeg(name, fuel);

        }
        throw new RuntimeException();

    }


    public static AbstractLeg legFactory2(LegKind what, String name, Fuel fuel) {

        switch (what) {

            case SIMPLE:
                return new Leg(name);

            case SPEEDY:
                return new SpeedLeg(name);
            case MECHA:
                return new MechaLeg(name, fuel);

            default:
                throw new RuntimeException();


        }

    }

    public static void main(String[] args) {
        Fuel fuel = new Fuel(100.);
        fuel.addFuel(100.);
        List<AbstractLeg> legs = new ArrayList<>();

        LegKind kind = LegKind.SIMPLE;
        for (int index = 0; index < 100; index++) {
            legs.add(
                    legFactory(kind, "from factory", fuel)
            );
        }

        Duck duck = new Duck(legs);

        duck.go();
    }

}
