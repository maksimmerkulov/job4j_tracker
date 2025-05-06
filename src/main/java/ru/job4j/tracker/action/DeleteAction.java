package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code DeleteAction} реализует удаление заявки
 * из системы отслеживания заявок {@link Tracker}.
 *
 * <p>Используется для удаления {@link Item} по заданному идентификатору.
 * Пользователь вводит id, после чего производится попытка удаления заявки.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new DeleteAction(new ConsoleOutput());
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода (если заявка удалена успешно):</b></p>
 * <pre>{@code
 * === Удаление заявки ===
 * Введите id: 2
 * Заявка удалена успешно.
 * }</pre>
 *
 * <p><b>Пример вывода (если заявка не найдена):</b></p>
 * <pre>{@code
 * === Удаление заявки ===
 * Введите id: 42
 * Ошибка удаления заявки.
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.1
 */
public class DeleteAction implements UserAction {

    /**
     * Интерфейс вывода информации пользователю.
     */
    private final Output output;

    /**
     * Конструктор, инициализирующий действие с заданным интерфейсом вывода.
     *
     * @param output реализация интерфейса {@link Output} для отображения сообщений.
     */
    public DeleteAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    @Override
    public String name() {
        return "Удалить заявку";
    }

    /**
     * Выполняет удаление заявки по идентификатору.
     *
     * <p>Запрашивает у пользователя id заявки, находит соответствующую {@link Item}
     * и удаляет ее из {@link Tracker}. Выводит сообщение об успехе или ошибке.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок.
     * @return {@code true}, если выполнение программы должно продолжаться; иначе {@code false}.
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