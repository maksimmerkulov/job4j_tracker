package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code JobTest} содержит модульные тесты для проверки
 * работы различных компараторов, реализованных для класса {@link Job}.
 *
 * <p>В тестах проверяется корректность сравнения объектов по имени и приоритету
 * как по отдельности, так и в составе комбинированных компараторов.</p>
 *
 * <p><b>Проверяются следующие сценарии:</b></p>
 * <ul>
 *     <li>Сравнение по имени (по убыванию), затем по приоритету (по убыванию).</li>
 *     <li>Сравнение по имени (по возрастанию), затем по приоритету (по возрастанию).</li>
 *     <li>Сравнение по приоритету (по возрастанию), затем по имени (по возрастанию).</li>
 *     <li>Корректность работы цепочки компараторов при разных входных данных.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
 * int rsl = cmpNamePriority.compare(
 *        new Job("Impl task", 0),
 *        new Job("Fix bug", 1)
 * );
 * assertThat(rsl).isLessThan(0);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class JobTest {

    /**
     * Проверяет, что комбинированный компаратор
     * сначала сравнивает по имени (по убыванию),
     * а затем по приоритету (по убыванию).
     */
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    /**
     * Проверяет, что при одинаковых именах задачи
     * компаратор по возрастанию имени и приоритета
     * корректно сортирует по приоритету.
     */
    @Test
    public void whenAscByNameThenAscByPriority() {
        Comparator<Job> cmp = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmp.compare(
                new Job("Task", 1),
                new Job("Task", 2)
        );
        assertThat(rsl).isLessThan(0);
    }

    /**
     * Проверяет, что при сортировке по имени (убывание)
     * и по приоритету (убывание) результат сравнения положителен,
     * если первый объект "меньше" по имени.
     */
    @Test
    public void whenDescByNameThenDescByPriority() {
        Comparator<Job> cmp = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmp.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl).isGreaterThan(0);
    }

    /**
     * Проверяет, что компаратор по приоритету (возрастание),
     * а затем по имени (возрастание) сортирует корректно.
     */
    @Test
    public void whenAscByPriorityThenAscByName() {
        Comparator<Job> cmp = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmp.compare(
                new Job("B task", 1),
                new Job("A task", 1)
        );
        assertThat(rsl).isGreaterThan(0);
    }
}
