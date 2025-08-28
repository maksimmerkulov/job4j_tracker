package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code TrackerTest} содержит модульные тесты
 * для проверки работы методов класса {@link Tracker}.
 *
 * <p><b>Тестируемые методы класса {@link Tracker}:</b></p>
 *
 * <ul>
 *     <li>{@link Tracker#add(Item)} — добавление новой заявки</li>
 *     <li>{@link Tracker#findById(int)} — поиск заявки по идентификатору</li>
 *     <li>{@link Tracker#findAll()} — получение списка всех заявок</li>
 *     <li>{@link Tracker#findByName(String)} — поиск заявок по имени</li>
 *     <li>{@link Tracker#replace(int, Item)} — замена заявки по идентификатору</li>
 *     <li>{@link Tracker#delete(int)} — удаление заявки по идентификатору</li>
 * </ul>
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
 * @version 1.4
 */
public class TrackerTest {

    /**
     * Проверяет, что добавленная заявка доступна по {@code id}.
     *
     * <p>Ожидается, что имя найденной заявки совпадает с добавленным значением.</p>
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
     * Проверяет метод {@link Tracker#findById(int)} для корректного поиска по {@code id}.
     *
     * <p>Ожидается, что найденная заявка соответствует добавленной.</p>
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
     * Проверяет метод {@link Tracker#findAll()} на возвращение всех добавленных заявок.
     *
     * <p>Ожидается, что первая заявка в списке соответствует первой добавленной.</p>
     */
    @Test
    public void whenTestFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("First");
        Item second = new Item("Second");
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findAll().get(0);
        assertThat(result.getName()).isEqualTo(first.getName());
    }

    /**
     * Проверяет метод {@link Tracker#findByName(String)} на корректную длину списка результатов.
     *
     * <p>Добавляются заявки с одинаковыми именами.
     * Ожидается, что метод вернет список соответствующей длины.</p>
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
        List<Item> result = tracker.findByName(first.getName());
        assertThat(result.size()).isEqualTo(3);
    }

    /**
     * Проверяет, что метод {@link Tracker#findByName(String)} возвращает ожидаемую заявку по индексу.
     *
     * <p>Ожидается, что вторая заявка с именем "Second" окажется на позиции {@code result[1]}.</p>
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
        List<Item> result = tracker.findByName(second.getName());
        assertThat(result.get(1).getName()).isEqualTo(second.getName());
    }

    /**
     * Проверяет успешную замену заявки методом {@link Tracker#replace(int, Item)}.
     *
     * <p>Ожидается, что имя заявки по тому же {@code id} изменится после замены.</p>
     */
    @Test
    public void whenReplaceItemIsSuccessful() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        int id = item.getId();
        Item updateItem = new Item("Bug with description");
        tracker.replace(id, updateItem);
        assertThat(tracker.findById(id).getName()).isEqualTo("Bug with description");
    }

    /**
     * Проверяет, что замена заявки методом {@link Tracker#replace(int, Item)} не выполнится
     * при отсутствии заявки с заданным {@code id}.
     *
     * <p>Ожидается, что имя исходной заявки не изменится и метод вернет {@code false}.</p>
     */
    @Test
    public void whenReplaceItemIsNotSuccessful() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        Item updateItem = new Item("Bug with description");
        boolean result = tracker.replace(1000, updateItem);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo("Bug");
        assertThat(result).isFalse();
    }

    /**
     * Проверяет успешное удаление заявки методом {@link Tracker#delete(int)}.
     *
     * <p>Ожидается, что после удаления заявка не будет найдена по {@code id} (будет {@code null}).</p>
     */
    @Test
    public void whenDeleteItemIsSuccessful() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        int id = item.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id)).isNull();
    }

    /**
     * Проверяет, что удаление методом {@link Tracker#delete(int)} не приводит к изменению,
     * если заявка с указанным {@code id} отсутствует.
     *
     * <p>Ожидается, что существующая заявка останется неизменной.</p>
     */
    @Test
    public void whenDeleteItemIsNotSuccessful() {
        Tracker tracker = new Tracker();
        Item item = new Item("Bug");
        tracker.add(item);
        tracker.delete(1000);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo("Bug");
    }
}
