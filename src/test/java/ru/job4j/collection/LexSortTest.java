package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code LexSortTest} содержит модульные тесты
 * для проверки работы компаратора {@link LexSort}.
 *
 * <p>Проверяется, что строки в формате {@code "number. text."}
 * сортируются не по алфавиту, а по числовому значению
 * начального номера задачи.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String[] input = {
 *         "10. Task.",
 *         "1. Task.",
 *         "2. Task."
 * };
 * String[] output = {
 *         "1. Task.",
 *         "2. Task.",
 *         "10. Task."
 * };
 * Arrays.sort(input, new LexSort());
 * assertThat(input).containsExactly(output);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class LexSortTest {

    /**
     * Проверяет корректность сортировки строк с номерами задач:
     * ожидается, что строки будут упорядочены по числовым значениям
     * номеров в начале строки.
     */
    @Test
    public void sortNum1and2and10() {
        String[] input = {
                "10. Task.",
                "1. Task.",
                "2. Task."
        };
        String[] output = {
                "1. Task.",
                "2. Task.",
                "10. Task."
        };
        Arrays.sort(input, new LexSort());
        assertThat(input).containsExactly(output);
    }
}
