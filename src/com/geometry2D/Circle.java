package com.geometry2D;

import java.util.Objects;

public class Circle extends Shape implements HasLength, HasArea {

    private final Coordinates coordinate;
    private final double radius;


    public Circle(Coordinates coordinate, double radius) {
        super("Circle");
        this.coordinate = coordinate;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Coordinates getCoordinate() {
        return coordinate;
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


    public static void main(String[] args) {

        Coordinates coordinate = new Coordinates(1.0,2.0);

        Circle circle = new Circle(coordinate, 3);

        System.out.println(circle.getName());

        System.out.println("circle.area: " +circle.getArea());

        System.out.println("circle.length: " +circle.getLength());

        System.out.println(circle.toString());
    }
}


