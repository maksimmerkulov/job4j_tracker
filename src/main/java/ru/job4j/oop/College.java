package ru.job4j.oop;

/**
 * Demonstrates upcasting capabilities from a {@link Freshman} instance
 * to parent classes.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class College {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = student;
    }
}
