package FactoryPatterns;

public class FactoryDemo {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        //create Circle object and call its draw method
        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        //create Rectangle object and call its draw method
        Shape shape2= factory.getShape("Rectangle");
        shape2.draw();

        //create Square object and call its draw method
        Shape shape3 = factory.getShape("Square");
        shape3.draw();
    }
}
