package ru.job4j.oop;

/**
 * Represents a football player, extending the base sportsman functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FootballPlayer extends Sportsman {

    /**
     * Performs a running action with average speed.
     */
    @Override
    void run() {
        System.out.println("Average running speed");
    }

    /**
     * Performs a kick on the ball with a foot.
     */
    public void footKick() {
        System.out.println("Kicking the ball");
    }
}
