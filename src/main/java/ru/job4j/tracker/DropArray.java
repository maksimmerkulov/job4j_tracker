package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Demonstrates how to shift elements in an array using
 * the {@link System#arraycopy(Object, int, Object, int, int)} method.
 *
 * <p>Example output:
 * <pre>{@code
 * [Petr, Ivan, Stepan, Fedor, Fedor]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class DropArray {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
}
