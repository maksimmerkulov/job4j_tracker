package ru.job4j.oop;

/**
 * Represents an athlete, extending the base sportsman functionality.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Athlete extends Sportsman {

    /**
     * Performs a running action with high speed.
     */
    @Override
    void run() {
        System.out.println("Fast running speed");
    }

    /**
     * Performs a quick dash over a short distance.
     */
    public void sprint() {
        System.out.println("Quick short-distance sprint");
    }
}
