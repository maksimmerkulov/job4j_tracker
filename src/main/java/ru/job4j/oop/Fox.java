package ru.job4j.oop;

/**
 * A fairy tale character component that represents the Fox that tries to eat
 * the {@link Ball}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Fox {

    /**
     * Attempts to eat the {@link Ball} and checks if it escaped.
     *
     * @param ball the {@link Ball} to be eaten
     */
    public void tryEat(Ball ball) {
        System.out.println("The Fox tried to eat the Ball...");
        ball.tryRun(true);
    }
}
