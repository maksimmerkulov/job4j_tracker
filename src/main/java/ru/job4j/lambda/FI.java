package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Demonstrates Functional Interfaces and lambda expressions.
 *
 * <p>Example output:
 * <pre>{@code
 * {name='image 1', size=20}
 * {name='image 2', size=23}
 * {name='image 3', size=120}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FI {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Attachment[] attachments = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (left, right) ->
                Integer.compare(left.getSize(), right.getSize());
        Arrays.sort(attachments, comparator);
        for (Attachment att : attachments) {
            System.out.println(att);
        }
        Comparator<String> comparatorSize = (left, right) ->
                Integer.compare(left.length(), right.length());
        Comparator<String> comparatorText = (left, right) ->
                left.compareTo(right);
        Comparator<String> comparatorDescSize = (left, right) ->
                Integer.compare(right.length(), left.length());
    }
}
