package ru.job4j.hashmap;

import java.util.List;

/**
 * Класс {@code Pupil} представляет ученика с именем и списком предметов с оценками.
 *
 * <p>Используется для анализа успеваемости, где {@code name} — имя ученика,
 * а {@code subjects} — список объектов {@link Subject}, содержащих название предмета
 * и оценку по нему.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Pupil pupil = new Pupil("Ivanov", List.of(
 *     new Subject("Math", 80),
 *     new Subject("Lang", 70)
 * ));
 * String name = pupil.name();
 * List<Subject> subjects = pupil.subjects();
 *
 * System.out.println(name);
 * System.out.println(subjects);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ivanov
 * [Subject[name=Math, score=80], Subject[name=Lang, score=70]]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Pupil(String name, List<Subject> subjects) {
}
