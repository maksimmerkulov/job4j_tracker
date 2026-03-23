package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates the usage of Java Streams for filtering, mapping,
 * and reducing a list of tasks.
 *
 * <p>Example output:
 * <pre>{@code
 * Task{name='Bug #1', spent=100}
 * Task{name='Bug #3', spent=100}
 *
 * Bug #1
 * Task #2
 * Bug #3
 *
 * Total spent: 300
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StreamUsage {

    /**
     * Represents a task with a name and time spent.
     */
    public static class Task {

        /** The name of the task. */
        private final String name;

        /** The time spent on the task. */
        private final long spent;

        /**
         * Creates a new {@code Task} with the specified name and spent time.
         *
         * @param name  the name of the task
         * @param spent the time spent on the task
         */
        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }

        /**
         * Returns a string representation of the task.
         *
         * @return the formatted string
         */
        @Override
        public String toString() {
            return "Task{"
                    + "name='" + name + '\''
                    + ", spent=" + spent
                    + '}';
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 100),
                new Task("Task #2", 100),
                new Task("Bug #3", 100)
        );

        List<Task> bugs = tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .collect(Collectors.toList());
        bugs.forEach(System.out::println);
        System.out.println();

        List<String> names = tasks.stream()
                .map(task -> task.name)
                .collect(Collectors.toList());
        names.forEach(System.out::println);
        System.out.println();

        long total = tasks.stream()
                .map(task -> task.spent)
                .reduce(0L, Long::sum);
        System.out.println("Total spent: " + total);
    }
}
