package org.mbacinska;

import java.util.Optional;

public class CreateOptional {

    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        Optional<String> notEmpty = Optional.of("Not empty");
        System.out.println(notEmpty.isPresent());

        String name = null;
        //System.out.println(Optional.of(name)); throws null pointer exception


        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt);
        System.out.println(opt.isPresent());
    }
}
