package ru.job4j.tracker.action;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

/**
 * Класс {@code DeleteAction} реализует действие удаления заявки по ее идентификатору
 * из хранилища заявок {@link Tracker}.
 *
 * <p>Реализует интерфейс {@link UserAction}, предоставляя пользователю
 * возможность удалить ранее добавленную заявку, если она существует.</p>
 *
 * <p>Во время выполнения действия запрашивается ID заявки. Если заявка найдена —
 * она удаляется и отображается сообщение об успехе. Если не найдена — сообщение об ошибке.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Удаление существующей заявки по ее ID.</li>
 *     <li>Обработка случая, когда заявка не найдена.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * UserAction action = new DeleteAction(output);
 * boolean result = action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Удаление заявки ===
 * Введите id: 1
 * Заявка удалена успешно.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.3
 * @see UserAction
 * @see Tracker
 * @see Item
 */
public class DeleteAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия удаления заявки.
     *
     * @param output объект вывода сообщений пользователю
     */
    public DeleteAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строка "Удалить заявку"
     */
    @Override
    public String name() {
        return "Удалить заявку";
    }

    /**
     * Выполняет удаление заявки по id.
     *
     * <p>Запрашивает у пользователя идентификатор, удаляет соответствующую заявку
     * из {@link Tracker} и выводит сообщение об успехе или неудаче операции.</p>
     *
     * @param input   интерфейс получения пользовательского ввода
     * @param tracker хранилище заявок
     * @return {@code true}, чтобы продолжить выполнение программы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        tracker.delete(id);
        output.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
        return true;
    }
}
