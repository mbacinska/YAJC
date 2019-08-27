package com.mbacinska;

public class Hammer {

    private int weight;
    private String colour;

//constructor overloading
//    public Hammer() {
//        this.weight = 0;
//        this.colour = "Unknown";
//    }

    public Hammer(String colour) {
        this.weight = 10;
        this.colour = colour;
    }

    public Hammer(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public void hammers(String what) {
        System.out.println(colour + " hammer hammers " + what); // w domyśle: this.colour
        //System.out.println(getColour()+ " hammer hammers " +what);
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
