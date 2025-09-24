package ru.job4j.oop;

/**
 * Represents a Hare that tries to eat the Ball.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Hare {

    /**
     * Attempts to eat the Ball and checks if it escaped.
     *
     * @param ball the Ball to be eaten
     */
    public void tryEat(Ball ball) {
        System.out.println("The Hare tried to eat the Ball...");
        ball.tryRun(false);
    }
}
