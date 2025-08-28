package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Класс {@code ListSort} демонстрирует сортировку списка целых чисел.
 *
 * <p>Создается список чисел, выводится на экран в исходном порядке,
 * затем сортируется с помощью {@link Collections#sort(List)} и выводится снова.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
 * System.out.println(list);
 * Collections.sort(list);
 * System.out.println(list);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [5, 3, 4, 1, 2]
 * [1, 2, 3, 4, 5]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ListSort {

    /**
     * Точка входа в программу.
     *
     * <p>Создает список целых чисел, выводит его до сортировки и после сортировки.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
