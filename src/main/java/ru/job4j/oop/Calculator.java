package ru.job4j.oop;

/**
 * A calculator for executing basic arithmetic operations against a static base.
 *
 * <p>Example output:
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
     * Base value used as the first operand or divisor in calculations.
     */
    private static int x = 5;

    /**
     * Returns the sum of the base value and the specified value.
     *
     * @param y the value to be added to the base
     * @return the arithmetic sum of {@code x} and {@code y}
     */
    public static int sum(int y) {
        return x + y;
    }

    /**
     * Returns the difference between the specified value and the base value.
     *
     * @param y the value from which the base is subtracted
     * @return the arithmetic difference of {@code y - x}
     */
    public static int minus(int y) {
        return y - x;
    }

    /**
     * Returns the product of the base value and the specified value.
     *
     * @param y the value to be multiplied by the base
     * @return the arithmetic product of {@code x * y}
     */
    public int multiply(int y) {
        return x * y;
    }

    /**
     * Returns the integer division of the specified value by the base value.
     *
     * @param y the dividend value
     * @return the arithmetic quotient of {@code y / x}
     */
    public int divide(int y) {
        return y / x;
    }

    /**
     * Returns the total sum of all arithmetic operations for the specified
     * value.
     *
     * @param y the operand value for all operations
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
