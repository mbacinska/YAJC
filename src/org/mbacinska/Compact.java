package org.mbacinska;

import org.junit.Test;

public class Compact {

    final Integer WRONG_AGE = -128;

    public Integer getAge() {
        return WRONG_AGE;
    }


    boolean isAgeOk(Integer age) {

        if (age >= 0) {
            return true;
        }
        if (age.equals(WRONG_AGE)) {
            return false;
        }
        throw new RuntimeException();
    }

    @Test
    public void test() {
        //if(age == WRONG_AGE) --> porównanie referencji
        //if(age.equals(WRONG_AGE)) --> porównanie wartości

        if (!isAgeOk(getAge())) {
            System.out.println("wrrrong!");
        }
    }

}
