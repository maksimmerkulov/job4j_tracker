package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор {@code JobDescByName} выполняет сравнение объектов {@link Job}
 * по названию в порядке убывания (лексикографически).
 *
 * <p>Используется для сортировки списка работ по имени в обратном алфавитном порядке,
 * а также может комбинироваться с другими компараторами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *     new Job("Fix bug", 1),
 *     new Job("X task", 2),
 *     new Job("Implement feature", 3)
 * );
 * jobs.sort(new JobDescByName());
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='X task', priority=2},
 *  Job{name='Implement feature', priority=3},
 *  Job{name='Fix bug', priority=1}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JobDescByName implements Comparator<Job> {
    /**
     * Сравнивает два объекта {@link Job} по названию в порядке убывания.
     *
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return отрицательное число, если название o2 лексикографически больше o1,
     *         положительное число, если название o2 меньше o1,
     *         ноль, если названия равны
     */
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
