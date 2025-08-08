package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@code Tracker} представляет собой хранилище для заявок {@link Item}.
 *
 * <p>Используется для добавления, поиска, замены, удаления и хранения заявок
 * по имени и идентификатору.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Tracker tracker = new Tracker();
 * tracker.add(new Item("Test"));
 * List<Item> all = tracker.findAll();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Item{id=1, name='Test', created=08-августа-пятница-2025 12:48:15}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.5
 */
public class Tracker {

    /**
     * Список для хранения заявок.
     *
     * <p>Заявки размещаются в порядке добавления.</p>
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Счетчик для генерации уникальных идентификаторов.
     *
     * <p>Начинается с 1 и увеличивается при каждом добавлении новой заявки.</p>
     */
    private int ids = 1;

    /**
     * Добавляет новую заявку в хранилище.
     *
     * <p>Присваивает заявке уникальный идентификатор {@code id}
     * и увеличивает счетчик {@code ids}.</p>
     *
     * @param item Объект {@link Item}, который необходимо добавить в хранилище.
     * @return Объект {@link Item} с присвоенным {@code id}.
     */
    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    /**
     * Возвращает список всех добавленных заявок.
     *
     * @return Список всех заявок в порядке добавления.
     */
    public List<Item> findAll() {
        return new ArrayList<>(items);
    }

    /**
     * Возвращает список заявок с указанным именем.
     *
     * <p>Поиск выполняется с использованием метода {@link String#equals(Object)}
     * для сравнения имени каждой заявки с заданным ключом.</p>
     *
     * @param key Имя, по которому осуществляется поиск заявок.
     * @return Список заявок, имя которых совпадает с {@code key}.
     * Если заявок с таким именем нет, возвращается пустой список.
     */
    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Выполняет поиск заявки в списке {@code items} по уникальному идентификатору {@code id}.
     *
     * <p>Если заявка с указанным идентификатором найдена, возвращается соответствующий объект {@link Item}.
     * В противном случае возвращается {@code null}.</p>
     *
     * @param id Уникальный идентификатор заявки, по которому осуществляется поиск.
     * @return Объект {@link Item}, если заявка с указанным {@code id} найдена, иначе {@code null}.
     */
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Заменяет заявку с указанным {@code id} на новую.
     *
     * <p>Если заявка с данным идентификатором найдена, то:</p>
     * <ul>
     *     <li>Новому объекту {@code item} присваивается тот же {@code id}, что и у заменяемой заявки.</li>
     *     <li>Существующая заявка заменяется на новую в списке {@code items}.</li>
     * </ul>
     *
     * <p>Если заявка с указанным {@code id} не найдена, операция не выполняется.</p>
     *
     * @param id   Уникальный идентификатор заявки, которую необходимо заменить.
     * @param item Новый объект {@link Item}, который подставляется вместо существующей заявки.
     * @return {@code true}, если заявка найдена и замена выполнена;
     *         {@code false}, если заявка не найдена.
     */
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.set(index, item);
        }
        return result;
    }

    /**
     * Удаляет заявку по заданному {@code id}.
     *
     * @param id Уникальный идентификатор заявки, которую необходимо удалить.
     */
    public void delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            items.remove(index);
        }
    }

    /**
     * Выполняет поиск заявки с заданным идентификатором в списке
     * и возвращает индекс найденного элемента.
     *
     * @param id Уникальный идентификатор заявки, по которому выполняется поиск.
     * @return Индекс найденной заявки в списке {@code items}.
     * Если заявка не найдена, возвращается {@code -1}.
     */
    private int indexOf(int id) {
        int result = -1;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                result = i;
                break;
            }
        }
        return result;
    }
}
