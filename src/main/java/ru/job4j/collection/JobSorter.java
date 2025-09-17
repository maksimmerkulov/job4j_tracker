package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates the sorting of {@link Job} objects using combined comparators.
 *
 * <p>Example output:
 * <pre>{@code
 * [Job{name='X task', priority=0},
 * Job{name='Fix bug', priority=4},
 * Job{name='Fix bug', priority=2},
 * Job{name='Fix bug', priority=1}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class JobSorter {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByName().thenComparing(new JobDescByPriority()));
        System.out.println(jobs);

        Comparator<Job> compareName = Comparator.comparing(Job::getName);
        Comparator<Job> comparePriority =
                Comparator.comparingInt(Job::getPriority);
        Comparator<Job> combine = compareName.thenComparing(comparePriority);

        jobs.sort(combine);
    }
}
