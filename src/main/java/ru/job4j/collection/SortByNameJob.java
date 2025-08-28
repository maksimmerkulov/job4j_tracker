package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс {@code SortByNameJob} реализует интерфейс {@link Comparator}
 * для сравнения объектов {@link Job} по их названию в порядке возрастания.
 *
 * <p>Используется для сортировки коллекций {@code Job} по имени.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *         new Job("Reboot server", 1),
 *         new Job("Impl task", 2),
 *         new Job("Fix bugs", 4)
 * );
 * System.out.println(jobs);
 * Collections.sort(jobs, new SortByNameJob());
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='Reboot server', priority=1},
 *  Job{name='Impl task', priority=2},
 *  Job{name='Fix bugs', priority=4}]
 *
 * [Job{name='Fix bugs', priority=4},
 *  Job{name='Impl task', priority=2},
 *  Job{name='Reboot server', priority=1}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class SortByNameJob implements Comparator<Job> {

    /**
     * Сравнивает два объекта {@link Job} по их названию.
     *
     * <p>Сравнение выполняется в лексикографическом порядке.</p>
     *
     * @param left первый объект {@code Job} для сравнения
     * @param right второй объект {@code Job} для сравнения
     * @return отрицательное число, если {@code left < right};
     *         ноль, если {@code left == right};
     *         положительное число, если {@code left > right}
     */
    @Override
    public int compare(Job left, Job right) {
        return left.getName().compareTo(right.getName());
    }
}
