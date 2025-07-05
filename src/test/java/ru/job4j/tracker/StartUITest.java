package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.MockInput;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} содержит модульные тесты для проверки поведения класса {@link StartUI}.
 *
 * <p>Проверяются действия над заявками: создание, замена, удаление, поиск по id и имени,
 * вывод всех заявок, а также корректность вывода меню и интерфейса.</p>
 *
 * <p>Для имитации пользовательского ввода используется {@link MockInput}, а для перехвата вывода — {@link StubOutput}.</p>
 *
 * <p><b>Покрываемые сценарии:</b></p>
 * <ul>
 *     <li>Создание новой заявки ({@link CreateAction}).</li>
 *     <li>Замена заявки по id ({@link ReplaceAction}).</li>
 *     <li>Удаление заявки ({@link DeleteAction}).</li>
 *     <li>Завершение программы ({@link ExitAction}).</li>
 *     <li>Вывод всех заявок ({@link FindAllAction}).</li>
 *     <li>Поиск заявки по имени ({@link FindByNameAction}).</li>
 *     <li>Поиск заявки по id ({@link FindByIdAction}).</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Output output = new StubOutput();
 * Input input = new MockInput(
 *         new String[] {"0", "Item name", "1"}
 * );
 * Tracker tracker = new Tracker();
 * UserAction[] actions = {
 *         new CreateAction(output),
 *         new ExitAction(output)
 * };
 * new StartUI(output).init(input, tracker, actions);
 * assertThat(tracker.findAll()[0].getName()).isEqualTo("Item name");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.6
 */
class StartUITest {

    /**
     * Проверяет успешное создание заявки через {@link CreateAction}.
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
     * Проверяет замену существующей заявки через {@link ReplaceAction}.
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
     * Проверяет удаление заявки через {@link DeleteAction}.
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

    /**
     * Проверяет корректное завершение программы по команде выхода.
     *
     * <p>Пользователь выбирает действие "Завершить программу".
     * Ожидается, что программа отобразит сообщение о завершении и завершит выполнение.</p>
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

    /**
     * Проверяет корректность вывода при успешной замене заявки.
     *
     * <p>Добавляется заявка, затем она заменяется по ID на новую с другим именем.
     * Ожидается, что в выводе будет подтверждение успешной замены и корректное меню до и после действия.</p>
     */
    @Test
    void whenReplaceItemTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input input = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Редактирование заявки ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Меню:" + ln
                        + "0. Изменить заявку" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    /**
     * Проверяет корректность вывода всех заявок.
     *
     * <p>Добавляются две заявки, затем вызывается команда показа всех заявок.
     * Ожидается, что обе заявки будут отображены в выводе.</p>
     */
    @Test
    void whenFindAllActionTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test2"));
        Input input = new MockInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindAllAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод всех заявок ===" + ln
                        + one + ln
                        + two + ln
                        + "Меню:" + ln
                        + "0. Показать все заявки" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    /**
     * Проверяет корректность вывода заявок по имени.
     *
     * <p>Добавляются две заявки с одинаковым именем. Пользователь выбирает команду
     * поиска по имени и вводит это имя.
     * Ожидается, что обе заявки с совпадающим именем будут найдены и выведены на экран.</p>
     */
    @Test
    void whenFindByNameActionTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Item two = tracker.add(new Item("test1"));
        Input input = new MockInput(
                new String[] {"0", one.getName(), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявок по имени ===" + ln
                        + one + ln
                        + two + ln
                        + "Меню:" + ln
                        + "0. Показать заявки по имени" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }

    /**
     * Проверяет корректность вывода заявки по ID.
     *
     * <p>Добавляется заявка, затем вызывается команда поиска по ее ID.
     * Ожидается, что заявка с указанным ее ID будет найдена и выведена на экран.</p>
     */
    @Test
    void whenFindByIdActionTestOutputIsSuccessfully() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        Input input = new MockInput(
                new String[] {"0", String.valueOf(one.getId()), "1"}
        );
        UserAction[] actions = new UserAction[]{
                new FindByIdAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(output.toString()).isEqualTo(
                "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Вывод заявки по id ===" + ln
                        + one + ln
                        + "Меню:" + ln
                        + "0. Показать заявку по id" + ln
                        + "1. Завершить программу" + ln
                        + "=== Завершение программы ===" + ln
        );
    }
}