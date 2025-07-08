package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code BackArrayTest} содержит модульные тесты для проверки метода {@link BackArray#turn}
 * из класса {@link BackArray}, осуществляющего разворот массива строк.
 *
 * <p>Используется для проверки корректной работы метода разворота как для массива
 * с четным количеством элементов, так и с нечетным.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
 * String[] result = new BackArray().turn(names);
 * String[] expected = {"Vasya", "Nik", "Ivan", "Petr"};
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class BackArrayTest {

    /**
     * Проверяет разворот массива с четным количеством элементов.
     *
     * <p>Ожидается, что метод {@link BackArray#turn} вернет массив в обратном порядке.</p>
     */
    @Test
    void whenInputArrayHasEvenAmountElements() {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        String[] result = new BackArray().turn(names);
        String[] expected = {"Vasya", "Nik", "Ivan", "Petr"};
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет разворот массива с нечетным количеством элементов.
     *
     * <p>Ожидается, что метод {@link BackArray#turn} вернет массив в обратном порядке,
     * включая центральный элемент на прежней позиции по значению.</p>
     */
    @Test
    void whenInputArrayHasNotEvenAmountElements() {
        String[] names = {"Petr", "Ivan", "Andrey", "Nik", "Vasya"};
        String[] result = new BackArray().turn(names);
        String[] expected = {"Vasya", "Nik", "Andrey", "Ivan", "Petr"};
        assertThat(result).isEqualTo(expected);
    }
}