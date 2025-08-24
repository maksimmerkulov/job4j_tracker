package ru.job4j.queue;

/**
 * Класс {@code Task} представляет задачу с должностью, описанием и уровнем срочности.
 *
 * <p>Используется в {@link ScheduleTask} для управления приоритетной очередью задач.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Task task = new Task(Position.DIRECTOR, "Prepare report", 5);
 * System.out.println(task.position());
 * System.out.println(task.description());
 * System.out.println(task.urgency());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * DIRECTOR
 * Prepare report
 * 5
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Task(Position position,
                   String description,
                   int urgency) {
}
