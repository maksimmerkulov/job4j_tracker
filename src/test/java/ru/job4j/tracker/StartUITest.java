package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} содержит модульные тесты для проверки поведения методов {@link StartUI}.
 *
 * <p>Используется для проверки корректности операций добавления, редактирования и удаления заявок
 * в {@link Tracker} с использованием подставного ввода через {@link MockInput}.</p>
 *
 * <p><b>Сценарии тестирования:</b></p>
 * <ul>
 *     <li>Добавление двух заявок и проверка их сохранения в правильном порядке.</li>
 *     <li>Замена существующей заявки и проверка обновленного значения имени.</li>
 *     <li>Удаление заявки и проверка отсутствия ее в хранилище.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC", "Fix Bug"};
 * Input input = new MockInput(answers);
 * Tracker tracker = new Tracker();
 * StartUI.createItem(input, tracker);
 * StartUI.createItem(input, tracker);
 *
 * Item first = tracker.findAll()[0];
 * Item second = tracker.findAll()[1];
 *
 * assertThat(first.getName()).isEqualTo("Fix PC");
 * assertThat(second.getName()).isEqualTo("Fix Bug");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class StartUITest {

    /**
     * Тест проверяет последовательное добавление двух заявок через {@link StartUI#createItem(Input, Tracker)}.
     *
     * <p>Ожидаемый результат: заявки с именами {@code "Fix PC"} и {@code "Fix Bug"} добавлены
     * в хранилище в заданном порядке.</p>
     */
    @Test
    void whenAddItem() {
        String[] answers = {"Fix PC", "Fix Bug"};
        Input input = new MockInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName()).isEqualTo(expected.getName());
        created = tracker.findAll()[1];
        expected = new Item("Fix Bug");
        assertThat(created.getName()).isEqualTo(expected.getName());
    }

    /**
     * Тест проверяет замену имени существующей заявки через {@link StartUI#replaceItem(Input, Tracker)}.
     *
     * <p>Ожидаемый результат: имя заявки по заданному id изменяется на новое.</p>
     */
    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId()),
                "edited item"
        };
        StartUI.replaceItem(new MockInput(answers), tracker);
        Item edited = tracker.findById(item.getId());
        assertThat(edited.getName()).isEqualTo("edited item");
    }

    /**
     * Тест проверяет удаление заявки через {@link StartUI#deleteItem(Input, Tracker)}.
     *
     * <p>Ожидаемый результат: заявка по заданному id удаляется,
     * и {@code tracker.findById(id)} возвращает {@code null}.</p>
     */
    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item to delete");
        tracker.add(item);
        String[] answers = {String.valueOf(item.getId())};
        StartUI.deleteItem(new MockInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted).isNull();
    }
}