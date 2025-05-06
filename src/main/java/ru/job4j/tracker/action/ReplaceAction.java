package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code ReplaceAction} реализует действие редактирования заявки по идентификатору.
 *
 * <p>Используется для замены существующей заявки новой, если заявка с указанным идентификатором
 * присутствует в системе {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * Input input = new StubInput(new String[] {"1", "new name"});
 * Tracker tracker = new Tracker();
 * tracker.add(new Item("old name"));
 * UserAction action = new ReplaceAction(output);
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Редактирование заявки ===
 * Введите id: 1
 * Введите имя: new name
 * Заявка изменена успешно.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class ReplaceAction implements UserAction {

    /**
     * Интерфейс вывода данных.
     *
     * <p>Используется для отображения информации пользователю.</p>
     */
    private final Output output;

    /**
     * Конструктор, инициализирующий действие с заданным интерфейсом вывода.
     *
     * @param output реализация интерфейса {@link Output} для отображения сообщений.
     */
    public ReplaceAction(Output output) {
        this.output = output;
    }

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