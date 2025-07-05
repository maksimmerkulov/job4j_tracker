package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code CreateAction} реализует действие по добавлению новой заявки
 * в хранилище {@link Tracker}.
 *
 * <p>Реализует интерфейс {@link UserAction}, предоставляя пользователю
 * возможность ввести имя заявки, создать объект {@link Item} и сохранить его
 * в трекере.</p>
 *
 * <p>После успешного добавления заявки выводится ее представление в консоль.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Создание новой заявки с вводом имени.</li>
 *     <li>Добавление заявки в хранилище.</li>
 *     <li>Вывод результата пользователю.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new CreateAction(output);
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Создание новой заявки ===
 * Введите имя: Fix PC
 * Добавленная заявка: Item{id=1, name='Fix PC', created=05-мая-понедельник-2025 16:15:49}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @see UserAction
 * @see Tracker
 * @see Item
 */
public class CreateAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия создания новой заявки.
     *
     * @param output Объект вывода сообщений пользователю.
     */
    public CreateAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Добавить новую заявку".
     */
    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    /**
     * Выполняет добавление новой заявки.
     *
     * <p>Запрашивает у пользователя имя новой заявки, создает объект {@link Item}
     * и добавляет его в {@link Tracker}. После этого выводит результат операции.</p>
     *
     * @param input   Интерфейс получения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        output.println("Добавленная заявка: " + item);
        return true;
    }
}