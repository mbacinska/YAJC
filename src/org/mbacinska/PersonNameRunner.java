package org.mbacinska;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonNameRunner {

    public static void main(String[] args) throws EmptyNameException {
        List<PersonName> names = Arrays.asList(
                new PersonName("James", "Bond"),
                new PersonName("Agent", "008"),
                new PersonName("Agent", "007"),
                new PersonName("Jelcz", "008"),
                new PersonName(" Some ", " Spaces"),
                new PersonName("lower", "case"),
                new PersonName("", "Anonymous")
        );


        names.sort(new PersonName.NameComparator());

        for (PersonName element : names) {
            System.out.println(element.getFirstName() + " " + element.getSurName());
        }

    }
}
