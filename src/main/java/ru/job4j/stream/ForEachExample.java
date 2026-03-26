package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of {@code forEach} to print stream elements.
 *
 * <p>Example output:
 * <pre>{@code
 * one
 * two
 * three
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ForEachExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ONE", "TWO", "THREE");

        strings.stream()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }
}
