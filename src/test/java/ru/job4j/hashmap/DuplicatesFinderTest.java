package ru.job4j.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Класс {@code DuplicatesFinderTest} содержит модульные тесты для проверки работы
 * метода {@link DuplicatesFinder#findDuplicates(int[])}.
 *
 * <p>Тесты проверяют корректность поиска дублирующихся элементов в различных сценариях:</p>
 * <ul>
 *     <li>Массив содержит дубликаты;</li>
 *     <li>Массив не содержит дубликатов;</li>
 *     <li>Все элементы массива одинаковы;</li>
 *     <li>Пустой массив;</li>
 *     <li>Массив с одним элементом.</li>
 * </ul>
 *
 * <p>Пример тестирования:</p>
 * <pre>{@code
 * int[] input = {1, 2, 3, 2, 1};
 * int[] expected = {1, 2};
 * assertArrayEquals(expected, DuplicatesFinder.findDuplicates(input));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DuplicatesFinderTest {

    /**
     * Проверяет корректность работы метода при массиве с дубликатами.
     */
    @Test
    void whenArrayHasDuplicatesThenReturnDuplicates() {
        int[] input = {1, 2, 3, 2, 1};
        int[] expected = {1, 2};
        assertArrayEquals(expected, DuplicatesFinder.findDuplicates(input));
    }

    /**
     * Проверяет работу метода при массиве без дубликатов.
     */
    @Test
    void whenArrayWithoutDuplicatesThenReturnEmptyArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {};
        assertArrayEquals(expected, DuplicatesFinder.findDuplicates(input));
    }

    /**
     * Проверяет работу метода, когда все элементы массива одинаковы.
     */
    @Test
    void whenArrayAllSameNumbersThenReturnThatNumber() {
        int[] input = {7, 7, 7};
        int[] expected = {7};
        assertArrayEquals(expected, DuplicatesFinder.findDuplicates(input));
    }

    /**
     * Проверяет работу метода при пустом массиве.
     */
    @Test
    void whenEmptyArrayThenReturnEmptyArray() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, DuplicatesFinder.findDuplicates(input));
    }

    /**
     * Проверяет работу метода при массиве из одного элемента.
     */
    @Test
    void whenOneElementArrayThenReturnEmptyArray() {
        int[] input = {1};
        int[] expected = {};
        assertArrayEquals(expected, DuplicatesFinder.findDuplicates(input));
    }
}
