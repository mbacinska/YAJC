package org.mbacinska;

import java.util.Arrays;
import java.util.List;

public class PersonNameRunner {
    public static void main(String[] args) throws EmptyNameException {
        List<PersonName> names = Arrays.asList(
                new PersonName("agent", "007"),
                new PersonName("agent", "008")

        );
        System.out.println(names);
        names.sort(new PersonName.SurNameComparator());
        System.out.println(names);
    }
}
