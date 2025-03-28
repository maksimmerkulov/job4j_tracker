package ru.job4j.oop;

/**
 * Класс {@code Cat} представляет собой простую модель кошки.
 * В этом примере создаются два экземпляра кошки в методе {@code main}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Cat {

    /**
     * Метод {@code main} создаёт два экземпляра класса {@code Cat}: {@code peppy} и {@code sparky}.
     *
     * @param args Аргументы командной строки (не используются в этом примере).
     */
    public static void main(String[] args) {
        Cat peppy  = new Cat();
        Cat sparky = new Cat();
    }
}