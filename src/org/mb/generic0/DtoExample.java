package org.mb.generic0;

public class DtoExample {

    public static class TwoIntegers {

        public final Integer firstInt;
        public final Integer secondInt;

        public TwoIntegers(Integer first, Integer second) {
            firstInt = first;
            secondInt = second;
        }
    }

    public static class TwoLongs {

        public final Long firstlong;
        public final Long secondlong;

        public TwoLongs(Long first, Long second) {
            this.firstlong = first;
            this.secondlong = second;
        }
    }

    public static class TwoObjects {

        public Object firstObject;
        public Object secondObject;

        public TwoObjects(Object first, Object second) {
            this.firstObject = first;
            this.secondObject = second;
        }

    }

    //KLASA ZPARAMETRYZOWANA
    public static class TwoThings<E> {

        public final E firstElement;
        public final E secondElement;

        public TwoThings(E first, E second) {
            firstElement = first;
            secondElement = second;
        }

    }

    //mozna tez tak
    public static class TwoDifferentThings<E, T> {

        public final E firstElement;
        public final T secondElement;

        public TwoDifferentThings(E first, T second) {
            firstElement = first;
            secondElement = second;
        }

    }

    public static class TwoWorkingThings<E extends Number> {

        public final E firstElement;
        public final E secondElement;

        public TwoWorkingThings(E first, E second) {
            firstElement = first;
            secondElement = second;
        }

    }
}
   

