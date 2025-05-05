package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code StartUITest} представляет собой модульные тесты для пользовательского интерфейса {@link StartUI}.
 *
 * <p>Используется для проверки корректной работы пользовательского интерфейса,
 * включая команды создания, изменения, удаления и поиска заявок в хранилище {@link Tracker},
 * а также проверки корректности текстового вывода.</p>
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
 * Меню:
 * 0. Завершить программу
 * === Завершение программы ===
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
class StartUITest {

    /**
     * Проверяет создание новой заявки пользователем.
     *
     * <p>Сценарий: пользователь выбирает действие создания, вводит название и завершает программу.</p>
     *
     * <p>Ожидание: заявка будет добавлена в хранилище с заданным именем.</p>
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
     * вводит ID заявки и новое имя.</p>
     *
     * <p>Ожидание: имя существующей заявки будет обновлено.</p>
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
     * <p>Сценарий: добавляется заявка, затем пользователь выбирает удаление и вводит ее ID.</p>
     *
     * <p>Ожидание: заявка будет удалена из хранилища.</p>
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
     * <p>Сценарий: пользователь выбирает действие "Завершить программу".</p>
     *
     * <p>Ожидание: программа отобразит сообщение о завершении и завершит выполнение.</p>
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
     * <p>Сценарий: добавляется заявка, затем она заменяется по ID на новую с другим именем.</p>
     *
     * <p>Ожидание: в выводе будет подтверждение успешной замены и корректное меню до и после действия.</p>
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
     * <p>Сценарий: добавляются две заявки, затем вызывается команда показа всех заявок.</p>
     *
     * <p>Ожидание: обе заявки будут отображены в выводе.</p>
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
     * Проверяет корректность вывода заявки по ID.
     *
     * <p>Сценарий: добавляется заявка, затем вызывается команда поиска по ее ID.</p>
     *
     * <p>Ожидание: заявка с указанным ее ID будет найдена и выведена на экран.</p>
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

    /**
     * Проверяет корректность вывода заявок по имени.
     *
     * <p>Сценарий: добавляются две заявки с одинаковым именем. Пользователь выбирает команду
     * поиска по имени и вводит это имя.</p>
     *
     * <p>Ожидание: обе заявки с совпадающим именем будут найдены и выведены на экран.</p>
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
}