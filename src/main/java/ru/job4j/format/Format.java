package ru.job4j.format;

import java.util.Calendar;

/**
 * Demonstrates string formatting using {@code format()}
 * and {@code printf()} methods.
 *
 * <p>Example output:
 * <pre>{@code
 * Hello! I am Elena, my age: 33
 *
 * Is argument passed? true
 *
 * Job4j
 *
 * Line 1
 * Line 2
 *
 * Hello, Igor! Current date: 2025-10-02, Current time: 14:30:00
 *
 * Setting the number 0.99 - 0.99
 *
 * +0005,000,000.00
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Format {

    /**
     * Prints a greeting message with the name and age.
     *
     * @param name the user name
     * @param age  the user age
     */
    public static void getGreeting(String name, int age) {
        System.out.println(
                String.format("Hello! I am %s, my age: %d", name, age)
        );
        System.out.println();
    }

    /**
     * Prints a greeting message with the current date and time.
     *
     * @param name the user name
     */
    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(
                String.format(
                        "Hello, %s! Current date: %tF, Current time: %tT",
                        name,
                        instance,
                        instance
                )
        );
        System.out.println();
    }

    /**
     * Displays a boolean value using the {@code %b} formatter.
     *
     * @param value the value to format
     */
    public static void getBoolean(int value) {
        System.out.println(String.format("Is argument passed? %b", value));
        System.out.println();
    }

    /**
     * Displays a character using the {@code %c} formatter.
     *
     * @param character the character to format
     */
    public static void getChar(char character) {
        System.out.println(String.format("Jo%c4j", character));
        System.out.println();
    }

    /**
     * Prints a platform-independent line separator using {@code %n}.
     */
    public static void getLineSeparator() {
        System.out.format("Line 1%nLine 2%n");
        System.out.println();
    }

    /**
     * Displays a floating-point number with fixed precision using {@code %f}.
     *
     * @param value the value to format
     */
    public static void getFloat(double value) {
        System.out.println(
                String.format("Setting the number 0.99 - %.2f", value)
        );
        System.out.println();
    }

    /**
     * Displays a number with complex formatting including signs and groups.
     *
     * @param value the value to format
     */
    public static void getComplexFormat(double value) {
        System.out.println(String.format("%1$,+016.2f", value));
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        getGreeting("Elena", 33);
        getBoolean(55);
        getChar('b');
        getLineSeparator();
        getGreetingAndTime("Igor");
        getFloat(0.99);
        getComplexFormat(5000000.0000);
    }
}
