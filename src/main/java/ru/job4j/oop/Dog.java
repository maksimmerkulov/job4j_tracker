package ru.job4j.oop;

/**
 * Класс {@code Dog} представляет собой простую модель собаки.
 * В этом примере создаются три экземпляра собаки в методе {@code main(String[] args)}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-28
 */
public class Dog {

    /**
     * Метод {@code main(String[] args)} создаёт три экземпляра класса {@code Dog}:
     * {@code polkan}, {@code sharik} и {@code zhychka}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
    }
}
