package ru.job4j.tracker;

/**
 * Класс {@code FindByNameAction} реализует действие поиска заявок по имени.
 *
 * <p>Реализует интерфейс {@link UserAction} и позволяет пользователю ввести строку имени,
 * по которой осуществляется поиск всех заявок в {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UserAction action = new FindByNameAction();
 * action.execute(new ConsoleInput(), tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Вывод заявок по имени ===
 * Введите имя: Test
 * Item{id=1, name='Test', created=...}
 * Item{id=3, name='Test', created=...}
 *
 * === Вывод заявок по имени ===
 * Введите имя: Bug
 * Заявки с именем: Bug не найдены.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see UserAction
 */
public class FindByNameAction implements UserAction {

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
        System.out.println("=== Вывод заявок по имени ===");
        String name = input.askStr("Введите имя: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Заявки с именем: " + name + " не найдены.");
        }
        return true;
    }
}