package com.geometry2D;

import java.util.Objects;

public class Point extends Shape implements HasArea {


    private final Coordinates coordinate;


    public Point(Coordinates coordinate) {
        super("Point");
        this.coordinate = coordinate;
    }

    public double getCoordinateX() {
        return coordinate.getX();
    }


    public double getCoordinateY() {
        return coordinate.getY();
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Point{" +
                "coordinate=" + coordinate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(coordinate, point.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }
}
