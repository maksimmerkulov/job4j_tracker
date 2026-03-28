package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link Departments} class.
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class DepartmentsTest {

    /**
     * Verifies that missing parent departments are correctly added.
     */
    @Test
    void whenMissed() {
        List<String> input = List.of("k1/sk1", "k2/sk1");
        List<String> expected = List.of("k1", "k1/sk1", "k2", "k2/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result).containsSequence(expected);
    }

    /**
     * Verifies that the list remains unchanged if all departments exist.
     */
    @Test
    void whenNonChange() {
        List<String> input = List.of("k1", "k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result).containsSequence(expected);
    }

    /**
     * Verifies department expansion for complex hierarchies.
     */
    @Test
    void whenMissedSomeDepartmentsCode() {
        List<String> input = List.of(
                "K1/SK1/SSK1", "K1/SK1/SSK2", "K2/SK1/SSK1"
        );
        List<String> expected = List.of(
                "K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2",
                "K2", "K2/SK1", "K2/SK1/SSK1"
        );
        List<String> result = Departments.fillGaps(input);
        assertThat(result).containsSequence(expected);
    }

    /**
     * Verifies ascending sort order when no departments are missing.
     */
    @Test
    void whenSortAscWithoutMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1",
                "K1/SK2", "K1", "K2/SK1/SSK2", "K2/SK1/SSK1"
        );
        List<String> expected = List.of(
                "K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2",
                "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2"
        );
        Departments.sortAsc(input);
        assertThat(input).containsSequence(expected);
    }

    /**
     * Verifies ascending sort order when some departments were skipped.
     */
    @Test
    void whenSortAscWithMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1/SSK1", "K1/SK1/SSK2", "K2/SK1", "K1/SK2",
                "K2/SK1/SSK2", "K2/SK1/SSK1"
        );
        List<String> expected = List.of(
                "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2", "K2/SK1",
                "K2/SK1/SSK1", "K2/SK1/SSK2"
        );
        Departments.sortAsc(input);
        assertThat(input).containsSequence(expected);
    }

    /**
     * Verifies descending sort order when no departments are missing.
     */
    @Test
    void whenSortDescWithoutMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2", "K2/SK1",
                "K1/SK2", "K1", "K2/SK1/SSK2", "K2/SK1/SSK1"
        );
        List<String> expected = List.of(
                "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1",
                "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2"
        );
        Departments.sortDesc(input);
        assertThat(input).containsSequence(expected);
    }

    /**
     * Verifies descending sort order when some departments were skipped.
     */
    @Test
    void whenSortDescWithMissedDepartments() {
        List<String> input = Arrays.asList(
                "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K2/SK1",
                "K1/SK2", "K2/SK1/SSK2", "K2/SK1/SSK1"
        );
        List<String> expected = List.of(
                "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1/SK1",
                "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2"
        );
        Departments.sortDesc(input);
        assertThat(input).containsSequence(expected);
    }
}
