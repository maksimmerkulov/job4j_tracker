package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code JobDescByPriorityTest} содержит модульный тест
 * для проверки корректности сортировки задач по приоритету
 * в порядке убывания с использованием компаратора {@link JobDescByPriority}.
 *
 * <p>Проверяется, что задача с большим приоритетом считается "меньше"
 * и располагается раньше в отсортированной коллекции.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int rsl = new JobDescByPriority().compare(
 *         new Job("Task", 1),
 *         new Job("Task", 2)
 * );
 * assertThat(rsl).isGreaterThan(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class JobDescByPriorityTest {
    /**
     * Проверяет, что компаратор {@link JobDescByPriority}
     * сортирует задачи по приоритету в порядке убывания.
     *
     * <p>Задача с приоритетом {@code 2} должна располагаться
     * раньше задачи с приоритетом {@code 1}.</p>
     */
    @Test
    public void whenDescByPriority() {
        int rsl = new JobDescByPriority().compare(
                new Job("Task", 1),
                new Job("Task", 2)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}
