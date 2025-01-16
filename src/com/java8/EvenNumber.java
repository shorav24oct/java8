package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<Integer> collected = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collected);

    }
}
