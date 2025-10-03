package ru.job4j.escape;

/**
 * Provides an entry point to demonstrate string escape sequences.
 *
 * <p>Example output:
 * <pre>{@code
 * '
 *
 * I am studying character escaping on 'Job4j'
 *
 * "
 *
 * I am studying character escaping on "Job4j"
 *
 * \
 *
 * C:\projects\job4j\File.java
 *
 * New text
 *
 * First line
 * Second line
 *
 * No indent
 *     One indent
 *         Two indents
 *
 * Job4j
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class EscapeExample {

    /**
     * Prints a character or string with single quote escaping.
     *
     * @param text the text to print
     */
    public static void getSingleQuote(String text) {
        System.out.println(text);
        System.out.println();
    }

    /**
     * Prints a character or string with double quote escaping.
     *
     * @param text the text to print
     */
    public static void getDoubleQuote(String text) {
        System.out.println(text);
        System.out.println();
    }

    /**
     * Prints a character or string with backslash escaping.
     *
     * @param text the text to print
     */
    public static void getBackslash(String text) {
        System.out.println(text);
        System.out.println();
    }

    /**
     * Demonstrates carriage return sequence.
     */
    public static void getCarriageReturn() {
        System.out.print("Old long text\r");
        System.out.println("New text");
        System.out.println();
    }

    /**
     * Demonstrates line feed sequence.
     */
    public static void getLineFeed() {
        System.out.print("First line\nSecond line\n");
        System.out.println();
    }

    /**
     * Demonstrates horizontal tab sequence.
     */
    public static void getTab() {
        System.out.println("No indent");
        System.out.println("\tOne indent");
        System.out.println("\t\tTwo indents");
        System.out.println();
    }

    /**
     * Demonstrates backspace sequence.
     */
    public static void getBackspace() {
        System.out.println("Job4jjj\b\b");
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        getSingleQuote(String.valueOf('\''));
        getSingleQuote("I am studying character escaping on 'Job4j'");
        getDoubleQuote(String.valueOf('\"'));
        getDoubleQuote("I am studying character escaping on \"Job4j\"");
        getBackslash(String.valueOf('\\'));
        getBackslash("C:\\projects\\job4j\\File.java");
        getCarriageReturn();
        getLineFeed();
        getTab();
        getBackspace();
    }
}
