package ru.job4j.oop;

/**
 * Represents a student who can perform music and songs.
 *
 * <p>Example output:
 * <pre>{@code
 * I can sing a song : I believe, I can fly
 * I can sing a song : I believe, I can fly
 * I can sing a song : I believe, I can fly
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
     * Plays music with the specified lyrics.
     *
     * @param lyrics the text to be played
     */
    public void music(String lyrics) {
        System.out.println("I can sing a song : " + lyrics);
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
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.sing();
        petya.sing();
        petya.sing();
    }
}
