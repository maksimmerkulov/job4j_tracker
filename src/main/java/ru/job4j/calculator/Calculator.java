package ru.job4j.calculator;

/**
 * A calculator for executing basic arithmetic operations against double
 * numbers.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Calculator {

    /**
     * Returns the sum of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the arithmetic sum
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Returns the sum of three numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @param third  the third number
     * @return the arithmetic sum
     */
    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }
}
