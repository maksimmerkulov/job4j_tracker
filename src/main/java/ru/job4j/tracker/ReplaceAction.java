package ru.job4j.tracker;

/**
 * Класс {@code ReplaceAction} реализует действие изменения существующей заявки.
 *
 * <p>Реализует интерфейс {@link UserAction}, предоставляя возможность
 * изменить имя заявки по ее идентификатору в {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UserAction action = new ReplaceAction();
 * action.execute(new ConsoleInput(), tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Редактирование заявки ===
 * Введите id: 1
 * Введите имя: Updated
 * Заявка изменена успешно.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see UserAction
 */
public class ReplaceAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Изменить заявку".
     */
    @Override
    public String name() {
        return "Изменить заявку";
    }

    /**
     * Выполняет операцию изменения заявки.
     *
     * <p>Запрашивает у пользователя id и новое имя, создает новый {@link Item}
     * и заменяет им заявку в {@link Tracker}. Выводит сообщение об успехе или ошибке.</p>
     *
     * @param input   Интерфейс получения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Заявка изменена успешно.");
        } else {
            System.out.println("Ошибка замены заявки.");
        }
        return true;
    }
}