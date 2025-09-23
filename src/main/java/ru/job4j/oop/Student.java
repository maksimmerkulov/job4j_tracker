package ru.job4j.oop;

/**
 * Represents a student who can perform music and songs.
 *
 * <p>Example output:
 * <pre>{@code
 * Tra tra tra
 * Tra tra tra
 * Tra tra tra
 * I believe I can fly
 * I believe I can fly
 * I believe I can fly
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Student {

    /**
     * Plays the accordion music.
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Sings a song to the console.
     */
    public void sing() {
        System.out.println("I believe I can fly");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
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
