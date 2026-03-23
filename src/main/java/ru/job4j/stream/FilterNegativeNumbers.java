package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates filtering positive numbers from a list using Stream API.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FilterNegativeNumbers {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, 3, 0, 7, -1, 12, -10);
        List<Integer> positive = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
