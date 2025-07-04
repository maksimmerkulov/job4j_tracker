package ru.job4j.tracker;

/**
 * Класс {@code FindAllAction} реализует действие отображения всех заявок.
 *
 * <p>Реализует интерфейс {@link UserAction}, предоставляя возможность
 * вывести список всех сохраненных заявок из {@link Tracker} в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UserAction action = new FindAllAction();
 * action.execute(new ConsoleInput(), tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод всех заявок ===
 * Item{id=1, name='Fix PC', created=...}
 * Item{id=2, name='Fix bug', created=...}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see UserAction
 */
public class FindAllAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Показать все заявки".
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
     * @param input   Интерфейс получения пользовательского ввода (не используется).
     * @param tracker Хранилище заявок.
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