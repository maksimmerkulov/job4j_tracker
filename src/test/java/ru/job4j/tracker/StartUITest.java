package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} представляет собой модульные тесты для проверки
 * пользовательского интерфейса {@link StartUI}, включая действия создания, замены и удаления заявок.
 *
 * <p>Используется для проверки правильности работы интерактивного ввода через {@link Input}
 * и корректности выполнения операций над заявками в {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * StartUITest test = new StartUITest();
 * test.whenCreateItem();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * (проверка проходит без исключений и assertion ошибок)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class StartUITest {

    /**
     * Проверяет создание новой заявки пользователем.
     *
     * <p>Сценарий: пользователь выбирает действие создания, вводит название и завершает программу.
     * Ожидается, что заявка будет добавлена в хранилище с заданным именем.</p>
     */
    @Test
    void whenCreateItem() {
        Input input = new MockInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
    }

    /**
     * Проверяет замену существующей заявки.
     *
     * <p>Сценарий: добавляется заявка, затем пользователь выбирает операцию замены,
     * вводит ID заявки и новое имя. Ожидается, что имя будет обновлено.</p>
     */
    @Test
    void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input input = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName()).isEqualTo(replacedName);
    }

    /**
     * Проверяет удаление существующей заявки.
     *
     * <p>Сценарий: добавляется заявка, затем пользователь выбирает удаление
     * и вводит ее ID. После выполнения заявка должна быть удалена из хранилища.</p>
     */
    @Test
    void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input input = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }
}