package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code PriorityQueueTest} содержит модульные тесты для проверки работы {@link PriorityQueue}.
 *
 * <p>Тестируются различные сценарии поведения метода {@link PriorityQueue#put(Task)},
 * включая вставку задач с разным и одинаковым приоритетом, а также корректность работы
 * метода {@link PriorityQueue#take()}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PriorityQueueTest {

    /**
     * Проверяет, что задача с более высоким приоритетом (меньшим числом)
     * возвращается первой, даже если она была добавлена не первой.
     */
    @Test
    public void whenHigherPrioritySecond() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDescription()).isEqualTo("urgent");
    }

    /**
     * Проверяет, что при одинаковом приоритете задачи возвращаются в порядке добавления.
     */
    @Test
    public void whenHigherPriorityEquals() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 5));
        Task result = queue.take();
        assertThat(result.getDescription()).isEqualTo("low");
    }
}
