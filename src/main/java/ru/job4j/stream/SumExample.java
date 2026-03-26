package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

import ru.job4j.stream.mapto.Person;

/**
 * Demonstrates the usage of {@code sum} to calculate the total age.
 *
 * <p>Example output:
 * <pre>{@code
 * 126
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SumExample {

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
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sum);
    }
}
