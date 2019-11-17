package org.mbacinska.homework12;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Task03 {

 private final BiFunction<Double, Double, Double> multiply = (arg1, arg2) -> arg1 * arg2;

  private final Function<Double, Optional<Double>> sqrt = arg -> {

        if (arg < 0) {
            return Optional.empty();

        } else
            return Optional.of(Math.sqrt(arg));
    };


  private final BiFunction<Double, Double, Optional<Double>> multiplyAndThenSqrt = multiply.andThen(sqrt);


    @Test
    public void testMultiply_given_3_4_expected12() {
        Double result = multiply.apply(3.0, 4.0);
        Assert.assertEquals(12.0, result, 0.0);
    }

    @Test
    public void testMultiplyOverflow_givenMaxValue_expected_Infinity() {
        Double result = multiply.apply(Double.MAX_VALUE, Double.MAX_VALUE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testSqrt_given_negative16_expected_Optional_empty() {
        Optional<Double> result = sqrt.apply(-16.0);
        Assert.assertEquals(Optional.empty(), result);
    }

    @Test
    public void testSqrt_given_4096_expected_64() {
        Optional<Double> result = sqrt.apply(4096.0);
        Assert.assertEquals(64.0, result.get(), 0.0);
    }

    @Test
    public void testMultiplyThenSqrt_given3_3_expected_3() {
        Optional<Double> result = multiplyAndThenSqrt.apply(3.0, 3.0);
        Assert.assertEquals(3.0, result.get(), 0.0);
    }

    @Test
    public void testOverflowMultiplyThenSqrt() {
        Optional<Double> result = multiplyAndThenSqrt.apply(Double.MAX_VALUE, 30.0);
        System.out.println(result);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result.get(), 0.0);

    }

}
