package ru.job4j.collection;

import java.util.Arrays;
import java.util.List;

/**
 * Класс {@code JobSorter} демонстрирует сортировку списка работ.
 *
 * <p>В примере создается список объектов {@link Job}, который сначала
 * выводится в исходном порядке, а затем сортируется по названию в порядке
 * убывания с использованием {@link SortDescByNameJob}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Job> jobs = Arrays.asList(
 *     new Job("Fix bugs", 4),
 *     new Job("Impl task", 2),
 *     new Job("Reboot server", 1)
 * );
 * System.out.println(jobs);
 * jobs.sort(new SortDescByNameJob());
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
 * @version 1.0
 */
public class JobSorter {

    /**
     * Точка входа в программу.
     *
     * <p>Создает список работ, выводит его, сортирует по убыванию
     * названия и выводит отсортированный список.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bugs", 4),
                new Job("Impl task", 2),
                new Job("Reboot server", 1)
        );
        System.out.println(jobs);
        jobs.sort(new SortDescByNameJob());
        System.out.println(jobs);
    }
}
