package com.geometry;


import java.util.Objects;

public class Point2D {

    private double coordinateX;
    private double coordinateY;

    public Point2D(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }


    public Point2D() {
        coordinateX = 0.0;
        coordinateY = 0.0;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2D point2D = (Point2D) o;
        return Double.compare(point2D.coordinateX, coordinateX) == 0 &&
                Double.compare(point2D.coordinateY, coordinateY) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinateX, coordinateY);
    }


    public void translateXY(double deltaX, double deltaY) {
        coordinateX += deltaX;
        coordinateY += deltaY;
    }

    public double distanceTo(Point2D another) {
        return Math.sqrt(((another.coordinateX - this.coordinateX) * (another.coordinateX - this.coordinateX)) + ((another.coordinateY - this.coordinateY) * (another.coordinateY - this.coordinateY)));

    }

    //    public double distanceTo(Point2D another) {
//        return Math.sqrt(Math.pow(another.coordinateX - this.coordinateX, 2) + Math.pow(another.coordinateY - this.coordinateY,2));
//
//    }
    public static void main(String[] args) {

        Point2D point4 = new Point2D(1.0, 1.0);
        Point2D point5 = new Point2D(4.0, 4.0);

        System.out.println(point4.distanceTo(point5));
        System.out.println("********************");
        point4.translateXY(1.0, 1.0);
        System.out.println(point4.getCoordinateX());
        System.out.println(point4.getCoordinateY());
        System.out.println("********************");
        point5.translateXY(-3.0, -4.0);
        System.out.println(point5.getCoordinateX());
        System.out.println(point5.getCoordinateY());
        System.out.println(point4.distanceTo(point5));


    }
}

