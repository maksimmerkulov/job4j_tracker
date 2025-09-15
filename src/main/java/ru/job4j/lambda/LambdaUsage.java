package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Demonstrates lambda expressions with debug information during sorting.
 *
 * <p>Example output:
 * <pre>{@code
 * compare - 1 : 5
 * compare - 3 : 1
 * compare - 3 : 1
 * compare - 3 : 5
 * compare - 4 : 3
 * compare - 4 : 5
 * compare - 2 : 3
 * compare - 2 : 1
 * eeeee
 * dddd
 * ccc
 * bb
 * a
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LambdaUsage {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a", "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left.length() + " : "
                    + right.length());
            return Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
