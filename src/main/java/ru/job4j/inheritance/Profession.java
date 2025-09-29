package ru.job4j.inheritance;

/**
 * Base class representing a profession.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Profession {

    /**
     * Indicates if the professional has a degree.
     */
    private boolean degree;

    /**
     * Creates a new {@code Profession} with the specified degree status.
     *
     * @param degree the degree status
     */
    public Profession(boolean degree) {
        this.degree = degree;
    }
}
