package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

import ru.job4j.stream.mapto.Person;

/**
 * Demonstrates the usage of {@code average} to calculate the mean age.
 *
 * <p>Example output:
 * <pre>{@code
 * 25.2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class AverageExample {

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
        OptionalDouble average = people.stream()
                .mapToInt(Person::getAge)
                .average();
        double result = average.getAsDouble();
        System.out.println(result);
    }
}
