package ru.job4j.oop;

/**
 * Represents the Wolf that interacts with Little Red Riding Hood and the Ball.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Wolf {

    /**
     * Attempts to eat the specified Girl and prints the action.
     *
     * @param girl the Girl to be eaten
     */
    public void eat(Girl girl) {
        System.out.println("The Wolf tried to eat Little Red Riding Hood...");
    }

    /**
     * Attempts to eat the Ball and checks if it escaped.
     *
     * @param ball the Ball to be eaten
     */
    public void tryEat(Ball ball) {
        System.out.println("The Wolf tried to eat the Ball...");
        ball.tryRun(false);
    }
}
