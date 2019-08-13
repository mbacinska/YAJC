package com.mbacinska;

public class Main {

    public static void main(String[] args) {
        Point point = new Point(1.0,1.0);
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println(point.getR());
        System.out.println("***********************************");
        point.setX(2.0);
        point.setY(3.0);
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println(point.getR());


    }

}
