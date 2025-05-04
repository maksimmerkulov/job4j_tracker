package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Класс {@code DropArray} представляет собой демонстрацию перемещения
 * элементов массива с учетом пропусков {@code null} значений.
 *
 * <p>Используется для демонстрации использования метода {@link System#arraycopy(Object, int, Object, int, int)}
 * для перемещения элементов в массиве с пропуском {@code null} значений.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * DropArray instance = new DropArray();
 * instance.moveElements();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [Petr, Ivan, Stepan, Fedor, null]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class DropArray {

    /**
     * Выполняет демонстрацию работы с массивами.
     *
     * <p>Создает массив строк, выполняет операцию копирования с помощью
     * {@link System#arraycopy(Object, int, Object, int, int)}, затем выводит результат в консоль.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor"};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
}