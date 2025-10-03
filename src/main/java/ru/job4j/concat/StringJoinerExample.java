package ru.job4j.concat;

import java.util.StringJoiner;

/**
 * Provides an entry point to demonstrate string joining using
 * the {@code add()} method in the {@link StringJoiner} class.
 *
 * <p>Example output:
 * <pre>{@code
 * [abc, def, ghi]
 * [abc, def, ghi]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StringJoinerExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}
