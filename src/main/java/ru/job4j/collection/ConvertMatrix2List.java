package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@code ConvertMatrix2List} преобразует двумерный массив в список {@link List}.
 *
 * <p>Используется для конвертации таблиц чисел (например, матриц) в линейную структуру данных.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * ConvertMatrix2List converter = new ConvertMatrix2List();
 * int[][] matrix = {
 *     {1, 2},
 *     {3, 4}
 * };
 * List<Integer> result = converter.toList(matrix);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [1, 2, 3, 4]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ConvertMatrix2List {

    /**
     * Преобразует двумерный массив в список целых чисел.
     *
     * <p>Элементы добавляются в список построчно, начиная с первой строки массива.</p>
     *
     * @apiNote Метод полезен при необходимости линейной обработки двумерных структур.
     * @param array Двумерный массив целых чисел.
     * @return Список, содержащий все элементы массива по порядку.
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
