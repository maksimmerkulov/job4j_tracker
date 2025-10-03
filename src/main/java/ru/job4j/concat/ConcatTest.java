package ru.job4j.concat;

/**
 * Provides an entry point to demonstrate performance testing of string
 * concatenation using {@link StringBuilder}.
 *
 * <p>Example output:
 * <pre>{@code
 * Milliseconds: 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ConcatTest {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Job4j");
        for (int i = 0; i < 9999; i++) {
            builder.append(i);
        }
        System.out.println("Milliseconds: "
                + (System.currentTimeMillis() - startTime));
    }
}
