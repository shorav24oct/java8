package com.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "good";

        LinkedHashMap<Character, Long> map = input.chars()
                .mapToObj(s -> (char) s)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        System.out.println(map);

        Optional<Character> firstNonRepeat = map.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();

        System.out.println("First Non Repeat Element is " + firstNonRepeat.orElse(null));

    }
}
