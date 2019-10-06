package org.mbacinska.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckRunnerFactory {


    public static AbstractLeg legFactory(String what, String name, Fuel fuel) {
        if (what.equals("leg")) {
            return new Leg(name);
        }
        if (what.equals("speed")) {
            return new SpeedLeg(name);
        }
        if (what.equals("mecha")) {
            return new MechaLeg(name, fuel);
        }
        throw new RuntimeException();
    }

    public static void main(String[] args) {

        Fuel fuel = new Fuel(80.0);
        fuel.addFuel(80.0);

        List<AbstractLeg> legs= new ArrayList<>();

        String kind = "leg";

        for (int i = 0; i < 100; i++) {

            legs.add(legFactory(kind,"from factory",fuel));

        }

        Duck duck = new Duck(legs);

        duck.go();
    }
}
