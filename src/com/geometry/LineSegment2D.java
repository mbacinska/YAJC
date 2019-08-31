package com.geometry;

import java.util.Objects;

public class LineSegment2D {

    private final Point2D firstPoint;
    private final Point2D secondPoint;

    public LineSegment2D(Point2D firstPoint, Point2D secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    @Override
    public String toString() {
        return "LineSegment2D{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }

    public void translateXY(double deltaX, double deltaY) {
        firstPoint.translateXY(deltaX, deltaY);
        secondPoint.translateXY(deltaX, deltaY);
    }

    public double length() {
        double length = firstPoint.distanceTo(secondPoint);
        return length;
    }

    public static void main(String[] args) {

        Point2D first = new Point2D(-2.0,3.0);
        Point2D second = new Point2D(4.0,6.0);
        LineSegment2D line = new LineSegment2D(first,second);
        System.out.println(line.length());
        line.translateXY(1.0,1.0);
        System.out.println(first.getCoordinateX());
        System.out.println(first.getCoordinateY());
        System.out.println(line.length());
    }

}
