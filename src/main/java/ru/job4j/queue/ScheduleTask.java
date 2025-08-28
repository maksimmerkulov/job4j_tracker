package ru.job4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Класс {@code ScheduleTask} представляет очередь задач {@link Task} с заданным порядком
 * сортировки через {@link Comparator}.
 *
 * <p>Очередь используется для хранения задач с разными должностями и уровнями срочности.</p>
 *
 * <p>Методы класса позволяют:</p>
 * <ul>
 *   <li>Добавлять задачи в очередь {@link #addTask(Task)}</li>
 *   <li>Читать текущую задачу без удаления {@link #readTask()}</li>
 *   <li>Получать и удалять задачу из головы очереди {@link #getTask()}</li>
 * </ul>
 *
 * <p>Если очередь пуста, методы {@link #readTask()} и {@link #getTask()} возвращают {@code null}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Comparator<Task> comparator = new TaskByPositionAsc().thenComparing(new TaskByUrgencyDesc());
 * ScheduleTask schedule = new ScheduleTask(comparator);
 * schedule.addTask(new Task(Position.DIRECTOR, "Prepare report", 5));
 * schedule.addTask(new Task(Position.MANAGER, "Check emails", 3));
 * Task current = schedule.readTask();
 * Task next = schedule.getTask();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * current.description() -> "Prepare report"
 * next.description()    -> "Prepare report"
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ScheduleTask {

    /**
     * Очередь задач с заданным компаратором.
     */
    private PriorityQueue<Task> queue;

    /**
     * Конструктор создает очередь с указанным компаратором.
     *
     * @param comparator компаратор для сортировки задач
     */
    public ScheduleTask(Comparator<Task> comparator) {
        this.queue = new PriorityQueue<>(comparator);
    }

    /**
     * Добавляет задачу в очередь.
     *
     * @param task задача для добавления
     */
    public void addTask(Task task) {
        queue.offer(task);
    }

    /**
     * Читает задачу из головы очереди без удаления.
     *
     * @return задача из головы очереди или {@code null}, если очередь пуста
     */
    public Task readTask() {
        return queue.peek();
    }

    /**
     * Получает и удаляет задачу из головы очереди.
     *
     * @return задача из головы очереди или {@code null}, если очередь пуста
     */
    public Task getTask() {
        return queue.poll();
    }
}
