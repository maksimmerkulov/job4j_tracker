package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code FullSearchTest} содержит модульные тесты для проверки
 * работы метода {@link FullSearch#extractNumber(List)}.
 *
 * <p><b>Тестируемые методы класса {@link FullSearch}:</b></p>
 * <ul>
 *     <li>{@link FullSearch#extractNumber(List)} — извлечение уникальных номеров задач</li>
 * </ul>
 *
 * <p>Цель тестов — убедиться, что метод корректно обрабатывает списки задач,
 * включая случаи с дубликатами, уникальными элементами и пустыми списками.</p>
 *
 * <p><b>Сценарии тестов:</b></p>
 * <ol>
 *     <li>Список с дубликатами — возвращаются только уникальные номера.</li>
 *     <li>Список только с уникальными задачами — возвращаются все номера.</li>
 *     <li>Пустой список — возвращается пустое множество.</li>
 *     <li>Все задачи имеют одинаковый номер — возвращается множество из одного элемента.</li>
 * </ol>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * FullSearch fullSearch = new FullSearch();
 * List tasks = Arrays.asList(
 *         new Task("1", "First desc"),
 *         new Task("2", "Second desc"),
 *         new Task("1", "First desc")
 * );
 * var expected = new HashSet<>(Arrays.asList("1", "2"));
 * assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class FullSearchTest {

    /**
     * Проверяет, что метод удаляет дубликаты номеров задач.
     *
     * <p><b>Входные данные:</b> список из трех задач, две из которых имеют одинаковый номер "1".</p>
     * <p><b>Ожидаемый результат:</b> множество из номеров {@code ["1", "2"]}.</p>
     */
    @Test
    public void whenExtractNumberWithDuplicates() {
        FullSearch fullSearch = new FullSearch();
        List tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("1", "First desc")
        );
        var expected = new HashSet<>(Arrays.asList("1", "2"));
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }

    /**
     * Проверяет, что метод возвращает все номера, если они уникальны.
     *
     * <p><b>Входные данные:</b> список из трех задач с номерами "1", "2", "3".</p>
     * <p><b>Ожидаемый результат:</b> множество {@code ["1", "2", "3"]}.</p>
     */
    @Test
    public void whenExtractNumberWithUniqueTasks() {
        FullSearch fullSearch = new FullSearch();
        List tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("2", "Second desc"),
                new Task("3", "Third desc")
        );
        var expected = new HashSet<>(Arrays.asList("1", "2", "3"));
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }

    /**
     * Проверяет, что метод возвращает пустое множество для пустого списка.
     *
     * <p><b>Входные данные:</b> пустой список задач.</p>
     * <p><b>Ожидаемый результат:</b> пустое множество.</p>
     */
    @Test
    public void whenExtractNumberWithEmptyList() {
        FullSearch fullSearch = new FullSearch();
        List tasks = List.of();
        assertThat(fullSearch.extractNumber(tasks)).isEmpty();
    }

    /**
     * Проверяет, что метод возвращает одно значение, если все задачи имеют одинаковый номер.
     *
     * <p><b>Входные данные:</b> список из трех задач, все с номером "1".</p>
     * <p><b>Ожидаемый результат:</b> множество {@code ["1"]}.</p>
     */
    @Test
    public void whenExtractNumberWithAllTasksHavingSameNumber() {
        FullSearch fullSearch = new FullSearch();
        List tasks = Arrays.asList(
                new Task("1", "First desc"),
                new Task("1", "Second desc"),
                new Task("1", "Third desc")
        );
        Set expected = Set.of("1");
        assertThat(fullSearch.extractNumber(tasks)).containsAll(expected);
    }
}
