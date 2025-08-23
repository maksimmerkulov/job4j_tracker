package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code JobAscByPriorityTest} содержит модульный тест
 * для проверки работы компаратора {@link JobAscByPriority},
 * выполняющего сортировку объектов {@link Job} по возрастанию приоритета.
 *
 * <p>Тест проверяют, что объекты {@link Job} корректно сравниваются
 * в случае различий в значении приоритета.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int rsl = new JobAscByPriority().compare(
 *         new Job("Task", 1),
 *         new Job("Task", 2)
 * );
 * assertThat(rsl).isLessThan(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class JobAscByPriorityTest {
    /**
     * Проверяет, что при сортировке по возрастанию приоритета
     * задача с меньшим приоритетом считается "меньше".
     */
    @Test
    public void whenAscByPriority() {
        int rsl = new JobAscByPriority().compare(
                new Job("Task", 1),
                new Job("Task", 2)
        );
        assertThat(rsl).isLessThan(0);
    }
}
