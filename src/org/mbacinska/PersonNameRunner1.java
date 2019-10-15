package org.mbacinska;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonNameRunner1 {

    public static void main(String[] args) throws EmptyNameException {
        ArrayList<PersonName> names = new ArrayList<>();
        names.add(new PersonName ("agent","008"));
        names.add(new PersonName ("agent","007"));
        Comparator<PersonName> anonym = new Comparator<PersonName>() {
            @Override
            public int compare(PersonName p1, PersonName p2) {
                return p1.getSurName().compareTo(p2.getSurName());
            }
        };

    }
}
