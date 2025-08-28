package ru.job4j.oop;

/**
 * Класс {@code Dog} представляет собой простую модель собаки.
 *
 * <p>В этом примере создаются три экземпляра собаки в методе {@link #main(String[])}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Dog {

    /**
     * Создает три объекта типа {@code Dog}: {@code polkan}, {@code sharik} и {@code zhychka}.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Dog polkan = new Dog();
        Dog sharik = new Dog();
        Dog zhychka = new Dog();
    }
}
