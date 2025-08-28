package ru.job4j.hashmap;

import java.util.*;

/**
 * Класс {@code AnalyzeByMap} предоставляет методы для анализа оценок учеников.
 *
 * <p>Методы позволяют вычислять средние баллы, определять лучших учеников и предметы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Subject> subjects1 = List.of(new Subject("Math", 90), new Subject("Physics", 80));
 * List<Subject> subjects2 = List.of(new Subject("Math", 70), new Subject("Physics", 95));
 *
 * Pupil pupil1 = new Pupil("Ivan", subjects1);
 * Pupil pupil2 = new Pupil("Anna", subjects2);
 *
 * List<Pupil> pupils = List.of(pupil1, pupil2);
 *
 * double average = AnalyzeByMap.averageScore(pupils);
 * List<Label> byPupil = AnalyzeByMap.averageScoreByPupil(pupils);
 * List<Label> bySubject = AnalyzeByMap.averageScoreBySubject(pupils);
 * Label bestStudent = AnalyzeByMap.bestStudent(pupils);
 * Label bestSubject = AnalyzeByMap.bestSubject(pupils);
 *
 * System.out.println("Общий средний балл: " + average);
 * System.out.println("Средний балл по каждому ученику: " + byPupil);
 * System.out.println("Средний балл по каждому предмету: " + bySubject);
 * System.out.println("Лучший ученик: " + bestStudent);
 * System.out.println("Лучший предмет: " + bestSubject);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Общий средний балл: 83.75
 * Средний балл по каждому ученику: [Label[name=Ivan, score=85.0], Label[name=Anna, score=82.5]]
 * Средний балл по каждому предмету: [Label[name=Math, score=80.0], Label[name=Physics, score=87.5]]
 * Лучший ученик: Label[name=Ivan, score=170.0]
 * Лучший предмет: Label[name=Physics, score=175.0]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class AnalyzeByMap {

    /**
     * Вычисляет общий средний балл всех учеников по всем предметам.
     *
     * @param pupils список учеников
     * @return общий средний балл
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
     * Вычисляет средний балл по каждому ученику.
     *
     * @param pupils список учеников
     * @return список объектов {@code Label} (имя ученика и средний балл)
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            double average = pupil.subjects().isEmpty() ? 0 : sum / pupil.subjects().size();
            result.add(new Label(pupil.name(), average));
        }
        return result;
    }

    /**
     * Вычисляет средний балл по каждому предмету.
     *
     * @param pupils список учеников
     * @return список объектов {@code Label} (название предмета и средний балл)
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> sumMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumMap.put(subject.name(), sumMap.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> result = new ArrayList<>();
        int pupilCount = pupils.size();
        for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
            double average = pupilCount == 0 ? 0 : (double) entry.getValue() / pupilCount;
            result.add(new Label(entry.getKey(), average));
        }
        return result;
    }

    /**
     * Определяет лучшего ученика по сумме баллов по всем предметам.
     *
     * @param pupils список учеников
     * @return объект {@code Label} (имя ученика и суммарный балл)
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
     * Определяет предмет с наибольшим суммарным баллом всех учеников.
     *
     * @param pupils список учеников
     * @return объект {@code Label} (название предмета и суммарный балл)
     */
    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> sumMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sumMap.put(subject.name(), sumMap.getOrDefault(subject.name(), 0) + subject.score());
            }
        }
        List<Label> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sumMap.entrySet()) {
            list.add(new Label(entry.getKey(), entry.getValue()));
        }
        list.sort(Comparator.naturalOrder());
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }
}
