package org.mbacinska;

import sun.management.Agent;

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

        printList(names);

//        Collections.sort(names, new Comparator<PersonName>() {
//            @Override
//            public int compare(PersonName object1, PersonName object2) {
//                return object1.getSurName().compareTo(object2.getSurName());
//            }
//        });
//
//        printList(names);



    }

    private static void printList(List<PersonName> names) {
        for (PersonName element : names) {
            System.out.println(element.getFirstName() + " " + element.getSurName());
        }
    }
}
