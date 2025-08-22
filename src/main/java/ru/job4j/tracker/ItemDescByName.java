package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Класс {@code ItemDescByName} реализует интерфейс {@link Comparator}
 * для сравнения объектов {@link Item} по имени в порядке убывания.
 *
 * <p>Используется для сортировки списка заявок по имени, в порядке убывания.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Item> items = Arrays.asList(
 *     new Item("Fix bugs"),
 *     new Item("Impl task"),
 *     new Item("Reboot server")
 * );
 * System.out.println(items);
 * Collections.sort(items, new ItemDescByName());
 * System.out.println(items);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Fix bugs, Impl task, Reboot server]
 * [Reboot server, Impl task, Fix bugs]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ItemDescByName implements Comparator<Item> {

    /**
     * Сравнивает два объекта {@link Item} по имени в порядке убывания.
     *
     * @param left  первый объект {@link Item} для сравнения
     * @param right второй объект {@link Item} для сравнения
     * @return отрицательное число, если {@code right.name < left.name};
     *         0, если {@code right.name == left.name};
     *         положительное число, если {@code right.name > left.name}
     */
    @Override
    public int compare(Item left, Item right) {
        return right.getName().compareTo(left.getName());
    }
}
