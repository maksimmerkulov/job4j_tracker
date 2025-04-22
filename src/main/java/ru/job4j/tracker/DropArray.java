package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Класс {@code DropArray} демонстрирует использование метода {@link System#arraycopy(Object, int, Object, int, int)}
 * для перемещения элементов массива с учетом пропуска {@code null} значений.
 *
 * <p>Пример работы:
 * <ul>
 *     <li>Исходный массив содержит элементы: {"Petr", null, "Ivan", "Stepan", "Fedor"}.</li>
 *     <li>С помощью {@code System.arraycopy} элементы массива с индексами от 2 до 4 копируются
 *     на позиции с индексом 1.</li>
 *     <li>После выполнения операции массив изменяется, и {@code null} значение перемещается,
 *     при этом сохраняются только непустые элементы.</li>
 * </ul>
 * </p>
 *
 * <p>Результат: массив после копирования выглядит как: {"Petr", "Ivan", "Stepan", "Fedor", null}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-04-22
 */
public class DropArray {

    /**
     * Метод {@code main(String[] args)} выполняет демонстрацию работы с массивами.
     *
     * <p>Он создает массив строк, выполняет операцию копирования с помощью {@code System.arraycopy},
     * затем выводит результат в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
}