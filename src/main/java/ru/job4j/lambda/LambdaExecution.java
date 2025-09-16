package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates the deferred execution of a lambda expression.
 *
 * <p>Example output:
 * <pre>{@code
 * execute comparator
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LambdaExecution {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        String[] names = {
                "Ivan",
                "Petr"
        };
        Comparator<String> lengthComparator = (left, right) -> {
            System.out.println("execute comparator");
            return Integer.compare(left.length(), right.length());
        };
        Arrays.sort(names, lengthComparator);
    }
}
