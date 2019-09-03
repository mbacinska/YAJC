package com.geometry;

import java.util.Objects;

public class Point2D {

    private final double x;//punkt staje sie immutable, nie da sie zmienic
    private final double y;


    //kaskada konstruktorów, overloading

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point2D() {
        this(17, 19);
    }


    private double pow2(double arg) {
        return arg * arg;
    }

    double distanceTo(Point2D another) {
        return Math.sqrt(pow2(x - another.x) + pow2(y - another.y));
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return point2D.x == x && //można tak, bo sa to primitive types
                point2D.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);//kolejnosc ma znaczenie
       // return Objects.hash(x) + Objects.hash(y);gdyby kolejnosc nie miała znaczenia
    }

    public Point2D  translate(double deltaX, double deltaY){
        return new Point2D(x+deltaX,y+deltaY);
    }


}
