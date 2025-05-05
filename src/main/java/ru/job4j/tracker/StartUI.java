package ru.job4j.tracker;

/**
 * Класс {@code StartUI} реализует консольный пользовательский интерфейс
 * для управления заявками в системе {@link Tracker}.
 *
 * <p>Используется для запуска главного цикла приложения, отображения меню и обработки
 * пользовательского ввода через {@link Input} и {@link UserAction}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * Input input = new ConsoleInput();
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
 * @version 1.13
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
     * Инициализирует программу, отображает меню и обрабатывает выбор пользователя.
     *
     * <p>Работа продолжается в цикле, пока пользователь не выберет завершение программы.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок.
     * @param actions массив доступных действий пользователя.
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
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
     * <p>Создает объекты {@link ConsoleInput}, {@link Tracker} и массив {@link UserAction},
     * после чего запускает основной цикл приложения.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ConsoleInput();
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
    }
}