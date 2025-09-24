package ru.job4j.oop;

/**
 * A fairy tale character component that represents Little Red Riding Hood
 * who can call pioneer Petya {@link Pioneer} for help.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Girl {

    /**
     * Calls a pioneer for help and prints the action.
     *
     * @param pioneer the {@link Pioneer} to call
     */
    public void help(Pioneer pioneer) {
        System.out.println(
                "Little Red Riding Hood called pioneer Petya for help."
        );
    }
}
