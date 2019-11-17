package org.mbacinska.homework12;

import org.junit.Assert;
import org.junit.Test;

public class Task04 {


    @FunctionalInterface
    public interface TriFun<T1, T2, T3, R> {
        R apply(T1 t1, T2 t2, T3 t3);
    }


    @Test
    public void testTriFunctionTernary() {
        TriFun<Boolean, Integer, Integer, Integer> selector = (b, arg1, arg2) -> b ? arg1 : arg2;

        Assert.assertTrue(3 == selector.apply(true, 3, 5));
        Assert.assertTrue(5 == selector.apply(false, 3, 5));
    }
}
