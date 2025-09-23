package ru.job4j.oop;

/**
 * Represents a cat that can produce sounds.
 *
 * <p>Example output:
 * <pre>{@code
 * Peppy says meow-meow
 * Sparky says meow-meow
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Cat {

    /**
     * Returns the sound this cat makes.
     *
     * @return the voice of the cat
     */
    public String sound() {
        String voice = "meow-meow";
        return voice;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Cat peppy = new Cat();
        String sayPeppy = peppy.sound();
        System.out.println("Peppy says " + sayPeppy);
        Cat sparky = new Cat();
        String saySparky = sparky.sound();
        System.out.println("Sparky says " + saySparky);
    }
}
