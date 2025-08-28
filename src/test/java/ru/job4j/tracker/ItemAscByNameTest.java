package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ItemAscByNameTest} содержит модульные тесты
 * для проверки корректной работы сортировки заявок {@link Item}
 * по имени в порядке возрастания с помощью {@link ItemAscByName}.
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * List<Item> items = Arrays.asList(
 *         new Item("Reboot server"),
 *         new Item("Impl task"),
 *         new Item("Fix bugs")
 * );
 * List<Item> expected = Arrays.asList(
 *         new Item("Fix bugs"),
 *         new Item("Impl task"),
 *         new Item("Reboot server")
 * );
 * Collections.sort(items, new ItemAscByName());
 * assertThat(items).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class ItemAscByNameTest {

    /**
     * Проверяет, что после сортировки список элементов
     * располагается в алфавитном порядке по полю {@code name}
     * в порядке возрастания.
     */
    @Test
    void whenSortByNameAscThenSortedList() {
        List<Item> items = Arrays.asList(
                new Item("Reboot server"),
                new Item("Impl task"),
                new Item("Fix bugs")
        );
        List<Item> expected = Arrays.asList(
                new Item("Fix bugs"),
                new Item("Impl task"),
                new Item("Reboot server")
        );
        Collections.sort(items, new ItemAscByName());
        assertThat(items).isEqualTo(expected);
    }
}
