package ru.job4j.map;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * College service for managing students and their subjects using Optional API.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class College {

    /** Map of students and their associated subjects. */
    private final Map<Student, Set<Subject>> students;

    /**
     * Creates a new {@code College} with the specified student-subject map.
     *
     * @param students the initial data map
     */
    public College(Map<Student, Set<Subject>> students) {
        this.students = students;
    }

    /**
     * Finds a student by their account number.
     *
     * @param account the account to search for
     * @return an {@link Optional} containing the student if found
     */
    public Optional<Student> findByAccount(String account) {
        return students.keySet()
                .stream()
                .filter(student -> student.account().equals(account))
                .findFirst();
    }

    /**
     * Finds a subject by student account and subject name.
     *
     * @param account the student account
     * @param name    the subject name
     * @return an {@link Optional} containing the subject if found
     */
    public Optional<Subject> findBySubjectName(String account, String name) {
        return findByAccount(account)
                .flatMap(student -> students.get(student)
                        .stream()
                        .filter(subject -> subject.name().equals(name))
                        .findFirst()
                );
    }
}
