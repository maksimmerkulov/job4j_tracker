package ru.job4j.tracker;

/**
 * Класс {@code Item} представляет собой модель элемента с идентификатором и именем.
 * Используется в системе отслеживания заявок.
 * Предоставляет методы для управления идентификатором и именем элемента.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-01
 */
public class Item {

    /**
     * Поле {@code id} содержит уникальный идентификатор элемента.
     */
    private int id;

    /**
     * Поле {@code name} содержит название элемента.
     */
    private String name;

    /**
     * Явный конструктор {@code Item()} по умолчанию. Поля не инициализированы.
     */
    public Item() {
    }

    /**
     * Конструктор {@code Item(String name)} создаёт объект с указанным названием.
     *
     * @param name Поле {@code name}, содержащее название элемента.
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Конструктор {@code Item(int id, String name)} создаёт объект с указанными идентификатором и названием.
     *
     * @param id   Поле {@code id}, содержащее уникальный идентификатор элемента.
     * @param name Поле {@code name}, содержащее название элемента.
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
}