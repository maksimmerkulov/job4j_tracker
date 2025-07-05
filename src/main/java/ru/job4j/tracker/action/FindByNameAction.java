package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code FindByNameAction} реализует действие поиска заявок по имени
 * в хранилище {@link Tracker}.
 *
 * <p>Реализует интерфейс {@link UserAction} и предоставляет пользователю
 * возможность ввести строку имени, по которой выполняется поиск всех совпадающих заявок.</p>
 *
 * <p>Если заявки найдены — каждая из них выводится построчно.
 * Если не найдены — отображается соответствующее сообщение.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Поиск всех заявок по указанному имени.</li>
 *     <li>Вывод найденных заявок или уведомление об отсутствии совпадений.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Output output = new ConsoleOutput();
 * UserAction action = new FindByNameAction(output);
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод заявок по имени ===
 * Введите имя: Fix PC
 * Item{id=1, name='Fix PC', created=05-мая-понедельник-2025 16:15:40}
 * Item{id=3, name='Fix PC', created=05-мая-понедельник-2025 16:15:55}
 *
 * === Вывод заявок по имени ===
 * Введите имя: Bug
 * Заявки с именем: Bug не найдены.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 * @see UserAction
 * @see Tracker
 * @see Item
 */
public class FindByNameAction implements UserAction {

    /**
     * Объект вывода, используемый для отображения сообщений пользователю.
     */
    private final Output output;

    /**
     * Создает объект действия поиска заявок по имени.
     *
     * @param output Объект вывода сообщений пользователю.
     */
    public FindByNameAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Показать заявки по имени".
     */
    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    /**
     * Выполняет поиск заявок по имени.
     *
     * <p>Пользователь вводит имя. Все найденные заявки выводятся на экран.
     * Если ни одной заявки не найдено — отображается соответствующее сообщение.</p>
     *
     * @param input Интерфейс для получения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        output.println("=== Вывод заявок по имени ===");
        String name = input.askStr("Введите имя: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}