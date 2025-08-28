package ru.job4j.collection;

/**
 * Класс {@code Task} представляет собой модель задачи с уникальным номером и описанием.
 *
 * <p>Используется для хранения информации о задаче, где поле {@code number}
 * служит уникальным идентификатором, а {@code description} — текстовым описанием.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Task task = new Task("1", "Починить баг в модуле оплаты");
 * System.out.println(task.getNumber());
 * System.out.println(task.getDescription());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 1
 * Починить баг в модуле оплаты
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Task {

    /**
     * Уникальный номер задачи.
     */
    private String number;

    /**
     * Текстовое описание задачи.
     */
    private String description;

    /**
     * Конструктор для создания задачи.
     *
     * @param number уникальный номер задачи
     * @param description текстовое описание задачи
     */
    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    /**
     * Возвращает уникальный номер задачи.
     *
     * @return номер задачи
     */
    public String getNumber() {
        return number;
    }

    /**
     * Возвращает описание задачи.
     *
     * @return текстовое описание задачи
     */
    public String getDescription() {
        return description;
    }
}
