package ru.job4j.hashmap;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

/**
 * Класс {@code AnalyzeByMapTest} содержит модульные тесты для проверки работы
 * методов класса {@link AnalyzeByMap}.
 *
 * <p>Основные сценарии:</p>
 * <ul>
 *     <li>Вычисление общего среднего балла всех учеников.</li>
 *     <li>Вычисление среднего балла по каждому ученику.</li>
 *     <li>Вычисление среднего балла по каждому предмету.</li>
 *     <li>Определение лучшего ученика по сумме баллов всех предметов.</li>
 *     <li>Определение предмета с наибольшей суммой баллов всех учеников.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * List<Pupil> pupils = List.of(
 *     new Pupil("Ivanov", List.of(new Subject("Math", 100), new Subject("Lang", 70), new Subject("Philosophy", 80))),
 *     new Pupil("Petrov", List.of(new Subject("Math", 80), new Subject("Lang", 90), new Subject("Philosophy", 70))),
 *     new Pupil("Sidorov", List.of(new Subject("Math", 70), new Subject("Lang", 60), new Subject("Philosophy", 50)))
 * );
 * double average = AnalyzeByMap.averageScore(pupils);
 * assertThat(average).isCloseTo(74.44, offset(0.01D));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class AnalyzeByMapTest {

    /**
     * Проверяет вычисление общего среднего балла всех учеников.
     */
    @Test
    public void whenAverageScore() {
        double average = AnalyzeByMap.averageScore(
                List.of(
                        new Pupil("Ivanov",
                                List.of(
                                        new Subject("Math", 100),
                                        new Subject("Lang", 70),
                                        new Subject("Philosophy", 80)
                                )
                        ),
                        new Pupil("Petrov",
                                List.of(
                                        new Subject("Math", 80),
                                        new Subject("Lang", 90),
                                        new Subject("Philosophy", 70)
                                )
                        ),
                        new Pupil("Sidorov",
                                List.of(
                                        new Subject("Math", 70),
                                        new Subject("Lang", 60),
                                        new Subject("Philosophy", 50)
                                )
                        )
                )
        );
        assertThat(average).isCloseTo(74.44, offset(0.01D));
    }

    /**
     * Проверяет вычисление среднего балла по каждому ученику.
     */
    @Test
    public void whenListOfPupilAverage() {
        List<Label> average = AnalyzeByMap.averageScoreByPupil(
                List.of(
                        new Pupil("Ivanov",
                                List.of(
                                        new Subject("Math", 100),
                                        new Subject("Lang", 60),
                                        new Subject("Philosophy", 80)
                                )
                        ),
                        new Pupil("Petrov",
                                List.of(
                                        new Subject("Math", 80),
                                        new Subject("Lang", 90),
                                        new Subject("Philosophy", 70)
                                )
                        ),
                        new Pupil("Sidorov",
                                List.of(
                                        new Subject("Math", 70),
                                        new Subject("Lang", 60),
                                        new Subject("Philosophy", 50)
                                )
                        )
                )
        );
        assertThat(average).hasSameElementsAs(List.of(
                new Label("Ivanov", 80D),
                new Label("Petrov", 80D),
                new Label("Sidorov", 60D)
        ));
    }

    /**
     * Проверяет вычисление среднего балла по каждому предмету.
     */
    @Test
    public void whenListOfSubjectAverage() {
        List<Label> average = AnalyzeByMap.averageScoreBySubject(
                List.of(
                        new Pupil("Ivanov",
                                List.of(
                                        new Subject("Math", 70),
                                        new Subject("Lang", 90),
                                        new Subject("Philosophy", 100)
                                )
                        ),
                        new Pupil("Petrov",
                                List.of(
                                        new Subject("Lang", 60),
                                        new Subject("Math", 60),
                                        new Subject("Philosophy", 60)
                                )
                        ),
                        new Pupil("Sidorov",
                                List.of(
                                        new Subject("Philosophy", 50),
                                        new Subject("Lang", 60),
                                        new Subject("Math", 80)
                                )
                        )
                )
        );
        assertThat(average).hasSameElementsAs(List.of(
                new Label("Math", 70D),
                new Label("Lang", 70D),
                new Label("Philosophy", 70D)
        ));
    }

    /**
     * Проверяет определение лучшего ученика по сумме баллов всех предметов.
     */
    @Test
    public void whenBestPupil() {
        Label best = AnalyzeByMap.bestStudent(
                List.of(
                        new Pupil("Ivanov",
                                List.of(
                                        new Subject("Math", 100),
                                        new Subject("Lang", 60),
                                        new Subject("Philosophy", 80)
                                )
                        ),
                        new Pupil("Petrov",
                                List.of(
                                        new Subject("Math", 80),
                                        new Subject("Lang", 80),
                                        new Subject("Philosophy", 70)
                                )
                        ),
                        new Pupil("Sidorov",
                                List.of(
                                        new Subject("Math", 70),
                                        new Subject("Lang", 60),
                                        new Subject("Philosophy", 50)
                                )
                        )
                )
        );
        assertThat(best).isEqualTo(new Label("Ivanov", 240D));
    }

    /**
     * Проверяет определение предмета с наибольшей суммой баллов всех учеников.
     */
    @Test
    public void whenBestSubject() {
        Label best = AnalyzeByMap.bestSubject(
                List.of(
                        new Pupil("Ivanov",
                                List.of(
                                        new Subject("Math", 100),
                                        new Subject("Lang", 60),
                                        new Subject("Philosophy", 80)
                                )
                        ),
                        new Pupil("Petrov",
                                List.of(
                                        new Subject("Lang", 90),
                                        new Subject("Math", 80),
                                        new Subject("Philosophy", 70)
                                )
                        ),
                        new Pupil("Sidorov",
                                List.of(
                                        new Subject("Philosophy", 50),
                                        new Subject("Math", 70),
                                        new Subject("Lang", 60)
                                )
                        )
                )
        );
        assertThat(best).isEqualTo(new Label("Math", 250D));
    }
}
