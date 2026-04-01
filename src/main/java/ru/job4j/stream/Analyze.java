package ru.job4j.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * School statistics analysis using Stream API.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Analyze {

    /**
     * Calculates the average score of all pupils across all subjects.
     *
     * @param stream stream of pupils
     * @return the overall average score
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(0D);
    }

    /**
     * Calculates the average score for each individual pupil.
     *
     * @param stream stream of pupils
     * @return a list of tuples with pupil names and their average scores
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(
                        pupil.name(),
                        pupil.subjects().stream()
                                .mapToInt(Subject::score)
                                .average()
                                .orElse(0D)
                ))
                .collect(Collectors.toList());
    }

    /**
     * Calculates the average score for each subject across all pupils.
     *
     * @param stream stream of pupils
     * @return a list of tuples with subject names and their average scores
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::score)
                ))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    /**
     * Finds the pupil with the highest total score.
     *
     * @param stream stream of pupils
     * @return the best student tuple
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(
                        pupil.name(),
                        pupil.subjects().stream()
                                .mapToInt(Subject::score)
                                .sum()
                ))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(null);
    }

    /**
     * Finds the subject with the highest total score across all pupils.
     *
     * @param stream stream of pupils
     * @return the best subject tuple
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::name,
                        Collectors.summingDouble(Subject::score)
                ))
                .entrySet()
                .stream()
                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                .max(Comparator.comparingDouble(Tuple::score))
                .orElse(null);
    }
}
