package ru.job4j.tracker;

import java.util.Arrays;

/**
 * Класс {@code DropArray} демонстрирует удаление {@code null}-элементов из массива строк.
 *
 * <p>Может использоваться для очистки данных, где возможны пропущенные значения.</p>
 *
 * <p>Массив {@code result} заполняется только непустыми значениями из исходного массива
 * и затем обрезается до фактического количества элементов методом {@link Arrays#copyOf(Object[], int)}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] names = {"Petr", null, "Ivan", "Stepan", null};
 * String[] result = new String[names.length];
 * int size = 0;
 * for (int index = 0; index < names.length; index++) {
 *     String name = names[index];
 *     if (name != null) {
 *         result[size] = name;
 *         size++;
 *     }
 * }
 *
 * result = Arrays.copyOf(result, size);
 * for (int index = 0; index < result.length; index++) {
 *     System.out.println(result[index]);
 * }
 * }</pre>
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
 */
public class DropArray {

    /**
     * Точка входа в программу.
     *
     * <p>Фильтрует {@code null}-значения из массива {@code names}
     * и выводит результат на консоль.</p>
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