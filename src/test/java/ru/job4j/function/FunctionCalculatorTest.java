package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link FunctionCalculator} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class FunctionCalculatorTest {

    /** Verifies linear function: {@code y = 2x + 1}. */
    @Test
    void whenLinearFunctionThenLinearResults() {
        FunctionCalculator calculator = new FunctionCalculator();
        List<Double> result = calculator.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11.0, 13.0, 15.0);
        assertThat(result).containsAll(expected);
    }

    /** Verifies quadratic function: {@code y = x^2}. */
    @Test
    void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCalculator calculator = new FunctionCalculator();
        List<Double> result = calculator.diapason(2, 5, x -> Math.pow(x, 2));
        List<Double> expected = Arrays.asList(4.0, 9.0, 16.0);
        assertThat(result).containsAll(expected);
    }

    /** Verifies exponential function: {@code y = 2^x}. */
    @Test
    void whenExponentialFunctionThenExponentialResults() {
        FunctionCalculator calculator = new FunctionCalculator();
        List<Double> result = calculator.diapason(1, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(2.0, 4.0, 8.0);
        assertThat(result).containsAll(expected);
    }
}
