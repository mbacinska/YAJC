package org.mbacinska;

import java.lang.reflect.Field;

public class SimpleReflection2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Integer someObject = 15;

        Integer v1 =15;

        //System.out.println(v1);

        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set(someObject,1500100900);

        System.out.println(field.get(someObject));
    }


}
