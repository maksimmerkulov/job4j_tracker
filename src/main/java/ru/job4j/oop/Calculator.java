package ru.job4j.oop;

/**
 * Provides static and instance methods for mathematical operations.
 *
 * <p>Example output for {@code y = 10}:
 * <pre>{@code
 * Sum: 15
 * Minus: 5
 * Multiply: 50
 * Divide: 2
 * Sum of all: 72
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Calculator {

    /**
     * Base value for operations.
     */
    private static int x = 5;

    /**
     * Calculates the sum of {@code x} and the specified value.
     *
     * @param y the value to add
     * @return the sum
     */
    public static int sum(int y) {
        return x + y;
    }

    /**
     * Calculates the difference between the specified value and {@code x}.
     *
     * @param y the value to subtract from
     * @return the difference
     */
    public static int minus(int y) {
        return y - x;
    }

    /**
     * Calculates the product of {@code x} and the specified value.
     *
     * @param y the value to multiply by
     * @return the product
     */
    public int multiply(int y) {
        return x * y;
    }

    /**
     * Calculates the division of the specified value by {@code x}.
     *
     * @param y the value to divide
     * @return the result of division
     */
    public int divide(int y) {
        return y / x;
    }

    /**
     * Sums the results of all available operations.
     *
     * @param y the value for calculations
     * @return the total sum of all operations
     */
    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + divide(y);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum: " + sum(10));
        System.out.println("Minus: " + minus(10));
        System.out.println("Multiply: " + calculator.multiply(10));
        System.out.println("Divide: " + calculator.divide(10));
        System.out.println("Sum of all: " + calculator.sumAllOperation(10));
    }
}
