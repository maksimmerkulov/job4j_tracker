package ru.job4j.polymorphism;

/**
 * Demonstrates default message inheritance using a {@link FunctionMessage}
 * instance.
 *
 * <p>Example output:
 * <pre>{@code
 * Message from FunctionTwo.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MainFunctionMessage {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        FunctionMessage functionMessage = new FunctionMessage();
        functionMessage.functionMessage();
    }
}
