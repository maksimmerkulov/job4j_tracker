package ru.job4j.oop;

/**
 * A user model containing identity and system access details.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User {

    /**
     * The name of the user.
     */
    private String name;

    /**
     * The age of the user.
     */
    private int age;

    /**
     * Tests if the user is allowed to drive based on age.
     *
     * @return {@code true} if the user is 18 or older, {@code false} otherwise
     */
    public boolean canDrive() {
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
