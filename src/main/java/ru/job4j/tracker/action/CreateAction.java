package ru.job4j.tracker.action;

import ru.job4j.tracker.input.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.Tracker;

/**
 * Класс {@code CreateAction} реализует добавление новой заявки
 * в систему отслеживания заявок {@link Tracker}.
 *
 * <p>Используется для создания новой {@link Item} на основе пользовательского ввода.
 * Выводит подтверждение об успешном добавлении.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new CreateAction(new ConsoleOutput());
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Создание новой заявки ===
 * Введите имя: Заявка 1
 * Добавленная заявка: Item{id=1, name='Заявка 1'}
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.1
 */
public class CreateAction implements UserAction {

    /**
     * Интерфейс вывода информации пользователю.
     */
    private final Output output;

    /**
     * Конструктор, инициализирующий действие с заданным интерфейсом вывода.
     *
     * @param output реализация интерфейса {@link Output} для отображения сообщений.
     */
    public CreateAction(Output output) {
        this.output = output;
    }

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    @Override
    public String name() {
        return "Добавить новую заявку";
    }

    /**
     * Выполняет добавление новой заявки.
     *
     * <p>Запрашивает у пользователя имя новой заявки, создает объект {@link Item}
     * и добавляет его в {@link Tracker}. После этого выводит результат операции.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок.
     * @return {@code true}, если выполнение программы должно продолжаться; иначе {@code false}.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        output.println("Добавленная заявка: " + item);
        return true;
    }
}