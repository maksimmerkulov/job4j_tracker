package ru.job4j.oop;

/**
 * Класс {@code Wolf} представляет собой персонажа Волка,
 * который может попытаться съесть Красную Шапочку и Колобка.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Wolf {

    /**
     * Позволяет Волку попытаться съесть Красную Шапочку.
     *
     * @param girl объект класса {@link Girl}, которого волк хочет съесть
     */
    public void eat(Girl girl) {
        System.out.println("Волк попытался съесть Красную Шапочку.");
    }

    /**
     * Позволяет Волку попытаться съесть Колобка.
     * Колобок сбежит.
     *
     * @param ball объект класса {@link Ball}, которого Волк хочет съесть
     */
    public void tryEat(Ball ball) {
        System.out.println("Волк попытался съесть Колобка...");
        ball.tryRun(false);
    }
}
