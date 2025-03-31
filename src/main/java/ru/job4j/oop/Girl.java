package ru.job4j.oop;

/**
 * Класс {@code Girl} представляет собой персонажа Красную Шапочку,
 * которая может позвать Петю на помощь.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Girl {

    /**
     * Метод {@code help} позволяет Красной Шапочке позвать Петю на помощь.
     *
     * @param pioneer Объект класса {@code Pioneer}, который может прийти на помощь.
     */
    public void help(Pioneer pioneer) {
        System.out.println("Красная Шапочка позвала Петю на помощь.");
    }
}