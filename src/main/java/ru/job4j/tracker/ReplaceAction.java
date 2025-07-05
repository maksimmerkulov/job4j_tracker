package ru.job4j.tracker;

/**
 * Класс {@code ReplaceAction} реализует действие изменения существующей заявки
 * в хранилище заявок {@link Tracker}.
 *
 * <p>Реализует интерфейс {@link UserAction}, предоставляя пользователю возможность
 * редактировать имя заявки по ее идентификатору.</p>
 *
 * <p>Во время выполнения действия запрашивается ID заявки и новое имя. Если заявка
 * с указанным ID существует, она будет заменена новой.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Редактирование существующей заявки по ID.</li>
 *     <li>Вывод сообщения об успешной замене или ошибке, если заявка не найдена.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * UserAction action = new ReplaceAction(output);
 * boolean result = action.execute(input, tracker);
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
 * @version 1.1
 * @see UserAction
 * @see Tracker
 * @see Item
 */
public class ReplaceAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия редактирования заявки.
     *
     * @param output Объект вывода сообщений пользователю.
     */
    public ReplaceAction(Output output) {
        this.output = output;
    }

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
        output.println("=== Редактирование заявки ===");
        int id = input.askInt("Введите id: ");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            output.println("Заявка изменена успешно.");
        } else {
            output.println("Ошибка замены заявки.");
        }
        return true;
    }
}