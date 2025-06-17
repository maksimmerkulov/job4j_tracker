package ru.job4j.oop;

/**
 * Класс {@code Ball} представляет персонажа Колобка, который может пытаться
 * убежать от других персонажей: {@link Hare}, {@link Wolf} и {@link Fox}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Ball {

    /**
     * Определяет судьбу Колобка.
     *
     * @param condition {@code true} – Колобок съеден,
     *                  {@code false} – Колобок сбежал.
     */
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден!");
        } else {
            System.out.println("Колобок сбежал!");
        }
    }
}