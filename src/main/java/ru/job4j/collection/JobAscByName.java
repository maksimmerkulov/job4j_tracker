package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор {@code JobAscByName} выполняет сравнение объектов {@link Job}
 * по имени в порядке возрастания.
 *
 * <p>Используется для сортировки списка работ по имени в алфавитном порядке,
 * а также может комбинироваться с другими компараторами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *     new Job("Fix bug", 1),
 *     new Job("X task", 2),
 *     new Job("Implement feature", 3)
 * );
 * jobs.sort(new JobAscByName());
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='Fix bug', priority=1},
 *  Job{name='Implement feature', priority=3},
 *  Job{name='X task', priority=2}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JobAscByName implements Comparator<Job> {
    /**
     * Сравнивает два объекта {@link Job} по имени в порядке возрастания.
     *
     * @param o1 первый объект для сравнения
     * @param o2 второй объект для сравнения
     * @return отрицательное число, если имя o1 меньше имени o2,
     *         положительное число, если имя o1 больше имени o2,
     *         ноль, если имена равны
     */
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
