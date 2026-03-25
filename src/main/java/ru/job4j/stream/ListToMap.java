package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service for converting student lists to maps.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ListToMap {

    /**
     * Converts a list of students to a map where the key is the surname.
     *
     * <p>In case of duplicate surnames, the first encountered student is kept.
     *
     * @param list the list of students to convert
     * @return a map of surnames to students
     */
    public static Map<String, Student> convert(List<Student> list) {
        return list.stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        student -> student,
                        (existing, replacement) -> existing
                ));
    }
}
