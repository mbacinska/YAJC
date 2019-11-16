package org.mbacinska;

import org.junit.Test;

public class CompactNull {

    final Integer WRONG_AGE = null; //null means a reference to nowhere, a space in memory that does not contain an object.

    public Integer getAge() {
        return null;
    }

    boolean isAgeOk(Integer age) {


        if (age == null) {
            return false;
        }
        if (age != null && age.intValue() >= 0) {
            return true;
        }

        throw new RuntimeException();
    }

    @Test
    public void test() {


        if (!isAgeOk(getAge())) {
            System.out.println("wrrrong!");
        }
    }

}