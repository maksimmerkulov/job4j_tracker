package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of {@code peek} to modify stream elements.
 *
 * <p>Example output:
 * <pre>{@code
 * [Elena (Job4j Student), Ivan (Job4j Student), Mikhail (Job4j Student)]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PeekExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<StringBuilder> names = Arrays.asList(
                new StringBuilder("Mikhail"),
                new StringBuilder("Ivan"),
                new StringBuilder("Elena")
        );

        List<StringBuilder> editedNames = names.stream()
                .peek(element -> element.append(" (Job4j Student)"))
                .sorted()
                .toList();

        System.out.println(editedNames);
    }
}
