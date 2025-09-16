package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Demonstrates the usage of method references to process a list of strings.
 *
 * <p>Example output:
 * <pre>{@code
 * Ivan
 * Petr Arsen..
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class RefMethod {

    /**
     * Truncates a string if its length exceeds 10 characters.
     *
     * @param value the string to process
     */
    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "..");
        } else {
            System.out.println(value);
        }
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr Arsentev"
        );
        Consumer<String> out = RefMethod::cutOut;
        names.forEach(out);
    }
}
