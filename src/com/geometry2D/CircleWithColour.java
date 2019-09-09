package com.geometry2D;

import java.util.Objects;

public class CircleWithColour extends Circle implements Colorable {

    private String colour;

    public CircleWithColour(Coordinates coordinate, double radius, String colour) {
        super(coordinate, radius);
        this.colour = colour;
    }


    @Override
    public String getColour() {
        return colour;
    }


    @Override
    public String toString() {
        return "CircleWithColour{" +
                "colour='" + colour + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CircleWithColour that = (CircleWithColour) o;
        return Objects.equals(colour, that.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colour);
    }

    public static void main(String[] args) {

        Coordinates coordinate = new Coordinates(1.0,3.0);

        CircleWithColour circleWithColour = new CircleWithColour(coordinate,5,"yellow");

        System.out.println(circleWithColour.getName());

        System.out.println(circleWithColour.getColour());

        System.out.println(circleWithColour.getArea());

        System.out.println(circleWithColour.getLength());

        System.out.println(circleWithColour.toString());
    }
}
