package ru.job4j.inheritance;

/**
 * A programmer model as a specialized type of {@link Engineer}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Programmer extends Engineer {

    /**
     * The primary programming language of the programmer.
     */
    private String programLanguage;

    /**
     * Creates a new {@code Programmer} with language, experience, and degree.
     *
     * @param programLanguage the programming language used
     * @param experience      the years of experience
     * @param degree          the degree status
     */
    public Programmer(String programLanguage, int experience, boolean degree) {
        super(experience, degree);
        this.programLanguage = programLanguage;
    }
}
