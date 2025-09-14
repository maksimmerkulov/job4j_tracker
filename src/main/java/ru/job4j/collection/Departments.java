package ru.job4j.collection;

import java.util.*;

/**
 * Класс {@code Departments} представляет собой утилиту для работы
 * со структурой подразделений организации.
 *
 * <p>Используется для дополнения списка недостающими кодами подразделений
 * и сортировки их в порядке возрастания или убывания с сохранением иерархии.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<String> input = Arrays.asList(
 *         "K1/SK1/SSK1",
 *         "K1/SK1/SSK2",
 *         "K2/SK1/SSK1"
 * );
 *
 * List<String> filled = Departments.fillGaps(input);
 * Departments.sortAsc(filled);
 * System.out.println(filled);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [K1, K1/SK1, K1/SK1/SSK1, K1/SK1/SSK2, K2, K2/SK1, K2/SK1/SSK1]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Departments {

    /**
     * Дополняет список подразделений недостающими кодами.
     *
     * @param departments исходный список подразделений
     * @return список со всеми уровнями подразделений
     */
    public static List<String> fillGaps(List<String> departments) {
        Set<String> temp = new LinkedHashSet<>();
        for (String value : departments) {
            String start = "";
            for (String element : value.split("/")) {
                if (start.isEmpty()) {
                    start = element;
                } else {
                    start = start + "/" + element;
                }
                temp.add(start);
            }
        }
        return new ArrayList<>(temp);
    }

    /**
     * Сортирует список подразделений по возрастанию.
     *
     * @param departments список подразделений
     */
    public static void sortAsc(List<String> departments) {
        departments.sort(Comparator.naturalOrder());
    }

    /**
     * Сортирует список подразделений по убыванию
     * с сохранением иерархии.
     *
     * @param departments список подразделений
     */
    public static void sortDesc(List<String> departments) {
        departments.sort(new DepartmentsDescComparator());
    }
}
