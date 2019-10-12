package org.mbacinska;

import static java.lang.Character.toTitleCase;

public class PersonName {


    private final String firstName;
    private final String surName;

    public PersonName(String firstName, String surName) throws EmptyNameException {

        if (!firstName.equals("") || !surName.equals("")) {
            this.firstName =toTitleCase(firstName.trim());
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

    public static void main(String[] args) throws EmptyNameException{

        PersonName person = new PersonName("magda", "bacinska");
        System.out.println(person.getFirstName());
        System.out.println(person.getSurName());


        System.out.println("------------------------------------");
        PersonName person2 = new PersonName("Marta", "Oksinska");
        System.out.println(person2.getFirstName());
        System.out.println(person2.getSurName());

        System.out.println("------------------------------------");
        PersonName person3 = new PersonName("", "");
        System.out.println(person3.getFirstName());
        System.out.println(person3.getSurName());
    }
}
