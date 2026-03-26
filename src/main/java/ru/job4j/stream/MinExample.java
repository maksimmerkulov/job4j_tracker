package ru.job4j.stream;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Demonstrates the usage of {@code min} to find the minimum value
 * in a primitive stream.
 *
 * <p>Example output:
 * <pre>{@code
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MinExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        OptionalInt min = IntStream.rangeClosed(1, 5)
                .min();
        System.out.println(min.getAsInt());
    }
}
