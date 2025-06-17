package ru.job4j.oop;

/**
 * Класс {@code Girl} представляет собой персонажа Красную Шапочку,
 * которая может позвать Петю на помощь.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Girl {

    /**
     * Позволяет Красной Шапочке позвать Петю на помощь.
     *
     * @param pioneer Объект класса {@link Pioneer}, который может прийти на помощь.
     */
    public void help(Pioneer pioneer) {
        System.out.println("Красная Шапочка позвала Петю на помощь.");
    }
}