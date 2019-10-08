package org.mbacinska.testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SomethingSimpleTest {

    @Test
    public void adderTest() {
        SomethingSimple adder = new SomethingSimple();
        adder.adder(10, 12);
    }
    @Test
    public void adderTest2() {
        SomethingSimple adder = new SomethingSimple();

        Assert.assertEquals(25,adder.adder(10,15));
    }
    @Test
    public void adderTest3() {
        SomethingSimple adder = new SomethingSimple();

        Assert.assertEquals(20,adder.adder(10,15));
    }
}