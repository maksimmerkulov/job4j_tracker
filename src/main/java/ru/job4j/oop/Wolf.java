package ru.job4j.oop;

/**
 * Класс {@code Wolf} представляет собой персонажа Волка,
 * который может попытаться съесть Красную Шапочку и Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class Wolf {

    /**
     * Метод {@code eat(Girl girl)} позволяет Волку попытаться съесть Красную Шапочку.
     *
     * @param girl Объект класса {@link Girl}, которого волк хочет съесть.
     */
    public void eat(Girl girl) {
        System.out.println("Волк попытался съесть Красную Шапочку!");
    }

    /**
     * Метод {@code tryEat(Ball ball)} позволяет Волку попытаться съесть Колобка.
     * Колобок сбежит.
     *
     * @param ball Объект класса {@link Ball}, которого Волк хочет съесть.
     */
    public void tryEat(Ball ball) {
        System.out.println("Волк попытался съесть Колобка...");
        ball.tryRun(false);
    }
}