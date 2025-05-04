package ru.job4j.tracker;

/**
 * Класс {@code ReplaceAction} реализует операцию редактирования заявки по идентификатору.
 *
 * <p>Используется в системе {@link Tracker} для замены существующей заявки
 * новой с указанным именем, при условии, что заявка с таким id существует.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * tracker.add(new Item("old name"));
 * UserAction action = new ReplaceAction();
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода (успех):</b></p>
 * <pre>{@code
 * === Редактирование заявки ===
 * Введите id: 1
 * Введите имя: new name
 * Заявка изменена успешно.
 * }</pre>
 *
 * <p><b>Пример вывода (ошибка):</b></p>
 * <pre>{@code
 * === Редактирование заявки ===
 * Введите id: 999
 * Введите имя: new name
 * Ошибка замены заявки.
 * }</pre>
 *
 * @author Maksим Merkulоv
 * @version 1.0
 */
public class ReplaceAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    @Override
    public String name() {
        return "Изменить заявку";
    }

    /**
     * Выполняет операцию замены заявки с заданным {@code id}.
     *
     * <p>Если заявка найдена, заменяет ее новой с введенным именем.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок.
     * @return {@code true}, если выполнение программы должно продолжаться; иначе {@code false}.
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