package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code JobAscByNameTest} содержит модульный тест
 * для проверки работы компаратора {@link JobAscByName},
 * который сортирует объекты {@link Job} по имени в порядке возрастания.
 *
 * <p>Проверяется, что при сравнении двух задач с разными именами
 * результат соответствует алфавитному порядку.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * int rsl = new JobAscByName().compare(
 *         new Job("A task", 1),
 *         new Job("B task", 1)
 * );
 * assertThat(rsl).isLessThan(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class JobAscByNameTest {
    /**
     * Проверяет, что компаратор {@link JobAscByName}
     * сортирует задачи по имени в алфавитном порядке.
     *
     * <p>В тесте создаются две задачи: {@code "A task"} и {@code "B task"}.
     * Ожидается, что при сравнении результат будет меньше нуля,
     * так как {@code "A task"} идет раньше.</p>
     */
    @Test
    public void whenAscByName() {
        int rsl = new JobAscByName().compare(
                new Job("A task", 1),
                new Job("B task", 1)
        );
        assertThat(rsl).isLessThan(0);
    }
}
