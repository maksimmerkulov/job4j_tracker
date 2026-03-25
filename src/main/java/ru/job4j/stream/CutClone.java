package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates the usage of Stream API to remove duplicate elements.
 *
 * <p>Example output:
 * <pre>{@code
 * Ivan
 * Stepan
 * Petrucho
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CutClone {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Stepan");
        names.add("Petrucho");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
