package ru.job4j.tracker;

/**
 * Класс {@code CreateAction} реализует действие по добавлению новой заявки в хранилище.
 *
 * <p>Реализует интерфейс {@link UserAction}, обеспечивая возможность взаимодействия
 * с пользователем для ввода имени заявки и добавления ее в {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new CreateAction();
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * === Создание новой заявки ===
 * Введите имя: test
 * Добавленная заявка: Item{id=1, name='test', created=...}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see UserAction
 */
public class CreateAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return Строка "Добавить новую заявку".
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
     * @param input   Интерфейс получения пользовательского ввода.
     * @param tracker Хранилище заявок.
     * @return {@code true}, чтобы продолжить выполнение программы.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Создание новой заявки ===");
        String name = input.askStr("Введите имя: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
        return true;
    }
}