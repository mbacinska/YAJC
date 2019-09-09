package com.geometry2D;

import java.util.Objects;

public class Torus extends Shape implements HasArea, HasLength {

    private Coordinates coordinate;
    private double radius1;
    private double radius2;

    public Torus(Coordinates coordinate, double radius1, double radius2) {
        super("Torus");
        this.coordinate = coordinate;
        this.radius1 = radius1;
        this.radius2 = radius2;
    }


    //Math.abs
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius1 - radius2, 2.0);
    }


    //Math.max

    @Override
    public double getLength() {
        double max = Math.max(radius1, radius2);
        return 2 * Math.PI * max;
    }


//    @Override
//    public double getLength() {
//        if (radius1 >= radius2) {
//            return 2 * Math.PI * radius1;
//        } else
//            return 2 * Math.PI * radius2;
//
//    }

    @Override
    public String toString() {
        return "Torus{" +
                "coordinate=" + coordinate +
                ", radius1=" + radius1 +
                ", radius2=" + radius2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Torus torus = (Torus) o;
        return torus.radius1 == radius1 &&
                torus.radius2 == radius2 &&
                Objects.equals(coordinate, torus.coordinate);
    }



    @Override
    public int hashCode() {
        return Objects.hash(coordinate, radius1, radius2);
    }

    public static void main(String[] args) {

        Coordinates coordinate = new Coordinates(1,1);

        Torus torus = new Torus(coordinate,2,3);

        System.out.println(torus.getName());

        System.out.println(torus.toString());

        System.out.println(torus.radius1);

        System.out.println(torus.radius2);

        System.out.println(torus.getArea());

        System.out.println(torus.getLength());



    }
}
