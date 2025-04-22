package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тест-класс {@code TrackerTest} содержит модульные тесты для проверки методов класса {@link Tracker}.
 *
 * <p><b>Проверяемые методы:</b></p>
 * <ul>
 *     <li>{@link Tracker#add(Item)} — добавление новой заявки.</li>
 *     <li>{@link Tracker#findAll()} — получение списка всех заявок.</li>
 *     <li>{@link Tracker#findByName(String)} — поиск заявок по имени.</li>
 *     <li>{@link Tracker#findById(int)} — поиск заявки по уникальному идентификатору.</li>
 * </ul>
 *
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-22
 */
public class TrackerTest {

    /**
     * Тест {@code whenTestFindById()} проверяет работу метода {@link Tracker#findById(int)}.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляется одна заявка с именем "Bug".</li>
     *     <li>Поиск выполняется по ее ID.</li>
     *     <li>Проверяется, что имя найденной заявки совпадает с исходной.</li>
     * </ul>
     * </p>
     */
    @Test
    public void whenTestFindById() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item item = tracker.add(bug);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName()).isEqualTo(item.getName());
    }

    /**
     * Тест {@code whenTestFindAll()} проверяет работу метода {@link Tracker#findAll()}.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляются две заявки: "First" и "Second".</li>
     *     <li>Проверяется, что первая заявка в списке соответствует первой добавленной.</li>
     * </ul>
     * </p>
     */
    @Test
    public void whenTestFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findAll()[0];
        assertThat(result.getName()).isEqualTo(first.getName());
    }

    /**
     * Тест {@code whenTestFindByNameCheckArrayLength()} проверяет метод {@link Tracker#findByName(String)}.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляются пять заявок, включая три с именем "First".</li>
     *     <li>Выполняется поиск по имени "First".</li>
     *     <li>Проверяется, что метод возвращает массив длиной 3.</li>
     * </ul>
     * </p>
     */
    @Test
    public void whenTestFindByNameCheckArrayLength() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item("First"));
        tracker.add(new Item("Second"));
        tracker.add(new Item("First"));
        Item[] result = tracker.findByName(first.getName());
        assertThat(result.length).isEqualTo(3);
    }

    /**
     * Тест {@code whenTestFindByNameCheckSecondItemName()} проверяет метод {@link Tracker#findByName(String)}.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляются заявки с именами "First", "Second", "First", "Second", "First".</li>
     *     <li>Выполняется поиск по имени "Second".</li>
     *     <li>Проверяется, что вторая найденная заявка имеет имя "Second".</li>
     * </ul>
     * </p>
     */
    @Test
    public void whenTestFindByNameCheckSecondItemName() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item("First"));
        tracker.add(new Item("Second"));
        tracker.add(new Item("First"));
        Item[] result = tracker.findByName(second.getName());
        assertThat(result[1].getName()).isEqualTo(second.getName());
    }
}