package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс {@code DepartmentsDescComparator} реализует компаратор
 * для сортировки подразделений по убыванию с сохранением иерархии.
 *
 * <p>Алгоритм сортировки:</p>
 * <ul>
 *     <li>Сначала сравниваются корневые подразделения (например, {@code K1} и {@code K2})
 *         в порядке убывания.</li>
 *     <li>Если корневые подразделения совпадают, то сравнение продолжается
 *         по строкам целиком в порядке возрастания.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<String> deps = Arrays.asList(
 *     "K1/SK1",
 *     "K1/SK1/SSK1",
 *     "K2",
 *     "K2/SK1"
 * );
 * deps.sort(new DepartmentsDescComparator());
 * System.out.println(deps);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [K2, K2/SK1, K1, K1/SK1, K1/SK1/SSK1]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DepartmentsDescComparator implements Comparator<String> {

    /**
     * Сравнивает две строки кодов подразделений.
     *
     * <p>Корневые подразделения сравниваются по убыванию,
     * а вложенные — по возрастанию.</p>
     *
     * @param left  первая строка
     * @param right вторая строка
     * @return отрицательное число, если {@code left < right},
     *         положительное число, если {@code left > right},
     *         либо {@code 0}, если строки равны
     */
    @Override
    public int compare(String left, String right) {
        String[] leftArr = left.split("/");
        String[] rightArr = right.split("/");
        int rsl = rightArr[0].compareTo(leftArr[0]);
        if (rsl == 0) {
            return left.compareTo(right);
        }
        return rsl;
    }
}
