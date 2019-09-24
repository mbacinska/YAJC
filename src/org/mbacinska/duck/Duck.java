package org.mbacinska.duck;

import java.util.List;

public class Duck {

   private List<AbstractLeg> legs;

    public Duck(List<AbstractLeg> legs) {
        this.legs = legs;
    }

    public void addLeg(AbstractLeg newLeg){

        legs.add(newLeg);
    }

    public void go(){

        for(AbstractLeg leg: legs){

            leg.go();
        }
    }


}

