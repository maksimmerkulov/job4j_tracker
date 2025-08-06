package ru.job4j.search;

/**
 * Класс {@code Task} представляет собой задачу с описанием и приоритетом.
 *
 * <p>Используется в списках дел, менеджерах задач, планировщиках и других системах,
 * где требуется хранить описание задачи и ее приоритет.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Task task = new Task("Позвонить клиенту", 1);
 * String text = task.getDescription();
 * int level = task.getPriority();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Позвонить клиенту
 * 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Task {

    /**
     * Описание задачи.
     */
    private String description;

    /**
     * Приоритет задачи.
     */
    private int priority;

    /**
     * Создает задачу с заданным описанием и приоритетом.
     *
     * @param description Текстовое описание задачи.
     * @param priority Приоритет задачи.
     */
    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    /**
     * Возвращает описание задачи.
     *
     * @return Описание задачи.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Возвращает приоритет задачи.
     *
     * @return Приоритет задачи.
     */
    public int getPriority() {
        return priority;
    }
}
