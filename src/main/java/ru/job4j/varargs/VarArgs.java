package ru.job4j.varargs;

/**
 * Provides an entry point to demonstrate variable arity (varargs).
 *
 * <p>Example output:
 * <pre>{@code
 *
 * aaa
 * aaabbbccc
 * 30aaabbb
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class VarArgs {

    /**
     * Joins an arbitrary number of strings into a single string.
     *
     * @param strings the strings to join
     * @return the joined string
     */
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    /**
     * Joins an integer and an arbitrary number of strings.
     *
     * @param x       the number to append first
     * @param strings the strings to join
     * @return the joined string
     */
    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    /**
     * Returns the specified string as is.
     *
     * @param string the input string
     * @return the same string
     */
    public static String text(String string) {
        return string;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text(30, "aaa", "bbb"));
    }
}
