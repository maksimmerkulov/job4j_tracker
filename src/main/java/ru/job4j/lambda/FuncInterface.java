package ru.job4j.lambda;

/**
 * Functional interface for creating {@link Model} objects.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
@FunctionalInterface
public interface FuncInterface {

    /**
     * Creates a new model from the specified string.
     *
     * @param s the input string
     * @return the created model
     */
    Model function(String s);
}
