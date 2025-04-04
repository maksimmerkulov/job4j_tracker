package ru.job4j.oop;

/**
 * Класс {@code Student} представляет студента, который может играть музыку и петь.
 * В методе {@link #main(String[])} создается объект студента и вызываются его методы.
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-03
 */
public class Student {

    /**
     * Метод {@code music()} выводит текст "Tra tra tra", имитируя музыку.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод {@code sing()} выводит текст "I believe I can fly", имитируя пение.
     */
    public void sing() {
        System.out.println("I believe I can fly");
    }

    /**
     * Метод {@code main(String[] args)} создает объект студента и вызывает его методы.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.sing();
        petya.sing();
        petya.sing();
    }
}