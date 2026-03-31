package ru.job4j.stream;

import java.util.List;

/**
 * Student data with a name and a list of subjects.
 *
 * @param name     the pupil name
 * @param subjects the list of subjects with scores
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Pupil(String name, List<Subject> subjects) {
}
