package ru.job4j.oop;

/**
 * A calculator model providing mathematical operations and nested calculation
 * results.
 *
 * <p>Example output:
 * <pre>{@code
 * Result square is 9
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Calculator {

    /**
     * A multiplication operation result model.
     */
    public static class Multiple {

        /**
         * The calculated result of the multiple.
         */
        private final int result;

        /**
         * Creates a new {@code Multiple} with the specified value.
         *
         * @param number the initial value
         */
        public Multiple(int number) {
            result = number;
        }

        /**
         * Returns the calculation result.
         *
         * @return the result value
         */
        public int getResult() {
            return result;
        }
    }

    /**
     * Returns the square of the value and wraps it in a {@code Multiple}
     * object.
     *
     * @param value the value to square
     * @return a new {@code Multiple} instance
     */
    public static Multiple getMultiple(int value) {
        int result = value * value;
        return new Multiple(result);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Calculator.Multiple multiple = Calculator.getMultiple(3);
        System.out.println("Result square is " + multiple.getResult());
    }
}
