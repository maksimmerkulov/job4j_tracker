package ru.job4j.tracker;

/**
 * Provides a common contract for managing user input operations.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface Input {

    /**
     * Asks a question and reads a string response from the user.
     *
     * @param question the prompt message to display
     * @return the string entered by the user
     */
    String askStr(String question);

    /**
     * Asks a question and reads an integer response from the user.
     *
     * @param question the prompt message to display
     * @return the integer entered by the user
     */
    int askInt(String question);
}
