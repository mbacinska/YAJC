package org.mbacinska;

import org.junit.Assert;
import org.junit.Before;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PersonNameTest {


    @org.junit.Test
    public void checkIfGetterReturnsProperFirstName() throws EmptyNameException {
        PersonName person = new PersonName("John", "");
        Assert.assertEquals("John", person.getFirstName());
    }

    @org.junit.Test
    public void checkIfGetterReturnsEmptyFirstName() throws EmptyNameException {
        PersonName person = new PersonName(" ", "Kossak");
        Assert.assertEquals("", person.getFirstName());
    }

    @org.junit.Test
    public void checkIfGetterReturnsProperSurName() throws EmptyNameException {
        PersonName person = new PersonName("John", "Kennedy");
        Assert.assertEquals("Kennedy", person.getSurName());

    }

    @org.junit.Test(expected = EmptyNameException.class)
    public void checkIfGConstructorThrowsException() throws EmptyNameException {
        PersonName person = new PersonName(" ", " ");

    }

    @org.junit.Test
    public void checkFirstNameToTitleCase() throws EmptyNameException {
        PersonName person = new PersonName("john", "Kennedy");
        Assert.assertEquals("John", person.getFirstName());
    }

    @org.junit.Test
    public void checkSurNameToTitleCase() throws EmptyNameException {
        PersonName person = new PersonName("John", "kennedy");
        Assert.assertEquals("Kennedy", person.getSurName());
    }

    @org.junit.Test
    public void checkNameComparator() throws EmptyNameException {


        PersonName person1 = new PersonName("Alek", "Ambroziak");
        PersonName person2 = new PersonName("Alek", "Zambroziak");
        PersonName person3 = new PersonName("Olek", "Kambroziak");
        List<PersonName> names = Arrays.asList(
                person1,
                person2,
                person3);

        names.sort(new PersonName.NameComparator());

        Assert.assertEquals(person1, names.get(0));
        Assert.assertEquals(person2, names.get(2));
        Assert.assertEquals(person3, names.get(1));

    }

    @org.junit.Test
    public void checkTrimFunction() throws EmptyNameException {
        PersonName person = new PersonName(" Alek ", " ");
        Assert.assertEquals("Alek", person.getFirstName());
       // Assert.assertEquals("", person.getSurName());

    }
}