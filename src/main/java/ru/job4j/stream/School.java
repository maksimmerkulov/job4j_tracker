package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Service for collecting students based on specified criteria.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class School {

    /**
     * Filters and collects students into a list using the specified predicate.
     *
     * @param students  the list of students to process
     * @param predicate the criteria for filtering
     * @return a list of students matching the criteria
     */
    public List<Student> collect(
            List<Student> students,
            Predicate<Student> predicate
    ) {
        return students.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
