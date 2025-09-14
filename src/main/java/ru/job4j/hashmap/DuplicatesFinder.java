package ru.job4j.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс {@code DuplicatesFinder} предоставляет метод для поиска
 * дублирующихся элементов в массиве чисел.
 *
 * <p>Метод {@link #findDuplicates(int[])} используется для получения массива,
 * содержащего все элементы, которые встречаются более одного раза во входном массиве.
 * Каждый элемент в возвращаемом массиве уникален.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] input = {1, 2, 3, 2, 1};
 * int[] duplicates = DuplicatesFinder.findDuplicates(input);
 * for (int num : duplicates) {
 *     System.out.print(num + " ");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 1 2
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DuplicatesFinder {

    /**
     * Возвращает массив чисел, которые встречаются более одного раза.
     *
     * @param input входной массив чисел
     * @return массив дубликатов (без повторов)
     */
    public static int[] findDuplicates(int[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : input) {
            Integer count = map.get(num);
            if (count == null) {
                map.put(num, 1);
            } else {
                map.put(num, count + 1);
            }
        }

        List<Integer> duplicates = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) > 1) {
                duplicates.add(key);
            }
        }

        int[] result = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            result[i] = duplicates.get(i);
        }

        return result;
    }
}
