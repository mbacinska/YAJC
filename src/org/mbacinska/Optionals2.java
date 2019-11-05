package org.mbacinska;

import java.util.Optional;

public class Optionals2 {

    public static void main(String[] args) {
        Integer age = 18;
        useAge(age);
        useAge1();
    }

    public static void useAge(Integer age) {

        System.out.println("Age:" + age);
    }

    public static void useAge1() {

        System.out.println("Unknown age");
    }


    Optional<Integer> getAge() {
        return Optional.empty();
    }
}
