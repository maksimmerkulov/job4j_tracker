package ru.job4j.inheritance;

/**
 * Класс {@code Child} наследуется от {@link Parent} и представляет ребенка,
 * у которого дополнительно указывается отчество.
 *
 * <p>Расширяет базовый класс {@link Parent}, добавляя поле {@code patronymic}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Child extends Parent {

    /**
     * Отчество ребенка.
     */
    private String patronymic;

    /**
     * Конструктор с тремя параметрами.
     *
     * <p>Создает объект {@code Child} с заданными именем, возрастом и отчеством.</p>
     *
     * @param name        Имя ребенка (наследуется).
     * @param age         Возраст ребенка (наследуется).
     * @param patronymic  Отчество ребенка.
     */
    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }
}