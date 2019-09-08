package com.geometry2D;

import java.util.Objects;

public class Circle extends Shape implements HasLength, HasArea {

    private final Coordinates coordinate;
    private final double radius;


    public Circle(String name, Coordinates coordinate, double radius) {
        super("Circle");
        this.coordinate = coordinate;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "coordinate=" + coordinate +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return circle.radius == radius &&
                Objects.equals(coordinate, circle.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate, radius);
    }
}
