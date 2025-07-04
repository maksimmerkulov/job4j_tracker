package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Класс {@code MaxTest} содержит модульные тесты для проверки метода {@link Max#max(int, int)}.
 *
 * <p>Тестируются различные сценарии для метода {@link Max#max(int, int)}, в том числе:
 * <ul>
 *     <li>Когда максимум находится во втором аргументе;</li>
 *     <li>Когда максимум находится в первом аргументе;</li>
 *     <li>Когда оба аргумента равны;</li>
 *     <li>Когда оба аргумента отрицательные.</li>
 * </ul></p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * assertThat(Max.max(1, 2), is(2));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MaxTest {

    /**
     * Тест проверяет, что максимум — второй аргумент.
     *
     * <p>Проверка корректности возврата значения, когда {@code left < right}.</p>
     */
    @Test
    public void whenMaxSecond() {
        assertThat(Max.max(1, 2), is(2));
    }

    /**
     * Тест проверяет, что максимум — первый аргумент.
     *
     * <p>Проверка корректности возврата значения, когда {@code left > right}.</p>
     */
    @Test
    public void whenMaxFirst() {
        assertThat(Max.max(3, 2), is(3));
    }

    /**
     * Тест проверяет, что при равных аргументах возвращается одно из значений.
     *
     * <p>Проверка корректности возврата значения, когда {@code left == right}.</p>
     */
    @Test
    public void whenEquals() {
        assertThat(Max.max(4, 4), is(4));
    }

    /**
     * Тест проверяет, что метод работает корректно с отрицательными числами.
     *
     * <p>Проверка корректности возврата максимального значения, когда оба числа отрицательные.</p>
     */
    @Test
    public void whenNegativeNumber() {
        assertThat(Max.max(-2, -1), is(-1));
    }
}