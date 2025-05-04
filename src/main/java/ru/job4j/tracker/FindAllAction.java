package ru.job4j.tracker;

/**
 * Класс {@code FindAllAction} реализует отображение всех заявок,
 * находящихся в системе {@link Tracker}.
 *
 * <p>Используется для получения полного списка объектов {@link Item}, сохраненных в {@link Tracker}.
 * Если заявок нет, выводится соответствующее сообщение.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new FindAllAction();
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод всех заявок ===
 * Item{id=1, name='Заявка 1'}
 * Item{id=2, name='Заявка 2'}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FindAllAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
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
     * @param input   интерфейс получения пользовательского ввода (не используется).
     * @param tracker хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Вывод всех заявок ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Хранилище еще не содержит заявок");
        }
        return true;
    }
}