package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Demonstrates how to remove null elements from an array by creating
 * a new compressed array.
 *
 * <p>Example output:
 * <pre>{@code
 * Petr
 * Ivan
 * Stepan
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DropArray {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] result = new String[names.length];
        int size = 0;
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            if (name != null) {
                result[size] = name;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
