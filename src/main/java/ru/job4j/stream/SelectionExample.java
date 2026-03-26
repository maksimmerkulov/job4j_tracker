package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of stream selection methods.
 *
 * <p>Example output:
 * <pre>{@code
 * Five
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SelectionExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "One", "Two", "Three", "Four", "Five"
        );

        String result = strings.stream()
                .skip(strings.size() - 1)
                .findFirst()
                .orElse("Default");

        System.out.println(result);
    }
}
