package org.mbacinska.homework12;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiPredicate;

public class Task05 {


    @FunctionalInterface
    public interface TriFunPredicate<T1, T2, T3, R> {
        R apply(T1 t1, T2 t2, T3 t3);
    }


    @Test
    public void testTriFunPredicate() {

        TriFunPredicate<BiPredicate<Integer, Integer>, Integer, Integer, Integer> selector = (predicate, arg1, arg2) -> predicate.test(arg1, arg2) ? arg1 : arg2;


        Assert.assertTrue(3 == (selector.apply((arg1, arg2) -> arg1 < arg2, 3, 7)));
        Assert.assertTrue(3 == (selector.apply((arg1, arg2) -> arg1 < arg2, 7, 3)));
    }
}
