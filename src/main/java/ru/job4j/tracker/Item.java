package ru.job4j.tracker;

/**
 * Модель заявления.
 *
 * <p>Класс {@code Item} используется для хранения данных о заявках,
 * включая уникальный идентификатор (ID) и название.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Item {

    /**
     * Уникальный идентификатор (ID) заявки.
     */
    private int id;

    /**
     * Название заявки.
     */
    private String name;

    /**
     * Конструктор по умолчанию.
     *
     * <p>Инициализирует поля стандартными (по умолчанию) значениями.</p>
     */
    public Item() {
    }

    /**
     * Конструктор с одним параметром.
     *
     * <p>Инициализирует поле {@code name}.</p>
     *
     * @param name Название заявки.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Конструктор с двумя параметрами.
     *
     * <p>Инициализирует поля {@code id} и {@code name}.<p>
     *
     * @param id Уникальный идентификатор (ID) заявки.
     * @param name Название заявки.
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Получает уникальный идентификатор (ID) заявки.
     *
     * @return Уникальный идентификатор (ID) заявки.
     */
    public int getId() {
        return id;
    }

    /**
     * Устанавливает новый уникальный идентификатор (ID) заявки.
     *
     * @param id Новый идентификатор (ID) заявки.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Получает название заявки.
     *
     * @return Название заявки.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает новое название заявки.
     *
     * @param name Новое название заявки.
     */
    public void setName(String name) {
        this.name = name;
    }
}