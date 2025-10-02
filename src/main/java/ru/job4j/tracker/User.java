package ru.job4j.tracker;

/**
 * Represents an application user in the tracker system.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User {

    /**
     * Unique identifier of the user.
     */
    private int id;

    /**
     * Name of the user.
     */
    private String username;

    /**
     * Security password of the user.
     */
    private String password;

    /**
     * Creates a new {@code User} with the specified id, username and password.
     *
     * @param id       the user identifier
     * @param username the user name
     * @param password the user password
     */
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Returns the user identifier.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the user name.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Returns the user password.
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Returns a string representation of the user.
     *
     * @return a string containing the user data
     */
    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", username='" + username + '\''
                + ", password='" + password + '\''
                + '}';
    }
}
