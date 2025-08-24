package ru.job4j.queue;

import java.util.Comparator;

/**
 * Компаратор {@code TaskByPositionAsc} сортирует задачи {@link Task} по должности
 * в порядке возрастания (от более высокого к низкому рангу должности согласно
 * порядку элементов {@link Position}).
 *
 * <p>Используется, например, в {@link ScheduleTask} для приоритетной сортировки задач по должности.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Comparator<Task> comparator = new TaskByPositionAsc();
 * Task task1 = new Task(Position.MANAGER, "Task 1", 5);
 * Task task2 = new Task(Position.DIRECTOR, "Task 2", 3);
 * int result = comparator.compare(task1, task2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * result > 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TaskByPositionAsc implements Comparator<Task> {

    /**
     * Сравнивает две задачи по должности.
     *
     * @param o1 первая задача
     * @param o2 вторая задача
     * @return отрицательное число, если o1 < o2;
     *         ноль, если равны;
     *         положительное число, если o1 > o2
     */
    @Override
    public int compare(Task o1, Task o2) {
        return o1.position().compareTo(o2.position());
    }
}
