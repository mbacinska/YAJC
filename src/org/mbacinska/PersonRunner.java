package org.mbacinska;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.mbacinska.Person.Gender.FEMALE;
import static org.mbacinska.Person.Gender.MALE;

public class PersonRunner {

    public static void main(String[] args) {

        List<Person> data = new ArrayList<>();
        data.add(new Person("Bacinska", FEMALE));
        data.add((new Person("Bacinski", MALE)));
        data.add(new Person("Iksinska", FEMALE));
        data.add(new Person("Ziolkowski", MALE));
        data.add(new Person("Zaksinska", FEMALE));
        data.add(new Person("Iksinski", MALE));

        System.out.println((data));

        List<Person> data2 = new ArrayList<>(data);


        data.sort(new Person.CompareByGender());
        System.out.println(data);

        data2.sort(Person.getCompareByGender());
        System.out.println(data2);
    }
}