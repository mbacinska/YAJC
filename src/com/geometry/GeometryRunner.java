package com.geometry;

public class GeometryRunner {

    public static void main(String[] args) {
        Point2D point1 = new Point2D(0,0);
        Point2D point2 = new Point2D(1,1);
        Line2D line = new Line2D(point1,point2);
        System.out.println(line);
        System.out.println(line.getPointA());
        System.out.println(line.getPointB());
        System.out.println(line.getClass());

        Point2D point = line.getPointA();//i mozemy zmieniac punkty naszej linii
        point.translate(100,100);
        System.out.println(line.getPointA());
    }
}
