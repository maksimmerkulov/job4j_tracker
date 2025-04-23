package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Модель заявления.
 *
 * <p>Класс {@code Item} используется для хранения данных о заявлении,
 * включая уникальный идентификатор (ID), название и дату создания.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 *     Item item = new Item(1, "Bug report");
 *     System.out.println(item.getName());    Bug report
 * }</pre>
 *
 * @author Maksим Merkulов
 * @version 1.4
 * @since 2025-04-23
 */
public class Item {

    /**
     * Форматтер для преобразования {@link LocalDateTime} в строку.
     * Используется для форматирования даты и времени создания заявления
     * в формате {@code dd-MMMM-EEEE-yyyy HH:mm:ss}.
     */
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    /**
     * Поле {@code id} содержит уникальный идентификатор (ID) заявления.
     */
    private int id;

    /**
     * Поле {@code name} содержит название заявления.
     */
    private String name;

    /**
     * Поле {@code created} содержит дату и время создания заявления.
     * Инициализируется текущим моментом при создании объекта.
     */
    private LocalDateTime created = LocalDateTime.now();

    /**
     * Явный конструктор {@code Item()} по умолчанию. Поля не инициализированы.
     */
    public Item() {
    }

    /**
     * Конструктор {@code Item(String name)} с параметром {@code name}.
     *
     * @param name Название заявления.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Конструктор с параметрами {@code id} и {@code name}.
     *
     * @param id   Уникальный идентификатор (ID) заявления.
     * @param name Название заявления.
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Метод {@code getId()} возвращает значение поля {@code id}.
     *
     * @return Значение поля {@code id}.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод {@code setId(int id)} устанавливает значение поля {@code id}.
     *
     * @param id Новое значение для поля {@code id}.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Метод {@code getName()} возвращает значение поля {@code name}.
     *
     * @return Значение поля {@code name}.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод {@code setName(String name)} устанавливает значение поля {@code name}.
     *
     * @param name Новое значение для поля {@code name}.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод {@code getCreated()} возвращает значение поля {@code created}.
     *
     * @return Значение поля {@code created}.
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Метод {@code toString()} возвращает строковое представление объекта {@link Item}.
     * В строке выводятся значения полей {@code id}, {@code name} и отформатированная дата {@code created}.
     *
     * <p>Дата форматируется согласно шаблону {@code dd-MMMM-EEEE-yyyy HH:mm:ss}, например:</p>
     * <pre>{@code
     *     Item{id=1, name='Bug report', created=23-апреля-среда-2025 14:50:30}
     * }</pre>
     *
     * @return Строка, представляющая объект {@link Item}.
     */
    @Override
    public String toString() {
        return "Item{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", created=" + created.format(FORMATTER)
                + '}';
    }
}