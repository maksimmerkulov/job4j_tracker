package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс {@code FactorialTest} предназначен для модульного тестирования метода {@link Factorial#calc(int)}.
 *
 * <p>Тестирует корректность обработки исключительных ситуаций при передаче отрицательного числа.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * new Factorial().calc(-1);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * java.lang.IllegalArgumentException: Number could not be less than 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class FactorialTest {

    /**
     * Проверяет, что метод {@link Factorial#calc(int)} выбрасывает исключение,
     * если входное значение меньше нуля.
     *
     * <p>Ожидается исключение {@link IllegalArgumentException} с сообщением
     * {@code "Number could not be less than 0"}.</p>
     *
     * @apiNote Проверка граничного условия: недопустимость отрицательных значений.
     * @implSpec Метод обязан валидировать входные данные до вычислений.
     */
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }
}