package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Calculates function values in a specified range.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FunctionCalculator {

    /**
     * Calculates the function values from start (inclusive) to end (exclusive).
     *
     * @param start the beginning of the range
     * @param end the end of the range
     * @param function the function to apply
     * @return a list of calculated values
     */
    public List<Double> diapason(
            int start,
            int end,
            Function<Double, Double> function
    ) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(function.apply((double) i));
        }
        return result;
    }
}
