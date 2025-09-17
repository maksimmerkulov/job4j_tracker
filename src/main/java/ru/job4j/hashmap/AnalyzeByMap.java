package ru.job4j.hashmap;

import java.util.*;

/**
 * Provides methods for analyzing student grades using map-based operations.
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class AnalyzeByMap {

    /**
     * Calculates the overall average score of all pupils across all subjects.
     *
     * @param pupils the list of pupils
     * @return the overall average score
     */
    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    /**
     * Calculates the average score for each pupil.
     *
     * @param pupils the list of pupils
     * @return a list of labels containing pupil names and their average scores
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            double average = pupil.subjects().isEmpty()
                    ? 0
                    : sum / pupil.subjects().size();
            result.add(new Label(pupil.name(), average));
        }
        return result;
    }

    /**
     * Calculates the average score for each subject across all pupils.
     *
     * @param pupils the list of pupils
     * @return a list of labels containing subject names
     *         and their average scores
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> sumMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        List<Label> result = new ArrayList<>();
        int pupilCount = pupils.size();
        for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
            double average = pupilCount == 0
                    ? 0
                    : (double) entry.getValue() / pupilCount;
            result.add(new Label(entry.getKey(), average));
        }
        return result;
    }

    /**
     * Determines the best student based on the total score across all subjects.
     *
     * @param pupils the list of pupils
     * @return the label of the best student,
     *         or {@code null} if the list is empty
     */
    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            list.add(new Label(pupil.name(), sum));
        }
        list.sort(Comparator.naturalOrder());
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    /**
     * Determines the subject with the highest total score across all pupils.
     *
     * @param pupils the list of pupils
     * @return the label of the best subject,
     *         or {@code null} if the list is empty
     */
    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> sumMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumMap.merge(subject.name(), subject.score(), Integer::sum);
            }
        }
        List<Label> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
            list.add(new Label(entry.getKey(), (double) entry.getValue()));
        }
        list.sort(Comparator.naturalOrder());
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }
}
