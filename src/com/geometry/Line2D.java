package com.geometry;

public class Line2D {

    private Point2D pointA;//final postawione przy referencji, nie wiele nam zmienia
    private Point2D pointB;

    public Line2D(Point2D pointA, Point2D pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public double length() {
        return pointA.distanceTo(pointB);
    }

    public void translate(double deltaX, double deltaY) {
        pointA = pointA.translate(deltaX, deltaY);
        pointB = pointB.translate(deltaX, deltaY);
    }

    public Point2D getPointA() {
        return pointA;
    }

    public Point2D getPointB() {
        return pointB;
    }
}
