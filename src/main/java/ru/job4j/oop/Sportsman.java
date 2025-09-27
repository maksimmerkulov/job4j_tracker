package ru.job4j.oop;

/**
 * Abstraction for different types of sportsmen.
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
