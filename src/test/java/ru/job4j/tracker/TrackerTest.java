package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code TrackerTest} содержит модульные тесты для класса {@link Tracker}.
 *
 * <p>Проверяются методы {@link Tracker#add(Item)}, {@link Tracker#findById(int)},
 * {@link Tracker#findAll()} и {@link Tracker#findByName(String)}.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Tracker tracker = new Tracker();
 * Item item = new Item();
 * item.setName("test1");
 * tracker.add(item);
 * Item result = tracker.findById(item.getId());
 * assertThat(result.getName()).isEqualTo(item.getName());
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TrackerTest {

    /**
     * Тест проверяет, что после добавления новой заявки
     * она доступна по своему {@code id}.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName()).isEqualTo(item.getName());
    }

    /**
     * Тест проверяет корректность поиска заявки по {@code id}.
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
     * Тест проверяет, что метод {@code findAll()} возвращает первую добавленную заявку.
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
     * Тест проверяет, что метод {@code findByName(String)} возвращает массив
     * нужной длины при наличии нескольких заявок с одинаковым именем.
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
     * Тест проверяет, что метод {@code findByName(String)} возвращает
     * заявку с ожидаемым именем на втором месте в массиве.
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