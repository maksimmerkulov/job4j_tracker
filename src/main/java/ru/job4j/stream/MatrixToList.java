package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Service for converting a two-dimensional matrix to a flat list.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MatrixToList {

    /**
     * Converts a 2D array of integers into a single list of integers.
     *
     * @param matrix the two-dimensional array to convert
     * @return a list containing all elements of the matrix
     */
    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(Stream::of)
                .collect(Collectors.toList());
    }
}
