package org.mbacinska;

import java.util.Comparator;

import static java.lang.Character.toTitleCase;

public class PersonName {


    private final String firstName;
    private final String surName;

    public PersonName(String firstName, String surName) throws EmptyNameException {

        if (!firstName.equals("") || !surName.equals("")) {
            this.firstName = toTitleCase(firstName.trim());
            this.surName = toTitleCase(surName.trim());
        } else {
            throw new EmptyNameException("Empty names exception");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

//sciągnięte ze stacka z poprawioną literówką

    public static String toTitleCase(String input) {
        StringBuilder titleCase = new StringBuilder(input.length());
        boolean nextTitleCase = true;

        for (char c : input.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                nextTitleCase = true;
            } else if (nextTitleCase) {
                c = Character.toTitleCase(c);
                nextTitleCase = false;
            }

            titleCase.append(c);
        }

        return titleCase.toString();
    }

    static class NameComparator implements Comparator<PersonName> {
        @Override
        public int compare(PersonName object1, PersonName object2) {
            if (!object1.surName.equals(object2.surName)) {
                return object1.surName.compareTo(object2.surName);
            } else {
                return object1.firstName.compareTo(object2.firstName);
            }
        }

    }

    @Override
    public String toString() {
        return "PersonName{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
