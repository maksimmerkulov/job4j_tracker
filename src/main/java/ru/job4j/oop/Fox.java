package ru.job4j.oop;

/**
 * Класс {@code Fox} представляет персонажа Лисы,
 * которая хитростью съедает Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class Fox {

    /**
     * Метод {@code tryEat(Ball ball)} позволяет Лисе попытаться съесть Колобка.
     * Лиса оказывается хитрее, и Колобок будет съеден.
     *
     * @param ball Объект класса {@link Ball}, которого Лиса хочет съесть.
     */
    public void tryEat(Ball ball) {
        System.out.println("Лиса попыталась съесть Колобка...");
        ball.tryRun(true);
    }
}