package org.mbacinska.homework12;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Task06 {

    public static Optional<Double> calculate(Double arg) {
        Double result = Math.sqrt(arg) / Math.log(arg);
        if (result.isNaN() || result.isInfinite()) {
            return Optional.empty();
        } else {
            return Optional.of(result);
        }
    }

    public static void main(String[] args) {

        List<Double> data = Arrays.asList(-1., 0., 0.25, 0.5, 0.75, 1., 1.25, 1.5, 1.75, 2., 3., 4., 5., 6., 7., 8., 9., 10., 100.);

        Map<Integer, List<Double>> collected = data.stream()
                .map(value -> calculate(value))
                .filter(value -> !value.equals(Optional.empty()))
                .map(value -> value.get())
                .filter(value -> value > 1.0)
                .sorted()
                .collect(groupingBy(value -> value.intValue()));

//
//        Map<Integer, List<Double>> collected = data.stream()
//                .map(Task06::calculate)
//                .filter(value -> !value.equals(Optional.empty()))
//                .map(Optional::get)
//                .filter(value -> value > 1.0)
//                .sorted()
//                .collect(groupingBy(Double::intValue));

        System.out.println(collected);


    }
}


