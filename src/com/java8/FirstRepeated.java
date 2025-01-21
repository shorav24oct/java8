package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeated {
    public static void main(String[] args) {
        String input = "impossible";

        Optional<Character> first = input.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println(first.orElse(null));
    }
}
