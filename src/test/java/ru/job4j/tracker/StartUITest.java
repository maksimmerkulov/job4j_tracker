package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} содержит модульные тесты для проверки
 * ключевого поведения класса {@link StartUI}, включая создание,
 * замену и удаление заявок.
 *
 * <p>Тесты используют имитацию пользовательского ввода через {@link MockInput},
 * чтобы проверить корректность взаимодействия между пользователем, трекером и действиями.</p>
 *
 * <p><b>Покрываемые сценарии:</b></p>
 * <ul>
 *     <li>Создание новой заявки через {@link CreateAction}.</li>
 *     <li>Замена существующей заявки через {@link ReplaceAction}.</li>
 *     <li>Удаление существующей заявки через {@link DeleteAction}.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Input input = new MockInput(
 *         new String[] {"0", "Item name", "1"}
 * );
 * Tracker tracker = new Tracker();
 * UserAction[] actions = {
 *         new CreateAction(),
 *         new ExitAction()
 * };
 * new StartUI().init(input, tracker, actions);
 * assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 */
class StartUITest {

    /**
     * Тест проверяет успешное создание заявки через {@link CreateAction}.
     *
     * <p>Пользователь вводит название заявки, после чего проверяется,
     * что она добавлена в трекер с правильным именем.</p>
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
     * Тест проверяет замену существующей заявки через {@link ReplaceAction}.
     *
     * <p>Заявка заменяется на новую с другим именем, и результат проверяется по ID.</p>
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
     * Тест проверяет удаление заявки через {@link DeleteAction}.
     *
     * <p>После удаления заявка больше не должна существовать в трекере.</p>
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