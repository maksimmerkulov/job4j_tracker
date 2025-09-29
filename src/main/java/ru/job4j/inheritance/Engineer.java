package ru.job4j.inheritance;

/**
 * Represents an engineer, extending the base profession.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Engineer extends Profession {

    /**
     * The years of experience.
     */
    private int experience;

    /**
     * Creates a new {@code Engineer} with experience and degree status.
     *
     * @param experience the years of experience
     * @param degree     the degree status
     */
    public Engineer(int experience, boolean degree) {
        super(degree);
        this.experience = experience;
    }
}
