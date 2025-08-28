package ru.job4j.tracker.action;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.output.Output;

import java.util.List;

/**
 * Класс {@code FindAllAction} реализует действие отображения всех заявок
 * из хранилища {@link Tracker}.
 *
 * <p>Реализует интерфейс {@link UserAction}, предоставляя пользователю возможность
 * просматривать весь список добавленных заявок.</p>
 *
 * <p>Если заявки присутствуют, каждая из них выводится построчно. В противном случае
 * отображается сообщение о том, что хранилище пусто.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Просмотр всех заявок.</li>
 *     <li>Обработка случая пустого хранилища.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * UserAction action = new FindAllAction(output);
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод всех заявок ===
 * Item{id=1, name='Fix PC', created=05-мая-понедельник-2025 16:15:40}
 * Item{id=2, name='Bug', created=05-мая-понедельник-2025 16:15:45}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.4
 * @see UserAction
 * @see Tracker
 * @see Item
 */
public class FindAllAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия отображения всех заявок.
     *
     * @param output объект вывода сообщений пользователю
     */
    public FindAllAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строка "Показать все заявки"
     */
    @Override
    public String name() {
        return "Показать все заявки";
    }

    /**
     * Выполняет операцию отображения всех заявок.
     *
     * <p>Выводит в консоль все объекты {@link Item}, находящиеся в {@link Tracker},
     * или сообщение о пустом хранилище, если заявок нет.</p>
     *
     * @param input   интерфейс получения пользовательского ввода (не используется)
     * @param tracker хранилище заявок
     * @return {@code true}, чтобы продолжить выполнение программы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод всех заявок ===");
        List<Item> items = tracker.findAll();
        if (!items.isEmpty()) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}
