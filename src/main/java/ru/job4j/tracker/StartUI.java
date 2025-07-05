package ru.job4j.tracker;

/**
 * Класс {@code StartUI} управляет пользовательским интерфейсом приложения "Трекер заявок".
 *
 * <p>Отвечает за отображение меню, обработку пользовательского ввода и делегирование действий
 * конкретным реализациям интерфейса {@link UserAction}.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Отображение списка доступных действий.</li>
 *     <li>Получение ввода пользователя.</li>
 *     <li>Выполнение выбранного действия, делегируя логику соответствующему объекту {@link UserAction}.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction[] actions = {
 *         new CreateAction(),
 *         new FindAllAction(),
 *         new ReplaceAction(),
 *         new DeleteAction(),
 *         new FindByIdAction(),
 *         new FindByNameAction(),
 *         new ExitAction()
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
 * === Создание новой заявки ===
 * Введите имя: Fix PC
 * Добавленная заявка: Item{id=1, name='Fix PC', created=05-мая-понедельник-2025 16:15:49}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.12
 * @see UserAction
 * @see Tracker
 * @see Input
 */
public class StartUI {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает экземпляр пользовательского интерфейса с указанным объектом вывода.
     *
     * @param output Объект для вывода сообщений пользователю.
     */
    public StartUI(Output output) {
        this.output = output;
    }

    /**
     * Запускает главный цикл пользовательского интерфейса.
     *
     * <p>Метод отображает меню, получает выбор пользователя и выполняет соответствующее действие.
     * Выполнение продолжается, пока метод {@link UserAction#execute(Input, Tracker)} возвращает {@code true}.</p>
     *
     * @param input   Источник пользовательского ввода (например, {@link ConsoleInput}).
     * @param tracker Хранилище заявок.
     * @param actions Массив доступных пользовательских действий.
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
     * Отображает список доступных действий в виде нумерованного меню.
     *
     * <p>Меню содержит пункты для добавления, редактирования, удаления
     * и поиска заявок, а также пункт для выхода из программы.</p>
     *
     * @param actions Массив доступных действий, реализующих интерфейс {@link UserAction}.
     */
    private void showMenu(UserAction[] actions) {
        output.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            output.println(index + ". " + actions[index].name());
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Создает необходимые компоненты (ввод, хранилище, действия)
     * и запускает пользовательский интерфейс.</p>
     *
     * @param args Аргументы командной строки (не используются).
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