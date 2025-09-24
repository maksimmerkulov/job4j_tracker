package ru.job4j.oop;

/**
 * Represents a system error with status and message details.
 *
 * <p>Example output:
 * <pre>{@code
 * Active: false
 * Status: 0
 * Message: null
 *
 * Active: true
 * Status: 404
 * Message: Page not found
 *
 * Active: true
 * Status: 500
 * Message: Internal server error
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Error {

    /**
     * Indicates if the error is currently active.
     */
    private boolean active;

    /**
     * Numerical status code of the error.
     */
    private int status;

    /**
     * Detailed error message.
     */
    private String message;

    /**
     * Creates a new {@code Error} with default values.
     */
    public Error() {
    }

    /**
     * Creates a new {@code Error} with the specified parameters.
     *
     * @param active  the error state
     * @param status  the error code
     * @param message the error description
     */
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    /**
     * Displays error details to the console.
     */
    public void printInfo() {
        System.out.println("Active: " + this.active);
        System.out.println("Status: " + this.status);
        System.out.println("Message: " + this.message);
        System.out.println();
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Error defaultError = new Error();
        defaultError.printInfo();
        Error notFound = new Error(true, 404, "Page not found");
        notFound.printInfo();
        Error internal = new Error(true, 500, "Internal server error");
        internal.printInfo();
    }
}
