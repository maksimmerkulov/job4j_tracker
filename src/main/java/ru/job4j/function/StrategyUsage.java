package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Demonstrates the Strategy pattern using functional interfaces.
 *
 * <p>Example output for {@code check}:
 * <pre>{@code
 * Result: true
 * Result: true
 * Result: true
 * }</pre>
 *
 * <p>Example output for {@code transform}:
 * <pre>{@code
 * Transformed: ABCDEFGHKLMNPRSTU
 * Transformed: works correctly.
 * Transformed: aBC dEfghK Lmnp RstU
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StrategyUsage {

    /**
     * Checks a string against a condition.
     *
     * @param predicate the condition to check
     * @param string the string to check
     * @return {@code true} if the string matches the condition,
     *         otherwise {@code false}
     */
    public boolean check(Predicate<String> predicate, String string) {
        return predicate.test(string);
    }

    /**
     * Transforms a string using the specified function.
     *
     * @param function the transformation function
     * @param string the source string
     * @return the transformed string
     */
    public String transform(Function<String, String> function, String string) {
        return function.apply(string);
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println("Result: " + usage.check(String::isEmpty, ""));
        System.out.println("Result: " + usage.check(
                s -> s.startsWith("Fun"), "Functional interface"));
        System.out.println("Result: " + usage.check(
                s -> s.contains("rn"), "Surname Name"));

        System.out.println("Transformed: " + usage.transform(
                String::toUpperCase, "aBCdEfghKLmnpRstU"));
        System.out.println(usage.transform(
                s -> s.concat("works correctly."), "Transformed: "));
        System.out.println("Transformed: " + usage.transform(
                String::trim, "    aBC dEfghK Lmnp RstU        "));
    }
}
