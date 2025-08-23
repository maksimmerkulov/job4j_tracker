package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Класс {@code JobSorter} демонстрирует сортировку списка объектов {@link Job}.
 *
 * <p>В примере создается список работ, который сортируется с использованием комбинированного компаратора:
 * сначала по длине названия в порядке убывания ({@link JobDescByNameLength}),
 * затем по названию в порядке убывания ({@link JobDescByName}),
 * а при совпадении названий и длины — по приоритету в порядке убывания ({@link JobDescByPriority}).</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *         new Job("Fix bug", 1),
 *         new Job("Fix bug", 4),
 *         new Job("Fix bug", 2),
 *         new Job("X task", 0)
 * );
 * Comparator<Job> combine = new JobDescByNameLength()
 *         .thenComparing(new JobDescByName())
 *         .thenComparing(new JobDescByPriority());
 * Collections.sort(jobs, combine);
 * System.out.println(jobs);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Job{name='X task', priority=0},
 *  Job{name='Fix bug', priority=4},
 *  Job{name='Fix bug', priority=2},
 *  Job{name='Fix bug', priority=1}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class JobSorter {
    /**
     * Точка входа в программу.
     *
     * <p>Создает список работ, сортирует его с использованием
     * комбинированного компаратора по длине названия,
     * затем по названию и при совпадении — по приоритету,
     * после чего выводит отсортированный список.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        Comparator<Job> combine = new JobDescByNameLength()
                .thenComparing(new JobDescByName())
                .thenComparing(new JobDescByPriority());
        Collections.sort(jobs, combine);
        System.out.println(jobs);
    }
}
