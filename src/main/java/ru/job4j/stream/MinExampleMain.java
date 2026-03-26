package ru.job4j.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import ru.job4j.stream.mapto.Person;

/**
 * Demonstrates the usage of {@code min} to find the youngest person in a stream.
 *
 * <p>Example output:
 * <pre>{@code
 * 16
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class MinExampleMain {

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
        Optional<Person> youngestPerson = people.stream()
                .min(Comparator.comparing(Person::getAge));
        int age = youngestPerson.get().getAge();
        System.out.println(age);
    }
}
