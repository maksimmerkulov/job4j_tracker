package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс {@code FindTest} содержит модульные тесты для проверки метода {@link Find#get(String[], int)}.
 *
 * <p>Тестируются как корректные, так и граничные случаи, включая выход за пределы массива и допустимые индексы.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String[] data = {"one", "two", "three"};
 * int index = -3;
 * IllegalArgumentException exception = assertThrows(
 *         IllegalArgumentException.class,
 *         () -> {
 *             Find.get(data, index);
 *         }
 * );
 * assertThat(exception.getMessage()).isEqualTo("Index out of bound");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class FindTest {

    /**
     * Проверяет, что метод выбрасывает исключение при отрицательном индексе.
     */
    @Test
    void whenIndexIsNegative() {
        String[] data = {"one", "two", "three"};
        int index = -3;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Find.get(data, index);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bound");
    }

    /**
     * Проверяет, что метод выбрасывает исключение при индексе больше длины массива.
     */
    @Test
    void whenIndexIsGreaterThanArrayLength() {
        String[] data = {"one", "two", "three"};
        int index = 10;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Find.get(data, index);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bound");
    }

    /**
     * Проверяет, что метод выбрасывает исключение при индексе, равном длине массива.
     */
    @Test
    void whenIndexEqualsArrayLength() {
        String[] data = {"one", "two", "three"};
        int index = 3;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Find.get(data, index);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bound");
    }

    /**
     * Проверяет корректное возвращение значения по валидному индексу.
     */
    @Test
    void whenIndexIsCorrect() {
        String[] data = {"one", "two", "three"};
        int index = 1;
        String result = Find.get(data, index);
        String expected = "two";
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверяет корректное возвращение первого элемента массива.
     */
    @Test
    void whenIndexIs0ThenItIsCorrect() {
        String[] data = {"one", "two", "three"};
        int index = 0;
        String result = Find.get(data, index);
        String expected = "one";
        assertThat(result).isEqualTo(expected);
    }
}
