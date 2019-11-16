package org.mbacinska;

import org.junit.Test;

import java.util.Optional;

public class UsingOptional {

    //Optional <T>

//    public Optional<Integer> getAge() {
//        return Optional.empty();
//    }

    public Optional<Integer> getAge1() {
        return Optional.of(36);
    }


    public Optional<Integer> getAge2() {
        // return Optional.of(null);//zwróci null pointer exception
        return Optional.ofNullable(null);
    }

    boolean isAgeOk(Optional<Integer> age) {

        if (!age.isPresent()) {
            System.out.println("None value");
            return false;
        }
        System.out.println(age.equals(36));
        return true;
    }

    @Test
    public void test() throws Exception {

        System.out.println(getAge2().orElse(1500100900));
        //System.out.println(getAge().orElseThrow(Exception::new));
    }
}

