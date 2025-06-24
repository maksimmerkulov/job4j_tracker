package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Класс {@code Tracker} представляет собой хранилище для заявок {@link Item}.
 *
 * <p>Позволяет добавлять заявки, искать их по имени и идентификатору, а также получать
 * список всех добавленных заявок.</p>
 *
 * <p><b>Ограничение:</b> максимальная вместимость — 100 заявок.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Tracker tracker = new Tracker();
 * Item item = new Item("Bug");
 * tracker.add(item);
 * Item[] all = tracker.findAll();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Bug
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Tracker {

    /**
     * Массив для хранения всех заявок.
     *
     * <p>Максимальная вместимость — 100 элементов.
     * Заявки размещаются в порядке добавления.</p>
     */
    private final Item[] items = new Item[100];

    /**
     * Счетчик для генерации уникальных идентификаторов.
     *
     * <p>Начинается с 1 и увеличивается при каждом добавлении новой заявки.</p>
     */
    private int ids = 1;

    /**
     * Текущее количество заявок в хранилище.
     *
     * <p>Используется для определения фактического размера массива {@code items} при поиске и добавлении.</p>
     */
    private int size = 0;

    /**
     * Добавляет новую заявку в хранилище.
     *
     * <p>Присваивает заявке уникальный идентификатор {@code id} и увеличивает счетчик {@code ids}.</p>
     *
     * @param item Объект {@link Item}, который необходимо добавить в хранилище.
     * @return Объект {@link Item} с присвоенным {@code id}.
     */
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /**
     * Возвращает массив всех добавленных заявок.
     *
     * <p>Массив не содержит {@code null}-значений и имеет длину,
     * равную количеству добавленных заявок.</p>
     *
     * @return Массив всех заявок в порядке добавления.
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    /**
     * Возвращает массив заявок с указанным именем.
     *
     * <p>Поиск выполняется с использованием метода {@link String#equals(Object)}
     * для сравнения имени каждой заявки с заданным ключом.</p>
     *
     * @param key Имя, по которому осуществляется поиск заявок.
     * @return Массив заявок, имя которых совпадает с {@code key}.
     * Если заявок с таким именем нет, возвращается пустой массив.
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getName().equals(key)) {
                result[count] = item;
                count++;
            }
        }
        return Arrays.copyOf(result, count);
    }

    /**
     * Выполняет поиск заявки в массиве {@code items} по уникальному идентификатору {@code id}.
     *
     * <p>Если заявка с указанным идентификатором найдена, возвращается соответствующий объект {@link Item}.
     * В противном случае возвращается {@code null}.</p>
     *
     * @param id Уникальный идентификатор заявки, по которому осуществляется поиск.
     * @return Объект {@link Item}, если заявка с указанным {@code id} найдена, иначе {@code null}.
     */
    public Item findById(int id) {
        Item result = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                result = item;
                break;
            }
        }
        return result;
    }
}