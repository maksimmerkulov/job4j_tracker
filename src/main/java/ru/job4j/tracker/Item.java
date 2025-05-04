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
 *     System.out.println(item);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     Item{id=1, name='Bug report', created=26-апреля-суббота-2025 14:35:12}
 * }</pre>
 *
 * @author Maksим Merkulоv
 * @version 1.6
 */
public class Item {

    /**
     * Форматтер для преобразования {@link LocalDateTime} в строку.
     *
     * <p>Используется для форматирования даты и времени создания заявления
     * в формате {@code dd-MMMM-EEEE-yyyy HH:mm:ss}.</p>
     */
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");

    /**
     * Уникальный идентификатор (ID) заявления.
     */
    private int id;

    /**
     * Название заявления.
     *
     */
    private String name;

    /**
     * Дата и время создания заявления.
     *
     */
    private final LocalDateTime created = LocalDateTime.now();

    /**
     * Конструктор по умолчанию. Поля не инициализированы.
     */
    public Item() {
    }

    /**
     * Конструктор с параметром {@code name}.
     *
     * @param name название заявления.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Конструктор с параметрами {@code id} и {@code name}.
     *
     * @param id   уникальный идентификатор (ID) заявления.
     * @param name название заявления.
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Возвращает значение поля {@code id}.
     *
     * @return значение поля {@code id}.
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает значение поля {@code id}.
     *
     * @param id новое значение для поля {@code id}.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Возвращает значение поля {@code name}.
     *
     * @return значение поля {@code name}.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает значение поля {@code name}.
     *
     * @param name новое значение для поля {@code name}.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает значение поля {@code created}.
     *
     * @return значение поля {@code created}.
     */
    public LocalDateTime getCreated() {
        return created;
    }

    /**
     * Возвращает строковое представление объекта {@link Item}.
     *
     * <p>В строке выводятся значения полей {@code id}, {@code name} и отформатированная дата {@code created}.</p>
     *
     * <p>Дата форматируется согласно шаблону {@code dd-MMMM-EEEE-yyyy HH:mm:ss}, например:</p>
     * <pre>{@code
     *     Item{id=1, name='Bug report', created=23-апреля-среда-2025 14:50:30}
     * }</pre>
     *
     * @return строка, представляющая объект {@link Item}.
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