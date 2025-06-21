package ru.job4j.inheritance;

/**
 * Класс {@code Base} представляет базовый (родительский) класс.
 *
 * <p>Содержит конструктор без параметров, который выводит сообщение при создании объекта.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Base base = new Base();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Default Base constructor.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Base {

    /**
     * Конструктор без параметров.
     *
     * <p>Выводит сообщение пользователю при создании объекта.</p>
     */
    public Base() {
        System.out.println("Default Base constructor.");
    }
}