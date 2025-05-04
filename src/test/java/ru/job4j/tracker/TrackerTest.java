package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code TrackerTest} содержит модульные тесты для проверки методов класса {@link Tracker}.
 *
 * <p><b>Проверяемые методы:</b></p>
 * <ul>
 *     <li>{@link Tracker#add(Item)} — добавление новой заявки в хранилище.</li>
 *     <li>{@link Tracker#findAll()} — получение списка всех заявок.</li>
 *     <li>{@link Tracker#findByName(String)} — поиск заявок по имени.</li>
 *     <li>{@link Tracker#findById(int)} — поиск заявки по уникальному идентификатору.</li>
 *     <li>{@link Tracker#replace(int, Item)} — замена заявки по уникальному идентификатору.</li>
 *     <li>{@link Tracker#delete(int)} — удаление заявки по уникальному идентификатору.</li>
 * </ul>
 *
 * <p><b>Тестируемые сценарии:</b></p>
 * <ul>
 *     <li>Проверка успешного добавления заявки.</li>
 *     <li>Проверка поиска заявки по ID.</li>
 *     <li>Проверка получения всех заявок.</li>
 *     <li>Проверка поиска заявок по имени.</li>
 *     <li>Проверка успешной замены заявки по ID.</li>
 *     <li>Проверка неудачной замены заявки с несуществующим ID.</li>
 *     <li>Проверка успешного удаления заявки по ID.</li>
 *     <li>Проверка неудачного удаления заявки с несуществующим ID.</li>
 * </ul>
 *
 * @author Maksim Merkulov
 * @version 1.3
 */
public class TrackerTest {

    /**
     * Проверяет работу метода {@link Tracker#findById(int)}.
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
     * Проверяет работу метода {@link Tracker#findAll()}.
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
     * Проверяет работу метода {@link Tracker#findByName(String)}.
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
     * Проверяет работу метода {@link Tracker#findByName(String)}.
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

    /**
     * Проверяет успешную замену заявки методом {@link Tracker#replace(int, Item)}.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляется заявка "Bug".</li>
     *     <li>Заявка заменяется на новую с именем "Bug with description".</li>
     *     <li>Проверяется, что имя заявки в хранилище после замены совпадает с новым именем.</li>
     * </ul>
     * </p>
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
     * Проверяет неудачную попытку замены заявки методом {@link Tracker#replace(int, Item)}.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляется заявка "Bug".</li>
     *     <li>Пробуется заменить заявку с несуществующим ID (1000).</li>
     *     <li>Проверяется, что замена не выполнена, и имя заявки осталось прежним.</li>
     *     <li>Проверяется, что метод {@link Tracker#replace(int, Item)} возвращает {@code false}.</li>
     * </ul>
     * </p>
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
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляется заявка "Bug".</li>
     *     <li>Заявка удаляется по ID.</li>
     *     <li>Проверяется, что заявка была успешно удалена, и поиск по ID возвращает {@code null}.</li>
     * </ul>
     * </p>
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
     * Проверяет неудачную попытку удаления заявки методом {@link Tracker#delete(int)} с несуществующим ID.
     *
     * <p>Сценарий:
     * <ul>
     *     <li>Добавляется заявка "Bug".</li>
     *     <li>Пробуется удалить заявку с несуществующим ID (1000).</li>
     *     <li>Проверяется, что удаление не выполнено, и заявка осталась в хранилище.</li>
     * </ul>
     * </p>
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