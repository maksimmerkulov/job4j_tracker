package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StringCompareTest} содержит модульные тесты для проверки
 * работы компаратора {@link StringCompare}, реализующего сравнение строк
 * в лексикографическом порядке без использования метода {@link String#compareTo(String)}.
 *
 * <p>Проверяются следующие случаи:</p>
 * <ul>
 *     <li>Сравнение равных строк;</li>
 *     <li>Сравнение строк разной длины;</li>
 *     <li>Сравнение строк с разными первыми и последними символами;</li>
 *     <li>Сравнение пустых и непустых строк.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * StringCompare compare = new StringCompare();
 * int result = compare.compare(
 *         "Ivanov",
 *         "Ivanov"
 * );
 * assertThat(result).isEqualTo(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class StringCompareTest {

    /**
     * Проверяет, что сравнение одинаковых строк возвращает 0.
     */
    @Test
    public void whenStringsAreEqualThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(result).isEqualTo(0);
    }

    /**
     * Проверяет, что строка "Ivanov" меньше строки "Ivanova".
     */
    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(result).isLessThan(0);
    }

    /**
     * Проверяет, что строка "Petrov" больше строки "Ivanova".
     */
    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(result).isGreaterThan(0);
    }

    /**
     * Проверяет сравнение строк, отличающихся во втором символе.
     * "Petrov" > "Patrov" по второй букве 'e' > 'a'.
     */
    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(result).isGreaterThan(0);
    }

    /**
     * Проверяет сравнение строк, отличающихся во втором символе.
     * "Patrova" < "Petrov" по второй букве 'a' < 'e'.
     */
    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    /**
     * Проверяет, что сравнение двух пустых строк возвращает 0.
     */
    @Test
    public void whenBothEmptyThenZero() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "",
                ""
        );
        assertThat(result).isEqualTo(0);
    }

    /**
     * Проверяет, что непустая строка больше пустой.
     */
    @Test
    public void whenLeftEmptyRightNotEmptyThenNegative() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "",
                "Ivanov"
        );
        assertThat(result).isLessThan(0);
    }

    /**
     * Проверяет, что непустая строка больше пустой.
     */
    @Test
    public void whenLeftNotEmptyRightEmptyThenPositive() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                ""
        );
        assertThat(result).isGreaterThan(0);
    }

    /**
     * Проверяет, что сравнение строк, различающихся в первой букве,
     * возвращает корректный отрицательный результат.
     */
    @Test
    public void whenFirstCharDiffersThenCompareByIt() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Petrov"
        );
        assertThat(result).isLessThan(0);
    }

    /**
     * Проверяет, что сравнение строк, различающихся в последнем символе,
     * возвращает корректный отрицательный результат.
     */
    @Test
    public void whenDiffersAtLastCharThenCompareByIt() {
        StringCompare compare = new StringCompare();
        int result = compare.compare(
                "Ivanov",
                "Ivanow"
        );
        assertThat(result).isLessThan(0);
    }
}
