package com.mbacinska;

public class Classes {

    void run() {

        Person person0 = new Person();
        Person person1 = new Person();
        System.out.println(person0);
        System.out.println(person1);
        System.out.println(person0.name);
        System.out.println(person0.HELLO_MESSAGE);

        // person0.duplicate(person1);
        //person1.duplicate(person0);

        // person0.modify((person1));
        //System.out.println(person1.birthdate);


      //  person0.HELLO_MESSAGE = "asdasd"; cannot asign a value to the final variable
    }


//    class InnerClass{
//
//    }
//
//    //Classes.InnerClass

    public class Person {

        final String HELLO_MESSAGE = "Hello, mr";

        String name;
        int birthdate;
        String address;
        boolean isMale;

        private void duplicate(Person person1) {
            this.birthdate = person1.birthdate;
            this.name = person1.name;
            this.address = person1.address;
            this.isMale = person1.isMale;
            System.out.println(this);
        }

        public void modify(Person another) {
            another.birthdate += 100;
        }

    }
}
