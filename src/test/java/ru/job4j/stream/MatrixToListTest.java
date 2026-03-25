package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link MatrixToList} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class MatrixToListTest {

    /**
     * Verifies that a square matrix is correctly flattened into a list.
     */
    @Test
    void whenInputSquareMatrix() {
        Integer[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result = MatrixToList.convert(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result).containsAll(expected);
    }

    /**
     * Verifies that a non-square matrix is correctly flattened into a list.
     */
    @Test
    void whenInputNoSquareMatrix() {
        Integer[][] matrix = {
                {1},
                {2, 3},
                {4, 5, 6}
        };
        List<Integer> result = MatrixToList.convert(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertThat(result).containsAll(expected);
    }
}
