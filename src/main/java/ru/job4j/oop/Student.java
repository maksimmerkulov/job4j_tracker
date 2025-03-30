package ru.job4j.oop;

/**
 * Класс {@code Student} представляет студента, который может играть музыку и петь.
 * В методе {@code main} создаётся объект студента и вызываются его методы.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-28
 */
public class Student {

    /**
     * Метод {@code music} выводит текст "Tra tra tra", имитируя музыку.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод {@code sing} выводит текст "I believe I can fly", имитируя пение.
     */
    public void sing() {
        System.out.println("I believe I can fly");
    }

    /**
     * Метод {@code main} создаёт объект студента и вызывает его методы.
     *
     * @param args Аргументы командной строки (не используются в этом примере).
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