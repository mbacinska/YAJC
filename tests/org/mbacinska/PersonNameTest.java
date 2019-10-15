package org.mbacinska;

import org.junit.Assert;
import org.junit.Test;

public class PersonNameTest {

    @Test
    public void testFirstNameConstructor() throws EmptyNameException {
        PersonName personName = new PersonName("John", "wick");
        Assert.assertEquals("Failed in firstName", "John", personName.getFirstName());
    }

    //trzeba dwóch osobnych testów dla firstname & surname, bo mogliśmy np. w surname zapomnieć dodać trim() do kodu
    @Test
    public void testRemovingSpacesInFirstName() throws EmptyNameException {
        PersonName personName = new PersonName(" John ", " Wick ");
        Assert.assertEquals("John", personName.getFirstName());
    }

    @Test
    public void testRemovingSpacesInSurName() throws EmptyNameException {
        PersonName personName = new PersonName(" John ", " Wick ");
        Assert.assertEquals("Wick", personName.getSurName());
    }

    @Test
    public void testSentenceCaseInFirstName() throws EmptyNameException {
        PersonName personName = new PersonName("joHn", " wickTheSecond ");
        Assert.assertEquals("John", personName.getFirstName());
    }

    @Test
    public void testSentenceCaseInSurName() throws EmptyNameException {
        PersonName personName = new PersonName(" joHn ", "wickTheSecond");
        Assert.assertEquals("Wickthesecond", personName.getSurName());
    }

    @Test
    public void testSentenceCaseInSurName2() throws EmptyNameException {
        PersonName personName = new PersonName(" joHn ", "Wickthesecond");
        Assert.assertEquals("Wickthesecond", personName.getSurName());
    }

    @Test(expected = EmptyNameException.class)
    public void testBothAreEmpty() throws EmptyNameException {
        PersonName personName = new PersonName("", "");
    }

    @Test
    public void testSurNameComparatorLessSurName() throws EmptyNameException {
        PersonName p1 = new PersonName("Agent", "007");
        PersonName p2 = new PersonName("Agent", "008");
        PersonName.SurNameComparator comparator = new PersonName.SurNameComparator();
        Assert.assertTrue(comparator.compare(p1, p2) < 0);
    }
}