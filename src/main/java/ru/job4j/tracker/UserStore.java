package ru.job4j.tracker;

/**
 * Provides an entry point to demonstrate user data operations.
 *
 * <p>Example output:
 * <pre>{@code
 * User{id=1, username='root', password='root'}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UserStore {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        User user = new User(1, "root", "root");
        System.out.println(user);
    }
}
