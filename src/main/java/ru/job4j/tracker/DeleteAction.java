package ru.job4j.tracker;

/**
 * Класс {@code DeleteAction} реализует действие удаления заявки по идентификатору.
 *
 * <p>Реализует интерфейс {@link UserAction} и позволяет пользователю удалить
 * существующую заявку из хранилища {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UserAction action = new DeleteAction();
 * action.execute(new ConsoleInput(), tracker);
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
 * @version 1.0
 * @see UserAction
 */
public class DeleteAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Удалить заявку".
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
     * @param input   Интерфейс получения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
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