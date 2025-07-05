package ru.job4j.tracker;

/**
 * Класс {@code FindByIdAction} реализует действие поиска заявки по ее идентификатору
 * в хранилище {@link Tracker}.
 *
 * <p>Реализует интерфейс {@link UserAction} и позволяет пользователю ввести ID,
 * чтобы найти конкретную заявку. При успешном поиске заявка отображается.
 * Если заявка не найдена — выводится соответствующее сообщение.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Поиск заявки по ID.</li>
 *     <li>Отображение найденной заявки или сообщение об ошибке.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * UserAction action = new FindByIdAction(output);
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод заявки по id ===
 * Введите id: 1
 * Item{id=1, name='Fix PC', created=05-мая-понедельник-2025 16:15:40}
 *
 * === Вывод заявки по id ===
 * Введите id: 100
 * Заявка с введенным id: 100 не найдена.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @see UserAction
 * @see Tracker
 * @see Item
 */
public class FindByIdAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия поиска заявки по идентификатору.
     *
     * @param output Объект вывода сообщений пользователю.
     */
    public FindByIdAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Показать заявку по id".
     */
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    /**
     * Выполняет поиск заявки по ее идентификатору.
     *
     * <p>Пользователь вводит id. Если заявка найдена, она отображается на экране.
     * Если не найдена — выводится соответствующее сообщение.</p>
     *
     * @param input Интерфейс для получения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод заявки по id ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            output.println(item);
        } else {
            output.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}