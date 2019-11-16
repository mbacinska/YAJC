package FactoryPattern;

public class ShapeFactory {

    //one of the most used;
    //creational pattern;
    //creates object without exposing the creation logic to the client and refer to newly created object using a common interface


    public Shape getShape(String shapeType) {

        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;

    }


}


