package org.mbacinska.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckRunnerFactory {

    public static AbstractLeg legFactory(String what, String name, Fuel fuel) {

        if (what.equals("noga")) {
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

        Fuel fuel = new Fuel(100.0);
        fuel.addFuel(100.0);
        List<AbstractLeg> legs = new ArrayList<>();

        String kind = "noga";
        for (int index = 0; index < 100; index++) {


            legs.add(
                    legFactory(kind, "from factory",fuel)
            );

        }

        Duck duck = new Duck(legs);
        duck.addLeg(new Leg("Additional"));
        //duck.go();
        duck.addLeg(new MechaLeg("Mecha Leg", fuel));
        duck.go();
    }
}
