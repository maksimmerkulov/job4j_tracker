package ru.job4j.concat;

/**
 * Provides an entry point to demonstrate string concatenation using
 * the {@link String#concat} method.
 *
 * <p>Example output:
 * <pre>{@code
 * abcdefghijkl
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ConcatExample {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String string = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string);
    }
}
