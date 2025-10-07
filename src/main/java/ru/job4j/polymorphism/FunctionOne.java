package ru.job4j.polymorphism;

/**
 * Provides mathematical and messaging default functions.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface FunctionOne {

    /**
     * Calculates the result of a specific quadratic function.
     *
     * @param x the first double operand
     * @param y the second double operand
     * @return the double calculation result
     */
    default double function(double x, double y) {
        return x * x - 2 * y + 30;
    }

    /**
     * Prints a standard diagnostic message from this interface.
     */
    default void functionMessage() {
        System.out.println("Message from FunctionOne.");
    }

    /**
     * Calculates the doubled sum of the specified array components.
     *
     * @param numbers the array of source integers
     * @return the doubled total value
     */
    default int getDoubleSum(int[] numbers) {
        return getSum(numbers) * 2;
    }

    /**
     * Calculates the arithmetic mean value of the array elements.
     *
     * @param numbers the array of source integers
     * @return the double average calculation result
     */
    default double getAverage(int[] numbers) {
        return getSum(numbers) * 1.0 / numbers.length;
    }

    /**
     * Calculates the absolute total sum of the provided array entries.
     *
     * @param numbers the array of source integers
     * @return the combined aggregate value
     */
    private int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
