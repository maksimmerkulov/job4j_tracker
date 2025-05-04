package ru.job4j.tracker;

/**
 * Класс {@code FindByIdAction} реализует поиск и отображение заявки по идентификатору.
 *
 * <p>Используется в системе трекинга заявок {@link Tracker} для вывода информации
 * о конкретной заявке по заданному пользователем {@code id}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * Tracker tracker = new Tracker();
 * UserAction action = new FindByIdAction();
 * action.execute(input, tracker);
 * }</pre>
 *
 * <p><b>Пример вывода (если заявка найдена):</b></p>
 * <pre>{@code
 * === Вывод заявки по id ===
 * Введите id: 1
 * Item{id=1, name='Test Item'}
 * }</pre>
 *
 * <p><b>Пример вывода (если не найдена):</b></p>
 * <pre>{@code
 * === Вывод заявки по id ===
 * Введите id: 42
 * Заявка с введенным id: 42 не найдена.
 * }</pre>
 *
 * @author Maksим Merkulоv
 * @version 1.0
 */
public class FindByIdAction implements UserAction {

    /**
     * Возвращает название действия, отображаемое в пользовательском меню.
     *
     * @return строковое представление действия.
     */
    @Override
    public String name() {
        return "Показать заявку по id";
    }

    /**
     * Выполняет поиск заявки по идентификатору и выводит результат.
     *
     * <p>Если заявка найдена — отображает ее, иначе сообщает о ее отсутствии.</p>
     *
     * @param input   интерфейс получения пользовательского ввода.
     * @param tracker хранилище заявок.
     * @return {@code true}, если выполнение программы должно продолжаться; иначе {@code false}.
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Вывод заявки по id ===");
        int id = input.askInt("Введите id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}