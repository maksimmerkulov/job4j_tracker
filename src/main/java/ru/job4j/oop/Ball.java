package ru.job4j.oop;

/**
 * A fairy tale character component that represents the Ball (Kolobok).
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Ball {

    /**
     * Attempts to escape from a predator.
     *
     * @param condition if {@code true}, the Ball is eaten;
     *                  if {@code false}, it escapes
     */
    public void tryRun(boolean condition) {
        if (condition) {
            System.out.println("The Ball was eaten.");
        } else {
            System.out.println("The Ball escaped.");
        }
    }
}
