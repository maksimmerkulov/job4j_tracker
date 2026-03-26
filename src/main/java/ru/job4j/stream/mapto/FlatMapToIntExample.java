package ru.job4j.stream.mapto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demonstrates the usage of {@code flatMapToInt} to flatten primitive
 * arrays into a list.
 *
 * <p>Example output:
 * <pre>{@code
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FlatMapToIntExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] array3 = {7, 8, 9};
        List<Integer> list = Stream.of(array1, array2, array3)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
