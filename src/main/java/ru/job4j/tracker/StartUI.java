package ru.job4j.tracker;

import ru.job4j.tracker.action.*;
import ru.job4j.tracker.input.ConsoleInput;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.input.ValidateInput;
import ru.job4j.tracker.output.ConsoleOutput;
import ru.job4j.tracker.output.Output;

import java.util.List;

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
 * Output output = new ConsoleOutput();
 * Input input = new ValidateInput(output, new ConsoleInput());
 * Tracker tracker = new Tracker();
 * List<UserAction> actions = new ArrayList<>();
 * actions.add(new CreateAction(output));
 * actions.add(new FindAllAction(output));
 * actions.add(new ReplaceAction(output));
 * actions.add(new DeleteAction(output));
 * actions.add(new FindByIdAction(output));
 * actions.add(new FindByNameAction(output));
 * actions.add(new ExitAction(output));
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
 * === Создание новой заявки ===
 * Введите имя: Fix PC
 * Добавленная заявка: Item{id=1, name='Fix PC', created=05-мая-понедельник-2025 16:15:49}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.19
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
     * @param output объект для вывода сообщений пользователю
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
     * @param input   источник пользовательского ввода (например, {@link ConsoleInput})
     * @param tracker хранилище заявок
     * @param actions список доступных пользовательских действий
     */
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            showMenu(actions);
            int select = input.askInt("Выбрать: ");
            if (select < 0 || select >= actions.size()) {
                output.println("Неверный ввод, вы можете выбрать: 0 .. "
                        + (actions.size() - 1));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Отображает список доступных действий в виде нумерованного меню.
     *
     * <p>Меню содержит пункты для добавления, редактирования, удаления
     * и поиска заявок, а также пункт для выхода из программы.</p>
     *
     * @param actions список доступных действий, реализующих интерфейс {@link UserAction}
     */
    private void showMenu(List<UserAction> actions) {
        output.println("Меню:");
        for (int index = 0; index < actions.size(); index++) {
            output.println(index + ". " + actions.get(index).name());
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Создает необходимые компоненты (ввод, хранилище, действия)
     * и запускает пользовательский интерфейс.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input input = new ValidateInput(output, new ConsoleInput());
        Tracker tracker = new Tracker();
        List<UserAction> actions = List.of(
                new CreateAction(output),
                new FindAllAction(output),
                new ReplaceAction(output),
                new DeleteAction(output),
                new FindByIdAction(output),
                new FindByNameAction(output),
                new ExitAction(output)
        );
        new StartUI(output).init(input, tracker, actions);
        Log4File log = Log4File.getInstance();
        log.add("add new Item");
        log.save();
    }
}
