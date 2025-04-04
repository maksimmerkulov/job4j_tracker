package ru.job4j.oop;

/**
 * Класс {@code Hare} представляет персонажа Зайца,
 * который пытается съесть Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class Hare {

    /**
     * Метод {@code tryEat(Ball ball)} позволяет Зайцу попытаться съесть Колобка.
     * Однако Колобок сбежит.
     *
     * @param ball Объект класса {@link Ball}, которого Заяц хочет съесть.
     */
    public void tryEat(Ball ball) {
        System.out.println("Заяц попытался съесть Колобка...");
        ball.tryRun(false);
    }
}

