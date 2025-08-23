package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор {@code JobDescByPriority} выполняет сравнение объектов {@link Job}
 * по приоритету в порядке убывания.
 *
 * <p>Используется для сортировки списка работ по приоритету от большего к меньшему,
 * а также может комбинироваться с другими компараторами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *     new Job("Fix bug", 1),
 *     new Job("X task", 2),
 *     new Job("Implement feature", 3)
 * );
 * jobs.sort(new JobDescByPriority());
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='Implement feature', priority=3},
 *  Job{name='X task', priority=2},
 *  Job{name='Fix bug', priority=1}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JobDescByPriority implements Comparator<Job> {
    /**
     * Сравнивает два объекта {@link Job} по приоритету в порядке убывания.
     *
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return отрицательное число, если приоритет o2 больше o1,
     *         положительное число, если приоритет o2 меньше o1,
     *         ноль, если приоритеты равны
     */
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getPriority(), o1.getPriority());
    }
}
