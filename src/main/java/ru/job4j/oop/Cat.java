package ru.job4j.oop;

/**
 * Класс {@code Cat} представляет собой простую модель кота.
 *
 * <p>В этом примере создаются два экземпляра кота в методе {@link #main(String[])}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Cat {

    /**
     * Создает два объекта типа {@code Cat}: {@code peppy} и {@code sparky}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
    }
}