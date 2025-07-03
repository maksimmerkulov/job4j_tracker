package ru.job4j.cast;

/**
 * Класс {@code Cow} представляет собой животное – корову.
 *
 * <p>Используется для демонстрации реализации интерфейса
 * {@link Animal} и воспроизведения звука.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal cow = new Cow();
 * cow.sound();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Cow произносит звук: Му-му.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Cow implements Animal {

    /**
     * Выводит звук, который издает корова.
     *
     * <p>Формат вывода включает имя класса
     * и строку: " произносит звук: Му-му."</p>
     */
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName()
                + " произносит звук: Му-му.");
    }
}