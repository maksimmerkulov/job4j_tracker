package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code FindByNameAction} реализует поиск и отображение всех заявок с заданным именем.
 *
 * <p>Используется в системе {@link Tracker} для вывода всех заявок,
 * у которых имя совпадает с введенным пользователем значением.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * tracker.add(new Item("test"));
 * tracker.add(new Item("demo"));
 * tracker.add(new Item("test"));
 * UserAction action = new FindByNameAction(new ConsoleOutput());
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода (если заявки найдены):</b></p>
 * <pre>{@code
 * === Вывод заявок по имени ===
 * Введите имя: test
 * Item{id=1, name='test'}
 * Item{id=3, name='test'}
 * }</pre>
 *
 * <p><b>Пример вывода (если заявки не найдены):</b></p>
 * <pre>{@code
 * === Вывод заявок по имени ===
 * Введите имя: unknown
 * Заявки с именем: unknown не найдены.
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.1
 */
public class FindByNameAction implements UserAction {

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
    public FindByNameAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    @Override
    public String name() {
        return "Показать заявки по имени";
    }

    /**
     * Выполняет поиск заявок по имени и выводит все совпадения.
     *
     * <p>Если заявки найдены — отображает каждую, иначе сообщает об их отсутствии.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок.
     * @return {@code true}, если выполнение программы должно продолжаться; иначе {@code false}.
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