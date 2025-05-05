package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} представляет собой модульные тесты для проверки пользовательского интерфейса
 * {@link StartUI}, включая действия создания, замены, удаления заявок и выхода из программы.
 *
 * <p>Используется для проверки правильности обработки интерактивного ввода через {@link Input}
 * и корректности выполнения операций над заявками в {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * StartUITest test = new StartUITest();
 * test.whenCreateItem();
 * test.whenReplaceItem();
 * test.whenDeleteItem();
 * test.whenExit();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * (Проверки проходят без исключений и ошибок утверждений)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
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
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
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
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input input = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
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
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input input = new MockInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(tracker.findById(item.getId())).isNull();
    }

    /**
     * Проверяет корректное завершение программы по команде выхода.
     *
     * <p>Сценарий: пользователь выбирает действие "Завершить программу". Ожидается, что программа
     * отобразит соответствующее сообщение и завершит выполнение.</p>
     */
    @Test
    void whenExit() {
        Output output = new StubOutput();
        Input input = new MockInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        assertThat(output.toString()).isEqualTo(
                "Меню:" + System.lineSeparator()
                        + "0. Завершить программу" + System.lineSeparator()
                        + "=== Завершение программы ===" + System.lineSeparator()
        );
    }
}