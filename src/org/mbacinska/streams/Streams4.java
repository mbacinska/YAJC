package org.mbacinska.streams;


import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Streams4 {

    @Test
    public void testA() {

        List<Person> people = Arrays.asList(
                new Person("John", "Wick", 40),
                new Person("James", "Bond", 40),
                new Person("John", "Second", 35),
                new Person("Johny", "Third", 155)

        );

//        Set<Person> collected = people.stream()
//                .peek(System.out::println)
//                .filter(person -> person.getAge()<99)
//                .collect(Collectors.toSet());
//
//
//        System.out.println(collected);
        System.out.println("-------------------------------");
    }

    @Test
    public void testB() {

        List<Person> people = Arrays.asList(
                new Person("John", "Wick", 40),
                new Person("James", "Bond", 40),
                new Person("John", "Second", 35),
                new Person("Johny", "Third", 155)

        );

        //na podstawie strumienia obiektow robimy strumien stringow .getName()
        Set<String> collected2 = people.stream()
                .peek(System.out::println)
                .filter(person -> person.getAge() < 99)
                .map((person -> person.getName()))
                .collect(Collectors.toSet());

        System.out.println(collected2);
    }

    @Test//grouping
    public void testC() {
        List<Person> people = Arrays.asList(
                new Person("John", "Wick", 40),
                new Person("James", "Bond", 40),
                new Person("John", "Second", 35),
                new Person("Johny", "Third", 155)

        );

        Map<String, List<Person>> collected = people.stream()
                .collect(Collectors.groupingBy(Person::getName));

        System.out.println(collected);
    }

    @Test//partitioning
    public void testD() {
        List<Person> people = Arrays.asList(
                new Person("John", "Wick", 40),
                new Person("James", "Bond", 40),
                new Person("John", "Second", 35),
                new Person("Johny", "Third", 155)

        );
        Map<Boolean, List<Person>> partitioned = people.stream()
                .collect(Collectors.partitioningBy((person) -> person.getAge() >= 40));

        System.out.println(partitioned);

    }

    @Test//redukcja
    public void testE() {
        List<Integer> data = Arrays.asList(1, 5, 3, 9, 12, 10, -1);
        Optional<Integer> reduced = data.stream()
                .reduce((stored, b) -> stored + b);
        System.out.println(reduced);
    }

    class Person {
        private final String name;
        private final String surName;
        private final Integer age;

        public Person(String name, String surName, Integer age) {
            this.name = name;
            this.surName = surName;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getSurName() {
            return surName;
        }

        public Integer getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surName='" + surName + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}




