package ru.job4j.stream.mapto;

import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates the usage of {@code mapToInt} to calculate the sum of ages.
 *
 * <p>Example output:
 * <pre>{@code
 * 35
 * 26
 * 29
 * Total sum: 90
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MapToIntMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Mikhail", 35),
                new Person("Olga", 26),
                new Person("Anton", 20),
                new Person("Viktor", 16),
                new Person("Anna", 29)
        );
        int sum = people.stream()
                .filter(element -> element.getAge() > 25)
                .mapToInt(Person::getAge)
                .peek(System.out::println)
                .sum();
        System.out.println("Total sum: " + sum);
    }
}
