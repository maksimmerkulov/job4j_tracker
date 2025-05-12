package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code FindAllAction} реализует отображение всех заявок,
 * находящихся в системе {@link Tracker}.
 *
 * <p>Используется для получения и отображения полного списка объектов {@link Item},
 * сохраненных в {@link Tracker}. Если заявок нет, выводится соответствующее сообщение.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * tracker.add(new Item("Заявка 1"));
 * tracker.add(new Item("Заявка 2"));
 * UserAction action = new FindAllAction(new ConsoleOutput());
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода (если заявки есть):</b></p>
 * <pre>{@code
 * === Вывод всех заявок ===
 * Item{id=1, name='Заявка 1'}
 * Item{id=2, name='Заявка 2'}
 * }</pre>
 *
 * <p><b>Пример вывода (если заявок нет):</b></p>
 * <pre>{@code
 * === Вывод всех заявок ===
 * Хранилище еще не содержит заявок
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.2
 */
public class FindAllAction implements UserAction {

    /**
     * Интерфейс вывода информации пользователю.
     */
    private Output output;

    /**
     * Конструктор, инициализирующий действие с заданным интерфейсом вывода.
     *
     * @param output реализация интерфейса {@link Output} для отображения сообщений
     */
    public FindAllAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия
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
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                output.println(item);
            }
        } else {
            output.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}