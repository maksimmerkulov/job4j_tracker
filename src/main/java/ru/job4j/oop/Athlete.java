package ru.job4j.oop;

/**
 * An athlete model extending the base {@link Sportsman} functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Athlete extends Sportsman {

    /**
     * Runs with high speed.
     */
    @Override
    void run() {
        System.out.println("Fast running speed");
    }

    /**
     * Sprints quickly over a short distance.
     */
    public void sprint() {
        System.out.println("Quick short-distance sprint");
    }
}
