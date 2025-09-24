package ru.job4j.oop;

/**
 * A fairy tale character component that represents the Wolf that interacts
 * with {@link Girl} Little Red Riding Hood and the {@link Ball}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Wolf {

    /**
     * Attempts to eat the specified {@link Girl} and prints the action.
     *
     * @param girl the {@link Girl} to be eaten
     */
    public void eat(Girl girl) {
        System.out.println("The Wolf tried to eat Little Red Riding Hood...");
    }

    /**
     * Attempts to eat the {@link Ball} and checks if it escaped.
     *
     * @param ball the {@link Ball} to be eaten
     */
    public void tryEat(Ball ball) {
        System.out.println("The Wolf tried to eat the Ball...");
        ball.tryRun(false);
    }
}
