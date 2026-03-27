package ru.job4j.api;

import java.util.List;

/**
 * Demonstrates the usage of {@code dropWhile} to skip elements
 * while condition is true.
 *
 * <p>Example output:
 * <pre>{@code
 * Result: 3
 * Result: 4
 * Result: 1
 * Result: 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DropWhile {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 1, 2).stream()
                .dropWhile(value -> value < 3)
                .map(value -> "Result: " + value)
                .forEach(System.out::println);
    }
}
