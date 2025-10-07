package ru.job4j.polymorphism;

/**
 * Extends the {@link FunctionOne} contract with modified implementations.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface FunctionTwo extends FunctionOne {

    /**
     * Calculates the result of an alternative quadratic function.
     *
     * @param x the first double operand
     * @param y the second double operand
     * @return the double calculation result
     */
    @Override
    default double function(double x, double y) {
        return x * x - y + 5;
    }

    /**
     * Prints a standard diagnostic message from this interface.
     */
    @Override
    default void functionMessage() {
        System.out.println("Message from FunctionTwo.");
    }
}
