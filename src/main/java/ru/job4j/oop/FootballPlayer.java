package ru.job4j.oop;

/**
 * A football player model extending the base {@link Sportsman} functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FootballPlayer extends Sportsman {

    /**
     * Runs with average speed.
     */
    @Override
    void run() {
        System.out.println("Average running speed");
    }

    /**
     * Kicks the ball with a foot.
     */
    public void footKick() {
        System.out.println("Kicking the ball");
    }
}
