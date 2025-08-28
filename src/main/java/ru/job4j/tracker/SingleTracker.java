package ru.job4j.tracker;

import java.util.List;

/**
 * Класс {@code SingleTracker} реализует шаблон проектирования <b>Одиночка (Singleton)</b>.
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
 * @version 1.2
 */
public class SingleTracker {

    /**
     * Единственный экземпляр класса.
     */
    private static SingleTracker instance = null;

    /**
     * Внутренний объект {@link Tracker}, которому делегируются все действия.
     */
    private Tracker tracker = new Tracker();

    /**
     * Приватный конструктор. Запрещает создание объекта извне.
     */
    private SingleTracker() {
    }

    /**
     * Возвращает единственный экземпляр {@link SingleTracker}.
     *
     * @return объект {@link SingleTracker}
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
     * @param item добавляемая заявка
     * @return добавленная заявка
     */
    public Item add(Item item) {
        return tracker.add(item);
    }

    /**
     * Возвращает все заявки.
     *
     * @return список всех заявок
     */
    public List<Item> findAll() {
        return tracker.findAll();
    }

    /**
     * Заменяет заявку по идентификатору.
     *
     * @param id идентификатор заявки
     * @param item новая заявка
     * @return {@code true}, если замена успешна; иначе {@code false}
     */
    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    /**
     * Удаляет заявку по идентификатору.
     *
     * @param id идентификатор заявки
     */
    public void delete(int id) {
        tracker.delete(id);
    }

    /**
     * Находит заявку по идентификатору.
     *
     * @param id идентификатор заявки
     * @return найденная заявка;
     *         {@code null}, если не найдена
     */
    public Item findById(int id) {
        return tracker.findById(id);
    }

    /**
     * Находит заявки по имени.
     *
     * @param key имя заявки
     * @return список найденных заявок
     */
    public List<Item> findByName(String key) {
        return tracker.findByName(key);
    }
}
