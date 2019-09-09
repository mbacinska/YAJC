package com.geometry2D;

public class TorusNew extends Shape implements HasArea,HasLength {

    private Circle circle1;
    private Circle circle2;

    public TorusNew(Circle circle1, Circle circle2) {
        super("Torus");
        this.circle1 = circle1;
        this.circle2 = circle2;
    }

    public TorusNew(Coordinates coordinate, double radius1, double radius2) {
        super("Torus");
        this.circle1 = new Circle(coordinate,radius1);
        this.circle2 = new Circle(coordinate,radius2);
    }


    public double getRadius1() {
        return circle1.getRadius();
    }

    public double getRadius2() {
        return circle2.getRadius();
    }


    @Override
    public double getArea() {


        return Math.abs(circle1.getArea()-circle2.getArea());
    }


    //Math.max

    @Override
    public double getLength() {
        double max = Math.max(getRadius1(), getRadius2());
        return 2 * Math.PI * max;
    }


    @Override
    public String toString() {
        return "Torus{" +
                "coordinate=" + circle1.getCoordinate() +
                ", radius1=" + getRadius1() +
                ", radius2=" + getRadius2() +
                '}';
    }


    public static void main(String[] args) {

        Coordinates coordinate = new Coordinates(1, 1);

        TorusNew torus = new TorusNew(coordinate, 2, 3);

        System.out.println(torus.getName());

        System.out.println(torus.toString());

        System.out.println(torus.getArea());

        System.out.println(torus.getLength());

        System.out.println(torus.getRadius1());

        System.out.println(torus.getRadius2());

        System.out.println(torus.getArea());

    }
}
