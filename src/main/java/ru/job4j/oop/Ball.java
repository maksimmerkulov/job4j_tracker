package ru.job4j.oop;

/**
 * Represents the main character of the fairy tale, the Ball (Kolobok).
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Ball {

    /**
     * Attempts to escape from a predator.
     *
     * @param condition if true, the Ball is eaten; if false, it escapes
     */
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("The Ball was eaten.");
        } else {
            System.out.println("The Ball escaped.");
        }
    }
}
