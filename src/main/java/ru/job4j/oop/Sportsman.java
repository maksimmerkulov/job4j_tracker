package ru.job4j.oop;

/**
 * An abstract sportsman model with common sports capabilities.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public abstract class Sportsman {

    /**
     * The running speed of the sportsman.
     */
    int runSpeed;

    /**
     * Performs a running action.
     */
    abstract void run();
}
