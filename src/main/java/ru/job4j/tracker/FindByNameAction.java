package ru.job4j.tracker;

/**
 * Класс {@code FindByNameAction} реализует поиск и отображение всех заявок с заданным именем.
 *
 * <p>Используется в системе трекинга заявок {@link Tracker} для вывода информации
 * обо всех заявках, у которых имя совпадает с введенным пользователем значением.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new FindByNameAction();
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода (если заявки найдены):</b></p>
 * <pre>{@code
 * === Вывод заявок по имени ===
 * Введите имя: test
 * Item{id=1, name='test'}
 * Item{id=2, name='test'}
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
 * @version 1.0
 */
public class FindByNameAction implements UserAction {

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