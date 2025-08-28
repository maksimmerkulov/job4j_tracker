package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ConvertList2ArrayTest} содержит модульные тесты для проверки
 * корректной работы метода {@link ConvertList2Array#toArray(java.util.List, int)}.
 *
 * <p>Проверяются различные случаи преобразования списка в двумерный массив
 * с фиксированным количеством столбцов, включая заполнение "хвоста" нулями.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ConvertList2ArrayTest {

    /**
     * Проверяет поведение метода при передаче списка из 7 элементов и 3 столбцов.
     *
     * <p>Ожидается 3 строки: первые две полностью заполнены, а в последней
     * недостающие элементы должны быть заполнены значением по умолчанию (нулями).</p>
     */
    @Test
    public void when7ElementsThen9() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expected = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    /**
     * Проверяет поведение метода при передаче списка из 5 элементов и 2 столбцов.
     *
     * <p>Ожидается 3 строки, где последняя содержит один элемент и один ноль в конце.</p>
     */
    @Test
    public void when5ElementsThen6() {
        int[][] result = ConvertList2Array.toArray(
                Arrays.asList(1, 2, 3, 4, 5),
                2
        );
        int[][] expected = {
                {1, 2},
                {3, 4},
                {5, 0}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}
