package ru.job4j.oop;

/**
 * Orchestrates the fairy tale about the Ball and its encounters.
 *
 * <p>Example output:
 * <pre>{@code
 * The Hare tried to eat the Ball...
 * The Ball escaped.
 * The Wolf tried to eat the Ball...
 * The Ball escaped.
 * The Fox tried to eat the Ball...
 * The Ball was eaten.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class BallStory {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        hare.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
    }
}
