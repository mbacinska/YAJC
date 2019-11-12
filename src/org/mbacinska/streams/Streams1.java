package org.mbacinska.streams;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Streams1 {

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
        int sum = data.stream()
                .peek((value) -> System.out.println("Value: " + value))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);


    }
}
