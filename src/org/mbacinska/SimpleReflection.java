package org.mbacinska;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class SimpleReflection {

    static class SomeClass {

      public int getValue() {
            return value;
        }

        public SomeClass(int value){

          this.value = value;
        }

        private final int value;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {

        SomeClass object = new SomeClass(1500100900);

        //getting class name
        Class cls = object.getClass();

        System.out.println(cls.getName());

        //getting constructor
        Constructor constructor = object.getClass().getConstructor();

        System.out.println(constructor.getName());


        //getting private field
        Field field = SomeClass.class.getDeclaredField("value");

        //set field accessible
        field.setAccessible(true);
        //change value of field
        field.set(object,13);
        System.out.println(field.get(object));
    }
}
