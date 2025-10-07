package ru.job4j.polymorphism;

/**
 * Implements combined functional contracts with prioritized behavior.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MainFunction implements FunctionOne, FunctionTwo {

    /**
     * Calculates the function value by delegating to the default
     * implementation of the {@link FunctionTwo} interface over
     * {@link FunctionOne}.
     *
     * @param x the first double operand
     * @param y the second double operand
     * @return the double calculation result
     */
    @Override
    public double function(double x, double y) {
        return FunctionTwo.super.function(x, y);
    }
}
