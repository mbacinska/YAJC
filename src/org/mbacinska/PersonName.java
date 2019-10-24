package org.mbacinska;

import java.util.Comparator;

public class PersonName {

    private final String firstName;
    private final String surName;

    public PersonName(String firstName, String surName) throws EmptyNameException{
        this.firstName = setSentenceCase(firstName.trim());
        this.surName = setSentenceCase(surName.trim());
        if(this.firstName.isEmpty() && this.surName.isEmpty()){
            throw new EmptyNameException();
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurName() {
        return this.surName;
    }

    private String setSentenceCase(String name){
        //Sentence Case
        return name.isEmpty()
                ? ""
                : name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
    }

    static class SurNameComparator implements Comparator<PersonName>{

        @Override
        public int compare(PersonName p1, PersonName p2) {
            if(p1.surName.equals(p2.surName)){
                return p1.firstName.compareToIgnoreCase(p2.firstName);//3 unit testy
            }
            return p1.surName.compareTo(p2.surName);//2 unit testy
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
