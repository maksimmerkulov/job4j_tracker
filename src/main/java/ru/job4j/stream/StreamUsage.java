package ru.job4j.stream;

import java.util.List;

/**
 * Demonstrates the usage of Java Streams to filter tasks by name
 * and spent time.
 *
 * <p>Example output:
 * <pre>{@code
 * Bug #3 40
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
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
         * @param name the name of the task
         * @param spent the time spent on the task
         */
        public Task(String name, long spent) {
            this.name = name;
            this.spent = spent;
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bug #1", 10),
                new Task("Task #2", 20),
                new Task("Bug #3", 40)
        );
        tasks.stream()
                .filter(task -> task.name.contains("Bug"))
                .filter(task -> task.spent > 30)
                .map(task -> task.name + " " + task.spent)
                .forEach(System.out::println);
    }
}
