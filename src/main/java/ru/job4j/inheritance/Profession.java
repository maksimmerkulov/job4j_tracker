package ru.job4j.inheritance;

/**
 * A base profession model.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Profession {

    /**
     * The degree status of the profession.
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
