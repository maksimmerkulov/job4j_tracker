package ru.job4j.stream;

import java.util.stream.Stream;

/**
 * Demonstrates the usage of flatMap to combine multiple streams.
 *
 * <p>Example output:
 * <pre>{@code
 * level 1 task 1
 * level 1 task 2
 * level 1 task 3
 * ...
 * level 3 task 4
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DoubleLoop {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String[] levels = {"level 1", "level 2", "level 3"};
        String[] tasks = {"task 1", "task 2", "task 3", "task 4"};
        Stream.of(levels)
                .flatMap(level -> Stream.of(tasks)
                        .map(task -> level + " " + task))
                .forEach(System.out::println);
    }
}
