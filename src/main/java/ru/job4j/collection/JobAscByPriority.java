package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор {@code JobAscByPriority} выполняет сравнение объектов {@link Job}
 * по приоритету в порядке возрастания.
 *
 * <p>Используется для сортировки списка работ по приоритету от меньшего к большему,
 * а также может комбинироваться с другими компараторами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *     new Job("Fix bug", 3),
 *     new Job("X task", 1),
 *     new Job("Implement feature", 2)
 * );
 * jobs.sort(new JobAscByPriority());
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='X task', priority=1},
 *  Job{name='Implement feature', priority=2},
 *  Job{name='Fix bug', priority=3}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JobAscByPriority implements Comparator<Job> {
    /**
     * Сравнивает два объекта {@link Job} по приоритету в порядке возрастания.
     *
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return отрицательное число, если приоритет o1 меньше o2,
     *         положительное число, если приоритет o1 больше o2,
     *         ноль, если приоритеты равны
     */
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o1.getPriority(), o2.getPriority());
    }
}
