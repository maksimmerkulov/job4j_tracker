package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс {@code ConvertList} преобразует список массивов в единый список значений.
 *
 * <p>Используется для линейного представления данных, содержащихся в {@code List<int[]>},
 * где каждый элемент — это массив целых чисел.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<int[]> input = List.of(
 *     new int[]{1, 2},
 *     new int[]{3, 4, 5}
 * );
 * List<Integer> result = ConvertList.convert(input);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [1, 2, 3, 4, 5]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ConvertList {

    /**
     * Преобразует список массивов в список значений.
     *
     * <p>Проходит по каждому массиву в списке и добавляет его элементы
     * в результирующий список {@code List<Integer>}.</p>
     *
     * <p><b>Примечание:</b> Используется при необходимости линейного доступа к элементам,
     * изначально представленным в виде набора массивов.</p>
     *
     * @param list список массивов типа {@code int[]}
     * @return список целых чисел, содержащий все значения из массивов
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] row : list) {
            for (int cell : row) {
                result.add(cell);
            }
        }
        return result;
    }
}
