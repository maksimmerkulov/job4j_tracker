package ru.job4j.api;

import java.util.stream.Stream;

/**
 * Demonstrates the usage of {@code ofNullable} to filter out null elements.
 *
 * <p>Example output:
 * <pre>{@code
 * Result: 1
 * Result: 2
 * Result: 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SkipNull {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(value -> "Result: " + value)
                .forEach(System.out::println);
    }
}
