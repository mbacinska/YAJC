package org.mbacinska.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckRunner {

    public static void main(String[] args) {

        Fuel fuel = new Fuel(100.0);
        fuel.addFuel(100.0);

        List<AbstractLeg> legs = new ArrayList<>();
//        Leg right =  new Leg("Right"); //nie ma potrzeby tworzyc osobnej zmiennej i jej przetrzymywac; potrzebujemy jej uzyc i zapomniec
//        legs.add(right);
        legs.add(new Leg("Right"));
        Duck duck = new Duck(legs);
        duck.addLeg(new Leg("Additional"));
        //duck.go();
        duck.addLeg(new MechaLeg("Mecha Leg", fuel));
        duck.addLeg(new SpeedLeg("Speed Leg"));
        duck.go();


    }

}
