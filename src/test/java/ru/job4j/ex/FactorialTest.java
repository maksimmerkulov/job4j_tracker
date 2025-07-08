package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс {@code FactorialTest} предназначен для модульного тестирования метода {@link Factorial#calc(int)}.
 *
 * <p>Тесты охватывают два сценария:</p>
 * <ul>
 *     <li>Генерация исключения при передаче отрицательного числа.</li>
 *     <li>Корректное вычисление факториала положительного числа.</li>
 * </ul>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * IllegalArgumentException exception = assertThrows(
 *         IllegalArgumentException.class,
 *         () -> {
 *             new Factorial().calc(-1);
 *         });
 * assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
 *
 * int number = 5;
 * int expected = 120;
 * int result = new Factorial().calc(number);
 * assertThat(result).isEqualTo(expected);
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

    /**
     * Проверяет корректность вычисления факториала положительного числа.
     *
     * <p>Ожидается, что {@link Factorial#calc(int)} вернет 120 при вводе 5.</p>
     *
     * @apiNote Проверка стандартного случая вычисления факториала.
     * @implSpec Метод должен корректно рассчитывать произведение всех целых чисел от 1 до n.
     */
    @Test
    public void whenCalculateFactorialOf5Then120() {
        int number = 5;
        int expected = 120;
        int result = new Factorial().calc(number);
        assertThat(result).isEqualTo(expected);
    }
}