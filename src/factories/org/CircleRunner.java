package factories.org;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CircleRunner {

    public static void main(String[] args) {
        // Circle circle = new Circle(1,1,5);

        List<Circle> data = new ArrayList<>();
        data.add(new Circle(1, 1, 5));
        data.add(new Circle(2, 2, 6));
        data.add(new Circle(3, 3, 7));
        data.add(new Circle(4, 4, 8));

        Comparator<Circle> particularComparator = Circle.circleComparatorByR;

        data.sort(particularComparator);

        data.sort(new Comparator<Circle>() {
            @Override
            public int compare(Circle c1, Circle c2) {
                return c1.getX() - c2.getX();
            }
        });

        data.sort((c1, c2) -> c1.getX() - c2.getX());

        // data.sort((c1,c2) ->c1.getX().compareTo(c2.getX()));
        System.out.println(data);

        data.forEach(System.out::println);
    }

    @Test
    public void testPrototype() {

        Circle circle = new Circle(1, 2, 3);
        Circle.PrototypeFactory factory = new Circle.PrototypeFactory();
        factory.setPrototype(circle);
        System.out.println(factory.getAnotherCircle());
    }

    @Test
    public void testClone() throws CloneNotSupportedException {

        Circle circle = new Circle(1, 2, 3);
        System.out.println(circle);
        System.out.println(circle.radius.radius);

        Circle clone = (Circle) circle.clone();

        circle.x = 5;
        circle.radius.radius = 5;

        System.out.println(circle);
        System.out.println(circle.radius.radius);


        System.out.println(clone);
        System.out.println(clone.radius.radius);
    }
}
