package ru.job4j.queue;

import java.util.Comparator;

/**
 * Компаратор {@code TaskByUrgencyDesc} сортирует задачи {@link Task} по уровню срочности
 * в порядке убывания (чем выше значение {@link Task#urgency()}, тем выше приоритет задачи).
 *
 * <p>Используется, например, в {@link ScheduleTask} для приоритетной сортировки задач по срочности.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Comparator<Task> comparator = new TaskByUrgencyDesc();
 * Task task1 = new Task(Position.MANAGER, "Task 1", 5);
 * Task task2 = new Task(Position.DIRECTOR, "Task 2", 8);
 * int result = comparator.compare(task1, task2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result > 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class TaskByUrgencyDesc implements Comparator<Task> {

    /**
     * Сравнивает две задачи по уровню срочности.
     *
     * @param o1 первая задача
     * @param o2 вторая задача
     * @return отрицательное число, если o1 срочнее o2;
     *         ноль, если срочность равна;
     *         положительное число, если o1 менее срочная, чем o2
     */
    @Override
    public int compare(Task o1, Task o2) {
        return Integer.compare(o2.urgency(), o1.urgency());
    }
}
