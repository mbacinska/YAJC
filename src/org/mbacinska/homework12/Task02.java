package org.mbacinska.homework12;

import org.junit.Assert;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Task02 {

    private final BinaryOperator<Double> sumArguments = (arg1, arg2) -> arg1 + arg2;

    private final UnaryOperator<Double> powArgument = arg -> Math.pow(arg, 2.0);

    private final BiFunction<Double, Double, Double> sumArgumentsAndThenPowArgument = sumArguments.andThen(powArgument);


    @Test
    public void testSumArguments_given13_15_expected28() {
        Double result = sumArguments.apply(13.0, 15.0);
        Assert.assertEquals(28.0, result, 0.0);

    }

    @Test
    public void testSumArguments_given13_46_15_45_expected28_91() {
        Double result = sumArguments.apply(13.46, 15.45);
        Assert.assertEquals(28.91, result, 0.0);
    }

    @Test
    public void testSumArguments_given100_200_notEquals100() {
        Double result = sumArguments.apply(100.0, 200.0);
        Assert.assertNotEquals(100.0, result, 0.0);
    }


    @Test
    public void testPowArgument_given35_expected1225() {
        Double result = powArgument.apply(35.0);
        Assert.assertEquals(1225.0, result, 0.0);
    }

    @Test
    public void testPowArgument_givenNegative123_expected15252_25() {
        Double result = powArgument.apply(-123.5);
        Assert.assertEquals(15252.25, result, 15252.25);
    }

    @Test
    public void testPowArgument_overflow() {
        Double result = powArgument.apply(Double.MAX_VALUE);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result, 0.0);
    }

    @Test
    public void testSumArgumentAndThenPowArgument_given_3_5_expected64() {
        Double result = sumArgumentsAndThenPowArgument.apply(3.0, 5.0);
        Assert.assertEquals(64.0, result, 0.0);
    }

    @Test
    public void testSumArgumentAndThenPowArgument_given_negative5_positive15_expected100() {
        Double result = sumArgumentsAndThenPowArgument.apply(-5.0, 15.0);
        Assert.assertEquals(100, result, 0.0);
    }

    @Test
    public void testSumArgumentAndThenPowArgument_given_negative25_positive5_expected400() {
        Double result = sumArgumentsAndThenPowArgument.apply(-25.0, 5.0);
        Assert.assertEquals(400, result, 0.0);
    }


}
