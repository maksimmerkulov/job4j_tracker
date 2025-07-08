package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс {@code CountTest} предназначен для модульного тестирования метода {@link Count#add(int, int)}.
 *
 * <p>Тесты охватывают два сценария:</p>
 * <ul>
 *     <li>Генерация исключения при нарушении условия: начальное значение больше либо равно конечному.</li>
 *     <li>Корректный расчет суммы всех целых чисел от {@code start} до {@code finish - 1} при валидном вводе.</li>
 * </ul>
 *
 * <p><b>Примеры тестирования:</b></p>
 * <pre>{@code
 * IllegalArgumentException exception = assertThrows(
 *         IllegalArgumentException.class,
 *         () -> {
 *             Count.add(10, 2);
 *         });
 * assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
 *
 * int start = 0;
 * int finish = 3;
 * int expected = 3;
 * int result = Count.add(start, finish);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class CountTest {

    /**
     * Проверяет, что метод {@link Count#add(int, int)} выбрасывает исключение,
     * если начальное значение больше конечного.
     *
     * <p>Исключение должно быть {@link IllegalArgumentException} с сообщением
     * {@code "Start should be less than finish."}.</p>
     *
     * @apiNote Тест проверяет защиту от некорректного ввода.
     * @implSpec Метод должен корректно обрабатывать граничные условия.
     */
    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Count.add(10, 2);
                });
        assertThat(exception.getMessage()).isEqualTo("Start should be less than finish.");
    }

    /**
     * Проверяет корректность вычисления суммы чисел от {@code start} до {@code finish - 1}.
     *
     * <p>При передаче 0 и 3 ожидается результат 3 (0 + 1 + 2).</p>
     *
     * @apiNote Тест демонстрирует стандартное поведение метода.
     * @implSpec Метод должен возвращать сумму всех целых чисел от {@code start} до {@code finish - 1}.
     */
    @Test
    public void whenStart0Finish3ThenSum3() {
        int start = 0;
        int finish = 3;
        int expected = 3;
        int result = Count.add(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}