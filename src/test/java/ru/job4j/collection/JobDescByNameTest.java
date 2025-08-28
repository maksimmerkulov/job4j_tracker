package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code JobDescByNameTest} содержит модульный тест
 * для проверки сортировки объектов {@link Job}
 * с использованием компаратора {@link JobDescByName}.
 *
 * <p>Проверяется корректность работы сравнения по убыванию имени задачи.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int rsl = new JobDescByName().compare(
 *         new Job("A task", 1),
 *         new Job("B task", 1)
 * );
 * assertThat(rsl).isGreaterThan(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class JobDescByNameTest {

    /**
     * Проверяет, что компаратор {@link JobDescByName}
     * корректно сортирует задачи по убыванию имени.
     *
     * <p>Сравниваются две задачи: "A task" и "B task".
     * Ожидается, что результат будет больше нуля,
     * так как "B task" должно идти раньше "A task".</p>
     */
    @Test
    public void whenDescByName() {
        int rsl = new JobDescByName().compare(
                new Job("A task", 1),
                new Job("B task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}
