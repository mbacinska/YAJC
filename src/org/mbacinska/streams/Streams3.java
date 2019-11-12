package org.mbacinska.streams;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams3 {

    @Test
    public void testA() {

        List<Integer> generate = Stream.generate(() -> 1)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(generate);
    }
}
