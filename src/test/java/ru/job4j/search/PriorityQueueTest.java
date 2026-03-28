package ru.job4j.search;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link PriorityQueue} class.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class PriorityQueueTest {

    /**
     * Verifies that the task with higher priority is returned first.
     */
    @Test
    void whenHigherPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        var result = queue.take();
        assertThat(result.getDescription()).isEqualTo("urgent");
    }

    /**
     * Verifies FIFO behavior for tasks with equal priority.
     */
    @Test
    void whenEqualPriority() {
        var queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 5));
        queue.put(new Task("middle", 5));
        var result = queue.take();
        assertThat(result.getDescription()).isEqualTo("low");
    }
}
