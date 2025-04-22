package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Класс {@code DropArray} демонстрирует удаление {@code null}-элементов из массива строк.
 *
 * <p>Создает новый массив без {@code null} и выводит его элементы в консоль.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Petr
 * Ivan
 * Stepan
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-22
 */
public class DropArray {

    /**
     * Метод {@code main(String[] args)} демонстрирует работу фильтрации {@code null}-значений из массива строк.
     *
     * <p>В исходном массиве содержатся как строки, так и {@code null}-значения.
     * В результате создается новый массив без {@code null}, и его содержимое выводится построчно.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] result = new String[names.length];
        int size = 0;
        for (int index = 0; index < names.length; index++) {
            String name = names[index];
            if (name != null) {
                result[size] = name;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}