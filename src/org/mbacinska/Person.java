package org.mbacinska;

import java.util.Comparator;

public class Person {

    public enum Gender {
        FEMALE,
        MALE

    }

    final private String fullName;
    final private Gender gender;

    public Person(String fullName, Gender gender) {
        this.fullName = fullName;
        this.gender = gender;
    }


    public String getFullName() {
        return fullName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", gender=" + gender +
                '}';
    }
    public static class CompareByGender implements Comparator<Person>{

        @Override
        public int compare(Person person1, Person person2) {
           return person1.getGender().compareTo(person2.getGender());
        }
    }


    private final static Comparator<Person> COMPARE_BY_GENDER = (p1, p2) -> p1.getGender().compareTo(p2.getGender());

    public static Comparator<Person> getCompareByGender() {
        return COMPARE_BY_GENDER;
    }


}
