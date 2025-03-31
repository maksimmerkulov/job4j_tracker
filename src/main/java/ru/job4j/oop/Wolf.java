package ru.job4j.oop;

/**
 * Класс {@code Wolf} представляет собой персонажа Волка,
 * который может попытаться съесть Красную Шапочку и Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Wolf {

    /**
     * Метод {@code eat} позволяет Волку попытаться съесть Красную Шапочку.
     *
     * @param girl Объект класса {@code Girl}, которого волк хочет съесть.
     */
    public void eat(Girl girl) {
        System.out.println("Волк попытался съесть Красную Шапочку!");
    }

    /**
     * Метод {@code tryEat} позволяет Волку попытаться съесть Колобка.
     * Колобок сбежит.
     *
     * @param ball Объект класса {@code Ball}, которого Волк хочет съесть.
     */
    public void tryEat(Ball ball) {
        System.out.println("Волк попытался съесть Колобка...");
        ball.tryRun(false);
    }
}