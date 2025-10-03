package ru.job4j.concat;

/**
 * Provides an entry point to demonstrate string joining using
 * the {@code join()} method in the {@link String} class.
 *
 * <p>Example output:
 * <pre>{@code
 * abc def ghi
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JoinExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String string = String.join(" ", "abc", "def", "ghi");
        System.out.println(string);
    }
}
