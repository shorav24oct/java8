package com.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "java programming";

        Map<Character, Long> collect = input.chars().mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));


    }
}
