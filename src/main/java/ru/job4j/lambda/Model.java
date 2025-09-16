package ru.job4j.lambda;

/**
 * Model representing a simple data entity with a name.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Model {

    /** The name of the model. */
    private String name;

    /**
     * Creates a new {@code Model} with default values.
     */
    public Model() {
    }

    /**
     * Creates a new {@code Model} with the specified name.
     *
     * @param str the name to set
     */
    public Model(String str) {
        name = str;
    }

    /**
     * Returns the name of the model.
     *
     * @return the model name
     */
    public String getName() {
        return name;
    }
}
