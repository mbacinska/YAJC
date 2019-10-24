package org.mbacinska;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonNameRunner2 {

    static class MyArrayList <E> extends ArrayList<E> {
        private Comparator lastUsedComparator = null;


        public Comparator getLastUsedComparator() {
            return lastUsedComparator;
        }

        @Override
        public void sort(Comparator<? super E> c){
            super.sort(c);
            lastUsedComparator =c;
        }
    }
    public static void main(String[] args) throws EmptyNameException {
      MyArrayList<PersonName> names = new MyArrayList<>();
             names.add(new PersonName("agent", "007"));
             names.add(new PersonName("agent", "008"));

        System.out.println(names);
        sortData(names);
        System.out.println(names);
    }

    private static void sortData(List<PersonName> names) {

        names.sort(new PersonName.SurNameComparator());
    }
}
