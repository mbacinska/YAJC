package com.geometry2D;

import java.util.Objects;

public class SimpleVector extends Shape {


    private Coordinates coordinate;
    private  double value;
    private  double direction;


    @Override
    public String toString() {
        return "SimpleVector{" +
                "coordinate=" + coordinate +
                ", value=" + value +
                ", direction=" + direction +
                '}';
    }

    public SimpleVector(Coordinates coordinate, double value, double direction) {
        super("SimpleVector");
        this.coordinate = coordinate;
        this.value = value;
        this.direction = direction;
    }

    @Override
    public String getName() {
        return super.getName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleVector that = (SimpleVector) o;
        return that.value == value &&
                that.direction == direction &&
                Objects.equals(coordinate, that.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate, value, direction);
    }
}