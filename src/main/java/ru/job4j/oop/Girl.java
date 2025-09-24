package ru.job4j.oop;

/**
 * Represents a girl who can ask for help.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Girl {

    /**
     * Calls a pioneer for help and prints the action.
     *
     * @param pioneer the pioneer to call
     */
    public void help(Pioneer pioneer) {
        System.out.println(
                "Little Red Riding Hood called pioneer Petya for help."
        );
    }
}
