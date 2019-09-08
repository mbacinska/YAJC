package com.geometry2D;

import java.util.Objects;

public class Line extends Shape{


    private final Coordinates coordinate1;

    private final Coordinates coordinate2;

    public Line(Coordinates coordinate1, Coordinates coordinate2) {
        super("Line");
        this.coordinate1 = coordinate1;
        this.coordinate2 = coordinate2;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        return "Line{" +
                "coordinate1=" + coordinate1 +
                ", coordinate2=" + coordinate2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(coordinate1, line.coordinate1) &&
                Objects.equals(coordinate2, line.coordinate2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate1, coordinate2);
    }
}
