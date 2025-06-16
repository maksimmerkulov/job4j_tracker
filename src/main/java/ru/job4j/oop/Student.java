package ru.job4j.oop;

/**
 * Класс {@code Student} представляет студента, который может играть на баяне и петь.
 *
 * <p>В методе {@link #main(String[])} создается объект студента и вызываются его методы.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Student {

    /**
     * Выводит текст "Tra tra tra", имитируя игру на баяне.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Выводит текст "I believe I can fly", имитируя пение.
     */
    public void sing() {
        System.out.println("I believe I can fly");
    }

    /**
     * Создает объект студента и вызывает его методы.
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