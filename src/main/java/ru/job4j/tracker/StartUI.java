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
 * Введите имя: test
 * Добавленная заявка: Item{id=1, name='test', created=28-апреля-понедельник-2025 06:22:49}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.11
 * @see UserAction
 * @see Tracker
 * @see Input
 */
public class StartUI {

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
        System.out.println("Меню:");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
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