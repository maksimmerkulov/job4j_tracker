package ru.job4j.oop;

/**
 * Класс {@code College} представляет собой пример работы с приведением типов
 * в контексте иерархии классов {@link Freshman} и {@link Student}.
 *
 * <p>Используется для демонстрации восходящего приведения объектов,
 * когда объект {@link Freshman} приводится к типу {@link Student} и {@link Object}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class College {

    /**
     * Точка входа в программу, демонстрирующая иерархию классов.
     *
     * <p>Иллюстрирует восходящее приведение объекта класса {@link Freshman}
     * к типу родительского класса {@link Student}, а затем к {@link Object}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;
    }
}