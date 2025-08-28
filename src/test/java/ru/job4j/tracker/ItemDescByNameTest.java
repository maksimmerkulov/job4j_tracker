package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ItemDescByNameTest} содержит модульные тесты
 * для проверки корректной работы сортировки заявок {@link Item}
 * по имени в порядке убывания с помощью {@link ItemDescByName}.
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * List<Item> items = Arrays.asList(
 *         new Item("Fix bugs"),
 *         new Item("Impl task"),
 *         new Item("Reboot server")
 * );
 * List<Item> expected = Arrays.asList(
 *         new Item("Reboot server"),
 *         new Item("Impl task"),
 *         new Item("Fix bugs")
 * );
 * Collections.sort(items, new ItemDescByName());
 * assertThat(items).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class ItemDescByNameTest {

    /**
     * Проверяет, что после сортировки список элементов
     * располагается в алфавитном порядке по полю {@code name}
     * в порядке убывания.
     */
    @Test
    void whenSortByNameDescThenSortedList() {
        List<Item> items = Arrays.asList(
                new Item("Fix bugs"),
                new Item("Impl task"),
                new Item("Reboot server")
        );
        List<Item> expected = Arrays.asList(
                new Item("Reboot server"),
                new Item("Impl task"),
                new Item("Fix bugs")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }
}
