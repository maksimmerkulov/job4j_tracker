package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/**
 * Service for filtering students by score levels using Stream API.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StudentLevel {

    /**
     * Returns a list of students with a score greater than or equal
     * to the bound.
     *
     * @param students the list of students, may contain nulls
     * @param bound    the minimum score threshold
     * @return filtered and sorted list of students
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparingInt(Student::getScore).reversed())
                .takeWhile(student -> student.getScore() >= bound)
                .toList();
    }
}
