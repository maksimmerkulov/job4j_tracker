package ru.job4j.inheritance;

/**
 * A main runner class demonstrating the automatic call of the {@link Base}
 * constructor.
 *
 * <p>Example output:
 * <pre>{@code
 * Default Base constructor.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User extends Base {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        User user = new User();
    }
}
