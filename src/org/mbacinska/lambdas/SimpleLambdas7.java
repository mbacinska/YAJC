package org.mbacinska.lambdas;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class SimpleLambdas7 {

    @Test
    public void testPredicate() {

        BiPredicate<Integer, Integer> predicate = (a, b) -> a < b;
        System.out.println(predicate.test(10, 2));
    }

    @Test
    public void testA1() {

        Predicate<Integer> predicate1 = (a) -> a < 10;
        Predicate<Integer> predicate2 = (a) -> a > 0;

        //Predicate<Integer> both =predicate1.and(predicate2);
        Predicate<Integer> both = predicate1.and(predicate2).negate();

    }

    @Test
    public void testB() {

        Function<Integer, String> myFunction = (x) -> "_____" + x.toString();
        System.out.println(myFunction.apply(1300));

    }

    @Test
    public void testC() {
        Function<Integer, Integer> pow2 = (x) -> x * x;
        System.out.println(pow2.apply(1500));

    }

    @Test
    public void testD() {
        BiFunction<Integer, Integer, Integer> multi = (x, y) -> x * y;
        System.out.println(multi.apply(1500, 9));
        Monitor.monitor(multi);

    }


}
