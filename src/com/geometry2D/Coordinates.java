package com.geometry2D;

import java.util.Objects;

public class Coordinates {

    private final double x;
    private final double y;


    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double distanceTo(Point anotherPoint) {
        return Math.sqrt(Math.pow(x - anotherPoint.getCoordinateX(), 2) + Math.pow(y - anotherPoint.getCoordinateY(), 2));
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Coordinates translate(double deltaX, double deltaY) {
        return new Coordinates(x + deltaX, y + deltaY);
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinates that = (Coordinates) o;
        return that.x == x &&
                that.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
