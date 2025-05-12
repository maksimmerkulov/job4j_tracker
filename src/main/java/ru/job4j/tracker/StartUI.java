package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.*;
import ru.job4j.tracker.output.*;

/**
 * Класс {@code StartUI} реализует пользовательский интерфейс командной строки
 * для управления заявками в системе {@link Tracker}.
 *
 * <p>Используется для организации основного цикла приложения: отображения меню,
 * получения пользовательского ввода и вызова соответствующих действий.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * Input input = new ValidateInput(output, new ConsoleInput());
 * Tracker tracker = new Tracker();
 * UserAction[] actions = {
 *     new CreateAction(output),
 *     new FindAllAction(output),
 *     new ReplaceAction(output),
 *     new DeleteAction(output),
 *     new FindByIdAction(output),
 *     new FindByNameAction(output),
 *     new ExitAction(output)
 * };
 * new StartUI(output).init(input, tracker, actions);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Меню:
 * 0. Добавить новую заявку
 * 1. Показать все заявки
 * 2. Изменить заявку
 * 3. Удалить заявку
 * 4. Показать заявку по id
 * 5. Показать заявки по имени
 * 6. Завершить программу
 * Выбрать: 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.16
 */
public class StartUI {

    /**
     * Интерфейс вывода данных.
     *
     * <p>Используется для отображения информации пользователю.</p>
     */
    private final Output output;

    /**
     * Конструктор, инициализирующий действие с заданным интерфейсом вывода.
     *
     * @param output реализация интерфейса {@link Output} для отображения сообщений.
     */
    public StartUI(Output output) {
        this.output = output;
    }

    /**
     * Инициализирует основной цикл работы приложения и обрабатывает действия пользователя.
     *
     * <p>Метод отображает меню доступных действий, запрашивает ввод пользователя,
     * проверяет корректность выбора и выполняет соответствующее действие.</p>
     *
     * <p>Если пользователь вводит неверный номер действия, отображается сообщение об ошибке
     * и повторный запрос. Цикл продолжается, пока не будет выбрано действие {@link ExitAction},
     * завершающее программу.</p>
     *
     * @param input интерфейс ввода, обеспечивающий получение пользовательских данных.
     * @param tracker объект хранилища заявок, с которым работают действия.
     * @param actions массив доступных пользователю действий, каждое реализует {@link UserAction}.
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.length) {
                output.println("Неверный ввод, вы можете выбрать: 0 .. "
                        + (actions.length - 1));
                continue;
            }
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Отображает меню доступных действий.
     *
     * <p>Выводит нумерованный список всех действий, доступных пользователю.</p>
     *
     * @param actions массив действий, доступных в текущей сессии.
     */
    private void showMenu(UserAction[] actions) {
        output.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            output.println(index + ". " + actions[index].name());
        }
    }

    /**
     * Точка входа в приложение.
     *
     * <p>Создает все необходимые компоненты: консольный вывод, ввод с валидацией,
     * хранилище заявок и массив действий пользователя. После этого запускается основной
     * цикл программы через метод {@link #init(Input, Tracker, UserAction[])}.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new FindAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(input, tracker, actions);
        Log4File log = Log4File.getInstance();
        log.add("add new Item");
        log.save();
    }
}