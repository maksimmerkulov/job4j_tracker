package ru.job4j.hashmap;

/**
 * Класс {@code Subject} представляет предмет с названием и оценкой.
 *
 * <p>Используется для анализа успеваемости учеников, где {@code name} — название предмета,
 * а {@code score} — оценка по данному предмету.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Subject math = new Subject("Math", 80);
 * String subjectName = math.name();
 * int subjectScore = math.score();
 *
 * System.out.println(math);
 * System.out.println(subjectScore);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Math
 * 80
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Subject(String name, int score) {
}
