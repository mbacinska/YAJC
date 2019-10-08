package org.mbacinska;

import java.util.Comparator;

public class CompareComplex {

    String name;
    String surName;
    int age;

    class MyComparator implements Comparator<CompareComplex> {


        @Override
        public int compare(CompareComplex lhs, CompareComplex rhs) {
            if (lhs.surName.equals(rhs.surName)) {
                if (lhs.name.equals(rhs.name)) {
                    return lhs.age - rhs.age;
                }
                return lhs.name.compareTo(rhs.name);
            }
            return lhs.surName.compareTo(rhs.surName);
        }
    }
}
