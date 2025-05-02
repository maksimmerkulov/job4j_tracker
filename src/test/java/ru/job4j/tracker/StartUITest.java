package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} представляет собой модульный тест для проверки взаимодействия пользователя с трекером.
 *
 * <p>Проверяются следующие сценарии:</p>
 * <ul>
 *     <li>Добавление новых элементов через {@link StartUI#createItem(Input, Tracker)}</li>
 *     <li>Редактирование элемента через {@link StartUI#replaceItem(Input, Tracker)}</li>
 *     <li>Удаление элемента через {@link StartUI#deleteItem(Input, Tracker)}</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] answers = {"Fix PC", "Fix Bug"};
 * Input input = new MockInput(answers);
 * Tracker tracker = new Tracker();
 * StartUI.createItem(input, tracker);
 * StartUI.createItem(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Item name = Fix PC
 * Item name = Fix Bug
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @since 2025-05-02
 */
class StartUITest {

    /**
     * Проверяет, что при добавлении элементов через {@link StartUI#createItem(Input, Tracker)}
     * они корректно сохраняются в {@link Tracker} с ожидаемыми именами.
     *
     * <p>Создается {@link MockInput} с двумя строками: "Fix PC" и "Fix Bug".
     * Метод {@link StartUI#createItem(Input, Tracker)} вызывается дважды,
     * и оба элемента должны быть добавлены в трекер.
     * Затем имена сохраненных элементов сравниваются с ожидаемыми значениями.</p>
     *
     * @apiNote Использует {@link MockInput} для имитации пользовательского ввода.
     * @implSpec Сравнение выполняется с использованием библиотеки AssertJ.
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
     * Проверяет замену существующего элемента на новый с другим именем.
     *
     * <p>Добавляется один элемент "new item", затем заменяется на "edited item"
     * через {@link StartUI#replaceItem(Input, Tracker)}.
     * Проверяется, что имя элемента обновилось.</p>
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
     * Проверяет удаление элемента из {@link Tracker}.
     *
     * <p>Создается элемент "new item", затем он удаляется с помощью {@link StartUI#deleteItem(Input, Tracker)}.
     * Проверяется, что элемент больше не доступен по своему ID (равен {@code null}).</p>
     */
    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("new item");
        tracker.add(item);
        String[] answers = {
                String.valueOf(item.getId())
        };
        StartUI.deleteItem(new MockInput(answers), tracker);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted).isNull();
    }
}