package ru.job4j.oop;

/**
 * Класс {@code Student} представляет студента, который может играть на баяне и петь.
 *
 * <p>В методе {@link #main(String[])} создается объект студента и вызываются его методы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Student petya = new Student();
 * String song = "I believe, I can fly";
 * petya.music(song);
 * petya.music(song);
 * petya.music(song);
 * petya.sing();
 * petya.sing();
 * petya.sing();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * I can sing a song: I believe, I can fly
 * I can sing a song: I believe, I can fly
 * I can sing a song: I believe, I can fly
 * I believe I can fly
 * I believe I can fly
 * I believe I can fly
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Student {

    /**
     * Выводит текст "I can sing a song: I believe, I can fly".
     */
    public void music(String lyrics) {
        System.out.println("I can sing a song: " + lyrics);
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
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.sing();
        petya.sing();
        petya.sing();
    }
}