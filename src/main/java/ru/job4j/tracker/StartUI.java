package ru.job4j.tracker;

/**
 * Класс {@code StartUI} реализует консольный пользовательский интерфейс
 * для управления заявками в системе {@link Tracker}.
 *
 * <p>Класс отображает меню и позволяет пользователю выполнять действия:
 * добавление, просмотр, редактирование и удаление заявок, а также завершение работы программы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction[] actions = {
 *     new CreateAction(),
 *     new FindAllAction(),
 *     new ReplaceAction(),
 *     new DeleteAction(),
 *     new FindByIdAction(),
 *     new FindByNameAction(),
 *     new ExitAction()
 * };
 * new StartUI().init(input, tracker, actions);
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
 * @version 1.12
 */
public class StartUI {

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
        System.out.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new FindAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}