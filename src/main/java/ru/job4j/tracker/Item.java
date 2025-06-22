package ru.job4j.tracker;

import java.time.LocalDateTime;

/**
 * Модель заявления.
 *
 * <p>Класс {@code Item} используется для хранения данных о заявках,
 * включая уникальный идентификатор (ID), название и дату создания.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
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
     * Дата и время создания заявки.
     */
    private LocalDateTime created = LocalDateTime.now();

    /**
     * Создает новый экземпляр класса {@code Item}
     * и инициализирует его поля значениями по умолчанию.</p>
     */
    public Item() {
    }

    /**
     * Создает новый экземпляр класса {@code Item}
     * и инициализирует его поле {@code name}.</p>
     *
     * @param name Название заявки.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Создает новый экземпляр класса {@code Item}
     * и инициализирует его поля {@code id} и {@code name}.</p>
     *
     * @param id Уникальный идентификатор (ID) заявки.
     * @param name Название заявки.
     */
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Возвращает уникальный идентификатор (ID) заявки.
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
     * Возвращает название заявки.
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

    /**
     * Возвращает дату и время создания заявки.
     *
     * @return Дата и время создания заявки.
     */
    public LocalDateTime getCreated() {
        return created;
    }
}