package ru.job4j.tracker;

/**
 * Класс {@code FindByIdAction} реализует действие поиска заявки по идентификатору.
 *
 * <p>Реализует интерфейс {@link UserAction} и позволяет пользователю ввести id
 * для поиска заявки в хранилище {@link Tracker}. В случае успеха — заявка отображается,
 * иначе выводится сообщение об ошибке.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UserAction action = new FindByIdAction();
 * action.execute(new ConsoleInput(), tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод заявки по id ===
 * Введите id: 1
 * Item{id=1, name='Fix PC', created=...}
 *
 * === Вывод заявки по id ===
 * Введите id: 100
 * Заявка с введенным id: 100 не найдена.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see UserAction
 */
public class FindByIdAction implements UserAction {

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
        System.out.println("=== Вывод заявки по id ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}