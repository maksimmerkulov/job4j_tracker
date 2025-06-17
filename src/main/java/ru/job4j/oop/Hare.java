package ru.job4j.oop;

/**
 * Класс {@code Hare} представляет персонажа Зайца,
 * который пытается съесть Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Hare {

    /**
     * Позволяет Зайцу попытаться съесть Колобка.
     * Колобок сбежит.
     *
     * @param ball Объект класса {@link Ball}, которого Заяц хочет съесть.
     */
    public void tryEat(Ball ball) {
        System.out.println("Заяц попытался съесть Колобка...");
        ball.tryRun(false);
    }
}