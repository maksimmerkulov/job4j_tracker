package ru.job4j.tracker;

/**
 * Implements a mock version of the {@link Input} contract for testing.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MockInput implements Input {

    /**
     * Returns a mock string result regardless of the provided question prompt.
     *
     * @param question the prompt message to display
     * @return the mock string value, which is {@code null} by default
     */
    @Override
    public String askStr(String question) {
        return null;
    }

    /**
     * Returns a mock integer result regardless of the provided question prompt.
     *
     * @param question the prompt message to display
     * @return the mock integer value, which is {@code 0} by default
     */
    @Override
    public int askInt(String question) {
        return 0;
    }
}
