package ru.job4j.oop;

/**
 * Класс {@code Ball} представляет персонажа Колобка,
 * который может пытаться убежать от других персонажей.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Ball {

    /**
     * Метод {@code tryRun(boolean condition)} определяет судьбу Колобка.
     *
     * @param condition Значение {@code true} - Колобок съеден;
     *                  значение {@code false} - Колобок сбежал.
     */
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден!");
        } else {
            System.out.println("Колобок сбежал!");
        }
    }
}
