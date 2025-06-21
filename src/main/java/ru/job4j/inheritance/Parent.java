package ru.job4j.inheritance;

/**
 * Класс {@code Parent} представляет родителя с именем и возрастом.
 *
 * <p>Используется как базовый класс для наследования.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Parent {

    /**
     * Имя родителя.
     */
    private String name;

    /**
     * Возраст родителя.
     */
    private int age;

    /**
     * Конструктор с двумя параметрами.
     *
     * <p>Создает объект {@code Parent} с заданными именем и возрастом.</p>
     *
     * @param name Имя родителя.
     * @param age  Возраст родителя.
     */
    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}