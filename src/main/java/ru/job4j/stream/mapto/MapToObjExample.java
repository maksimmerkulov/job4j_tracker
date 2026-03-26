package ru.job4j.stream.mapto;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Demonstrates the usage of {@code mapToObj} to convert primitive
 * streams to objects.
 *
 * <p>Example output:
 * <pre>{@code
 * [1, 2, 3, 4, 5]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MapToObjExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> list = IntStream.rangeClosed(1, 5)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
