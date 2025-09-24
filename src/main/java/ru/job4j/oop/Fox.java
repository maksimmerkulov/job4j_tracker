package ru.job4j.oop;

/**
 * Represents the Fox that tries to eat the Ball.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fox {

    /**
     * Attempts to eat the Ball and checks if it escaped.
     *
     * @param ball the Ball to be eaten
     */
    public void tryEat(Ball ball) {
        System.out.println("The Fox tried to eat the Ball...");
        ball.tryRun(true);
    }
}
