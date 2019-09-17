package org.mbacinska.duck;

import java.util.List;

public class Duck {

   private List<Leg> legs;

    public Duck(List<Leg> legs) {
        this.legs = legs;
    }

    public void addLeg(Leg newLeg){

        legs.add(newLeg);
    }

    public void go(){

        for(Leg leg: legs){

            leg.go();
        }
    }


}

