package ru.job4j.tracker;

/**
 * Класс {@code SingleTracker} реализует шаблон Singleton.
 *
 * <p>Используется для создания единственного экземпляра трекера в приложении.
 * Все методы делегируют выполнение объекту класса {@link Tracker}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * SingleTracker tracker = SingleTracker.getInstance();
 * tracker.add(new Item("Test"));
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class SingleTracker {

    /**
     * Единственный экземпляр класса.
     */
    private static SingleTracker instance = null;

    /**
     * Внутренний объект {@link Tracker}, которому делегируются все действия.
     */
    private final Tracker tracker = new Tracker();

    /**
     * Приватный конструктор. Запрещает создание объекта извне.
     */
    private SingleTracker() {
    }

    /**
     * Возвращает единственный экземпляр {@code SingleTracker}.
     *
     * @return объект {@code SingleTracker}
     */
    public static SingleTracker getInstance() {
        if (instance == null) {
            instance = new SingleTracker();
        }
        return instance;
    }

    /**
     * Добавляет новую заявку.
     *
     * @param item добавляемая заявка.
     * @return добавленная заявка.
     */
    public Item add(Item item) {
        return tracker.add(item);
    }

    /**
     * Возвращает все заявки.
     *
     * @return массив всех заявок.
     */
    public Item[] findAll() {
        return tracker.findAll();
    }

    /**
     * Заменяет заявку по идентификатору.
     *
     * @param id идентификатор.
     * @param item новая заявка.
     * @return {@code true}, если замена успешна; иначе {@code false}.
     */
    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    /**
     * Удаляет заявку по идентификатору.
     *
     * @param id идентификатор заявки.
     */
    public void delete(int id) {
        tracker.delete(id);
    }

    /**
     * Находит заявку по идентификатору.
     *
     * @param id идентификатор.
     * @return найденная заявка или {@code null}, если не найдена.
     */
    public Item findById(int id) {
        return tracker.findById(id);
    }

    /**
     * Находит заявки по имени.
     *
     * @param key имя заявки.
     * @return массив найденных заявок.
     */
    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }
}