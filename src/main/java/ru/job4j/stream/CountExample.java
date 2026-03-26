package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of {@code count} to determine
 * the number of stream elements.
 *
 * <p>Example output:
 * <pre>{@code
 * 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CountExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long count = numbers.stream()
                .filter(element -> element % 2 == 0)
                .count();
        System.out.println(count);
    }
}
