package ru.job4j.search;

import java.util.LinkedList;

/**
 * Priority queue for tasks based on their priority level.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class PriorityQueue {

    /** The list of tasks in the queue. */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Adds a task to the queue in the correct position by priority.
     *
     * @param task the task to add
     */
    public void put(Task task) {
        var index = 0;
        for (var element : tasks) {
            if (task.getPriority() < element.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Returns and removes the first task from the queue.
     *
     * @return the task, or {@code null} if the queue is empty
     */
    public Task take() {
        return tasks.poll();
    }
}
