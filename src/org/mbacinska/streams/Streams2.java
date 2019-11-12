package org.mbacinska.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams2 {

    @Test
    public void testA() {

        List<Integer> data = Arrays.asList(1, 5, 3, 9, 12, 10, -1);
        long count = data.stream()
                .peek(System.out::println)
                .count();
        System.out.println("Count: " + count);

    }

    @Test
    public void testB() {

        List<Integer> data = Arrays.asList(1, 5, 3, 9, 12, 10, -1);
        List<Integer> x = data.stream()
                .collect(Collectors.toList());
        System.out.println(x);


    }

    @Test
    public void testC() {

        List<Integer> data = Arrays.asList(1, 5, 3, 9, 12, 10, -1);
        Set<Integer> x = data.stream()
                .peek((value) -> System.out.println("Before limit: " + value))
                //   .filter((value) -> value < 4)
                .limit(2)
                .peek((value) -> System.out.println("After limit: " + value))
                .collect(Collectors.toSet());
        System.out.println(x);


    }

    @Test
    public void testD() {
        List<Integer> data = Arrays.asList(1, 5, 3, 9, 12, 10, -1, 1, 3, 3, 3, 5);
        Map<Integer, List<Integer>> result =
                data.stream()
                        .collect(Collectors.groupingBy(Integer::intValue));

        System.out.println(result);
    }
}

