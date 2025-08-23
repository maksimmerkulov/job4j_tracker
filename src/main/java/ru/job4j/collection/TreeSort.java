package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс {@code TreeSort} демонстрирует использование {@link TreeSet}
 * с обратным порядком сортировки элементов.
 *
 * <p>Элементы добавляются в множество, после чего они автоматически
 * сортируются в порядке убывания благодаря {@link Collections#reverseOrder()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
 * numbers.add(5);
 * numbers.add(1);
 * numbers.add(3);
 * System.out.println(numbers);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [5, 3, 1]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TreeSort {
    /**
     * Точка входа в программу.
     *
     * <p>Создает множество {@link TreeSet} с обратным компаратором,
     * добавляет в него несколько чисел и выводит отсортированный результат.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
    }
}
