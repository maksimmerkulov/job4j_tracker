package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Класс {@code LambdaUsage} демонстрирует использование лямбда-выражений
 * для создания компаратора строк.
 *
 * <p>Строки сортируются по убыванию длины. При этом в консоль
 * выводится отладочная информация о сравнении длин строк.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<String> strings = Arrays.asList("eeeee", "a", "ccc", "dddd", "bb");
 * Comparator<String> comparator = (left, right) -> {
 *     System.out.println("compare - " + left.length() + " : " + right.length());
 *     return Integer.compare(right.length(), left.length());
 * };
 * strings.sort(comparator);
 * for (String string : strings) {
 *     System.out.println(string);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * compare - 5 : 1
 * compare - 3 : 1
 * compare - 3 : 5
 * compare - 4 : 3
 * compare - 4 : 5
 * compare - 2 : 3
 * compare - 2 : 4
 * eeeee
 * dddd
 * ccc
 * bb
 * a
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LambdaUsage {

    /**
     * Точка входа в программу.
     *
     * <p>Создает список строк, сортирует его с помощью
     * компаратора по убыванию длины и выводит результат.
     * При сортировке также печатается отладочная информация.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a",  "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("compare - " + left.length() + " : " + right.length());
            return Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
