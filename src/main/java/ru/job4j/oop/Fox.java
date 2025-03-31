package ru.job4j.oop;

/**
 * Класс {@code Fox} представляет персонажа Лисы,
 * которая хитростью съедает Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Fox {

    /**
     * Метод {@code tryEat} позволяет Лисе попытаться съесть Колобка.
     * Лиса оказывается хитрее, и Колобок будет съеден.
     *
     * @param ball Объект класса {@code Ball}, которого Лиса хочет съесть.
     */
    public void tryEat(Ball ball) {
        System.out.println("Лиса попыталась съесть Колобка...");
        ball.tryRun(true);
    }
}
