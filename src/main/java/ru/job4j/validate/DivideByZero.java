package ru.job4j.validate;

/**
 * Demonstrates basic validation by checking for division by zero.
 *
 * <p>Example output:
 * <pre>{@code
 * Div by 0, return def value -1
 * -1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DivideByZero {

    /**
     * Performs division with divisor validation.
     *
     * @param first  the dividend
     * @param second the divisor
     * @return the result of division, or {@code -1} if validation fails
     */
    public static int divide(int first, int second) {
        int result = -1;
        if (second == 0) {
            System.out.println("Div by 0, return def value -1");
        } else {
            result = first / second;
        }
        return result;
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }
}
