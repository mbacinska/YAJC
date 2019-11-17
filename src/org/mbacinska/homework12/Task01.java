package org.mbacinska.homework12;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.Predicate;


public class Task01 {

    private final Predicate<Integer> moreThan4 = x -> x > 4;
    private final Predicate<Integer> lessThan10 = x -> x < 10;
    private final Predicate<Integer> moreThan4LessThan10 = moreThan4.and(lessThan10);

    @Test
    public void testLessThan10_givenArgument10_expectedFalse() {
        boolean result = lessThan10.test(10);
        Assert.assertFalse(result);
    }

    @Test
    public void testLessThan10_givenArgument9_expectedTrue() {
        boolean result = lessThan10.test(9);
        Assert.assertTrue(result);
    }

    @Test
    public void testLessThan10_givenArgument5_expectedTrue() {
        boolean result = lessThan10.test(5);
        Assert.assertTrue(result);
    }

    @Test
    public void testLessThan10_givenArgument4_expectedTrue() {
        boolean result = lessThan10.test(4);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoreThan4_givenArgument10_expectedTrue() {
        boolean result = moreThan4.test(10);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoreThan4_givenArgument9_expectedTrue() {
        boolean result = moreThan4.test(9);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoreThan4_givenArgument5_expectedTrue() {
        boolean result = moreThan4.test(5);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoreThan4_givenArgument4_expectedFalse() {
        boolean result = moreThan4.test(4);
        Assert.assertFalse(result);
    }

    @Test
    public void testMoreThan4LessThan10_givenArgument10_expectedFalse() {
        boolean result = moreThan4LessThan10.test(10);
        Assert.assertFalse(result);
    }

    @Test
    public void testMoreThan4LessThan10_givenArgument9_expectedTrue() {
        boolean result = moreThan4LessThan10.test(9);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoreThan4LessThan10_givenArgument5_expectedTrue() {
        boolean result = moreThan4LessThan10.test(5);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoreThan4LessThan10_givenArgument4_expectedFalse() {
        boolean result = moreThan4LessThan10.test(4);
        Assert.assertFalse(result);
    }
}
