package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code DepartmentsTest} содержит модульные тесты
 * для проверки работы методов класса {@link Departments}.
 *
 * <p>Тестируются сценарии восстановления пропущенных
 * подразделений ({@link Departments#fillGaps(List)}),
 * а также сортировка в прямом ({@link Departments#sortAsc(List)})
 * и обратном ({@link Departments#sortDesc(List)}) порядке.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * List<String> input = Arrays.asList("k1/sk1", "k2/sk1");
 * List<String> expected = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1");
 * List<String> result = Departments.fillGaps(input);
 * assertThat(result).containsSequence(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class DepartmentsTest {

    /**
     * Проверяет, что при отсутствии родительских подразделений метод
     * {@link Departments#fillGaps(List)} корректно добавляет их в список.
     */
    @Test
    void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1", "k2/sk1");
        List<String> expected = Arrays.asList("k1", "k1/sk1", "k2", "k2/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result).containsSequence(expected);
    }

    /**
     * Проверяет, что если все подразделения уже присутствуют,
     * метод {@link Departments#fillGaps(List)} не изменяет список.
     */
    @Test
    void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expected = Arrays.asList("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result).containsSequence(expected);
    }

    /**
     * Проверяет добавление недостающих подразделений при сложной иерархии.
     */
    @Test
    void whenMissedSomeDepartmentsCode() {
        List<String> input = Arrays.asList(
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        List<String> expected = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1"
        );
        List<String> result = Departments.fillGaps(input);
        assertThat(result).containsSequence(expected);
    }

    /**
     * Проверяет сортировку в прямом порядке,
     * когда в списке нет пропущенных подразделений.
     */
    @Test
    void whenSortAscWithoutMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1",
                "K1/SK2",
                "K1",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        List<String> expected = Arrays.asList(
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        Departments.sortAsc(input);
        assertThat(input).containsSequence(expected);
    }

    /**
     * Проверяет сортировку в прямом порядке
     * при наличии пропущенных подразделений.
     */
    @Test
    void whenSortAscWithMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2/SK1",
                "K1/SK2",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        List<String> expected = Arrays.asList(
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2"
        );
        Departments.sortAsc(input);
        assertThat(input).containsSequence(expected);
    }

    /**
     * Проверяет сортировку в обратном порядке,
     * когда в списке нет пропущенных подразделений.
     */
    @Test
    void whenSortDescWithoutMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1",
                "K1/SK2",
                "K1",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        List<String> expected = Arrays.asList(
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        Departments.sortDesc(input);
        assertThat(input).containsSequence(expected);
    }

    /**
     * Проверяет сортировку в обратном порядке
     * при наличии пропущенных подразделений.
     */
    @Test
    void whenSortDescWithMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2/SK1",
                "K1/SK2",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        List<String> expected = Arrays.asList(
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        Departments.sortDesc(input);
        assertThat(input).containsSequence(expected);
    }
}
