package ru.job4j.oop;

/**
 * Класс {@code Dog} представляет собой простую модель собаки.
 * В этом примере создаются три экземпляра собаки в методе {@code main}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Dog {

    /**
     * Метод {@code main} создаёт три экземпляра класса {@code Dog}:
     * {@code polkan}, {@code sharik} и {@code sparky}.
     *
     * @param args Аргументы командной строки (не используются в этом примере).
     */
    public static void main(String[] args) {
        Dog polkan  = new Dog();
        Dog sharik  = new Dog();
        Dog zhychka = new Dog();
    }
}
