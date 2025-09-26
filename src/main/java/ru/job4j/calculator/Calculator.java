package ru.job4j.calculator;

/**
 * Provides mathematical operations for numbers of type {@code double}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Calculator {

    /**
     * Calculates the sum of two numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @return the sum
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Calculates the sum of three numbers.
     *
     * @param first  the first number
     * @param second the second number
     * @param third  the third number
     * @return the sum
     */
    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }
}
