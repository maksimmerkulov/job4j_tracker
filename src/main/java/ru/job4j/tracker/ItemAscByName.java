package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Класс {@code ItemAscByName} реализует интерфейс {@link Comparator}
 * для сравнения объектов {@link Item} по имени в порядке возрастания.
 *
 * <p>Используется для сортировки списка заявок по имени, в порядке возрастания.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Item> items = Arrays.asList(
 *     new Item("Reboot server"),
 *     new Item("Impl task"),
 *     new Item("Fix bugs")
 * );
 * System.out.println(items);
 * Collections.sort(items, new ItemAscByName());
 * System.out.println(items);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Reboot server, Impl task, Fix bugs]
 * [Fix bugs, Impl task, Reboot server]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ItemAscByName implements Comparator<Item> {

    /**
     * Сравнивает два объекта {@link Item} по имени в порядке возрастания.
     *
     * @param left  первый объект {@link Item} для сравнения
     * @param right второй объект {@link Item} для сравнения
     * @return отрицательное число, если {@code left.name < right.name};
     *         0, если {@code left.name == right.name};
     *         положительное число, если {@code left.name > right.name}
     */
    @Override
    public int compare(Item left, Item right) {
        return left.getName().compareTo(right.getName());
    }
}
