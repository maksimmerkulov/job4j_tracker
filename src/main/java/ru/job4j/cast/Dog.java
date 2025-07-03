package ru.job4j.cast;

/**
 * Класс {@code Dog} представляет собой животное – собаку.
 *
 * <p>Используется для демонстрации реализации интерфейса
 * {@link Animal} и воспроизведения звука.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal dog = new Dog();
 * dog.sound();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Dog произносит звук: Гав-гав.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Dog implements Animal {

    /**
     * Выводит звук, который издает собака.
     *
     * <p>Формат вывода включает имя класса
     * и строку: " произносит звук: Гав-гав."</p>
     */
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName()
                + " произносит звук: Гав-гав.");
    }
}