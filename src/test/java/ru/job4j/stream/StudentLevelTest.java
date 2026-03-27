package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link StudentLevel} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class StudentLevelTest {

    /**
     * Verifies that students are correctly sorted and filtered by score.
     */
    @Test
    void whenSortedScore20() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(28, "Masha"));
        input.add(new Student(128, "Petya"));
        input.add(new Student(97, "Andrey"));
        List<Student> expected = List.of(
                new Student(128, "Petya"),
                new Student(97, "Andrey"),
                new Student(28, "Masha")
        );
        assertThat(StudentLevel.levelOf(input, 20)).containsSequence(expected);
    }

    /**
     * Verifies filtering and sorting when the input list contains null elements.
     */
    @Test
    void whenSortedScore20HasNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(new Student(28, "Masha"));
        input.add(null);
        input.add(new Student(128, "Petya"));
        input.add(null);
        input.add(new Student(97, "Andrey"));
        input.add(null);
        List<Student> expected = List.of(
                new Student(128, "Petya"),
                new Student(97, "Andrey"),
                new Student(28, "Masha")
        );
        assertThat(StudentLevel.levelOf(input, 20)).containsSequence(expected);
    }

    /**
     * Verifies that only students above the specific threshold are included.
     */
    @Test
    void whenSortedScore65() {
        List<Student> input = new ArrayList<>();
        input.add(new Student(46, "Masha"));
        input.add(new Student(101, "Petya"));
        input.add(new Student(32, "Andrey"));
        input.add(new Student(84, "Boris"));
        input.add(new Student(78, "Yana"));
        input.add(new Student(65, "Nikolai"));
        List<Student> expected = List.of(
                new Student(101, "Petya"),
                new Student(84, "Boris"),
                new Student(78, "Yana"),
                new Student(65, "Nikolai")
        );
        assertThat(StudentLevel.levelOf(input, 65)).containsSequence(expected);
    }

    /**
     * Verifies that a list containing only nulls results in an empty list.
     */
    @Test
    void whenOnlyNull() {
        List<Student> input = new ArrayList<>();
        input.add(null);
        input.add(null);
        input.add(null);
        List<Student> expected = List.of();
        assertThat(StudentLevel.levelOf(input, 20)).containsAll(expected);
    }
}
