package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс {@code CountTest} предназначен для модульного тестирования метода {@link Count#add(int, int)}.
 *
 * <p>Проверяет корректность обработки исключительных ситуаций при нарушении условия:
 * начальное значение должно быть меньше конечного.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Count.add(10, 2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * java.lang.IllegalArgumentException: Start should be less than finish.
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
}