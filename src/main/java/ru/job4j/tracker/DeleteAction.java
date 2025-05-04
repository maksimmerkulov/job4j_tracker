package ru.job4j.tracker;

/**
 * Класс {@code DeleteAction} реализует удаление заявки
 * из системы отслеживания заявок {@link Tracker}.
 *
 * <p>Используется для удаления {@link Item} по заданному идентификатору.
 * Пользователь вводит id, после чего производится попытка удаления.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new DeleteAction();
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Удаление заявки ===
 * Введите id: 2
 * Заявка удалена успешно.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DeleteAction implements UserAction {

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
        System.out.println("=== Удаление заявки ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        tracker.delete(id);
        System.out.println(item != null ? "Заявка удалена успешно." : "Ошибка удаления заявки.");
        return true;
    }
}