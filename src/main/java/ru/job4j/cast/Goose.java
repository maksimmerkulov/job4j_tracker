package ru.job4j.cast;

/**
 * Класс {@code Goose} представляет собой животное – гуся.
 *
 * <p>Используется для демонстрации реализации интерфейса
 * {@link Animal} и воспроизведения звука.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal goose = new Goose();
 * goose.sound();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Goose произносит звук: Га-га.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Goose implements Animal {

    /**
     * Выводит звук, который издает гусь.
     *
     * <p>Формат вывода включает имя класса
     * и строку: " произносит звук: Га-га."</p>
     */
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName()
                + " произносит звук: Га-га");
    }
}