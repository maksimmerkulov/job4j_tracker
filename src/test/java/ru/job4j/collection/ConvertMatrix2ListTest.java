package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ConvertMatrix2ListTest} содержит модульный тест
 * для проверки метода {@link ConvertMatrix2List#toList(int[][])}.
 *
 * <p>Проверяется корректность преобразования двумерного массива в список.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ConvertMatrix2ListTest {

    /**
     * Проверяет, что метод {@link ConvertMatrix2List#toList(int[][])}
     * корректно преобразует двумерный массив 2×2 в список из 4 элементов.
     *
     * <p>Входной массив: {{1, 2}, {3, 4}}.</p>
     * <p>Ожидаемый список: [1, 2, 3, 4].</p>
     */
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expected = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result).containsAll(expected);
    }
}
