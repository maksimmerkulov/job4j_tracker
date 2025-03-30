package ru.job4j.oop;

/**
 * Класс {@code Cat} представляет собой простую модель кошки.
 * В этом примере создаются два экземпляра кошки в методе {@code main}.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-03-30
 */
public class Cat {

    /**
     * Метод {@code sound} возвращает звук, который издаёт кошка.
     *
     * @return Строка, представляющая звук кошки.
     */
    public String sound() {
        String voice = "may-may";
        return voice;
    }

    /**
     * Метод {@code main} создаёт два экземпляра класса {@code Cat}: {@code peppy} и {@code sparky}.
     * Затем получает звук, который издаёт кошка.
     *
     * @param args Аргументы командной строки (не используются в этом примере).
     */
    public static void main(String[] args) {
        Cat peppy  = new Cat();
        String say = peppy.sound();
        Cat sparky = new Cat();
    }
}