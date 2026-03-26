package ru.job4j.stream.mapto;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of {@code mapToInt} to process primitive
 * integer streams.
 *
 * <p>Example output:
 * <pre>{@code
 * 2
 * 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MapToIntExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("1", "2", "3", "4", "5");
        strings.stream()
                .mapToInt(Integer::parseInt)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }
}
