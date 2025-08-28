package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс {@code SortDescByNameJob} реализует интерфейс {@link Comparator}
 * для сравнения объектов {@link Job} по их названию в порядке убывания.
 *
 * <p>Используется для сортировки коллекций {@code Job} по имени в убывающем порядке.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *     new Job("Fix bugs", 4),
 *     new Job("Impl task", 2),
 *     new Job("Reboot server", 1)
 * );
 * System.out.println(jobs);
 * Collections.sort(jobs, new SortDescByNameJob());
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='Fix bugs', priority=4},
 *  Job{name='Impl task', priority=2},
 *  Job{name='Reboot server', priority=1}]
 *
 * [Job{name='Reboot server', priority=1},
 *  Job{name='Impl task', priority=2},
 *  Job{name='Fix bugs', priority=4}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class SortDescByNameJob implements Comparator<Job> {

    /**
     * Сравнивает два объекта {@link Job} по их названию в обратном порядке.
     *
     * <p>Сравнение выполняется в убывающем лексикографическом порядке.</p>
     *
     * @param left первый объект {@code Job} для сравнения
     * @param right второй объект {@code Job} для сравнения
     * @return отрицательное число, если {@code right < left};
     *         ноль, если {@code left == right};
     *         положительное число, если {@code right > left}
     */
    @Override
    public int compare(Job left, Job right) {
        return right.getName().compareTo(left.getName());
    }
}
