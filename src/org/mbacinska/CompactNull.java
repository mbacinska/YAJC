package org.mbacinska;

import org.junit.Test;

public class CompactNull {

    final Integer WRONG_AGE = null;

    public Integer getAge() {
        return null;
    }

    boolean isAgeOk(Integer age) {


        if (age == null) {
            return false;
        }
        if (age != null && age >= 0) {
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