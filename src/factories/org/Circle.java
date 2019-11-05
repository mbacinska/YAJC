package factories.org;

import java.util.Comparator;

public class Circle {

    static Comparator<Circle> circleComparatorByX = (c1, c2) -> c1.getX() - c2.getX();
    static Comparator<Circle> circleComparatorByY = (c1, c2) -> c1.getY() - c2.getY();
    static Comparator<Circle> circleComparatorByR = Comparator.comparingInt(Circle::getR);//lambda referencja do metody

    private final Integer x;
    private final Integer y;
    private final Integer r;

    public Circle(Integer x, Integer y, Integer r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    @Override
    public String toString() {
        return "\nCircle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Integer getR() {
        return r;
    }

    public static class PrototypeFactory {
        public void getPrototype(Circle circle) {
        }

        public void setPrototype(Circle circle) {

        }

        public boolean getAnotherCircle() {
            return false;
        }
    }
}
