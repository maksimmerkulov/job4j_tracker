package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс {@code StringCompare} реализует компаратор
 * для сравнения строк в лексикографическом порядке
 * без использования метода {@link String#compareTo(String)}.
 *
 * <p>Сравнение выполняется поэлементно:
 * - если символы отличаются, возвращается результат их сравнения;
 * - если символы равны, сравнение продолжается;
 * - если одна строка является префиксом другой, то более короткая
 * строка считается "меньше".</p>
 *
 * <p>Используются методы {@link String#charAt(int)},
 * {@link Character#compare(char, char)} и {@link Integer#compare(int, int)}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Comparator<String> cmp = new StringCompare();
 * System.out.println(cmp.compare("Ivanov", "Ivanov"));
 * System.out.println(cmp.compare("Ivanov", "Ivanova"));
 * System.out.println(cmp.compare("Petrov", "Ivanova"));
 * System.out.println(cmp.compare("", "Ivanov"));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 0
 * -1
 * 1
 * -1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class StringCompare implements Comparator<String> {

    /**
     * Сравнивает две строки лексикографически без {@link String#compareTo(String)}.
     *
     * <p>Алгоритм: посимвольно сравнивает пары символов с нулевого индекса.
     * При первом различии возвращает результат {@link Character#compare(char, char)}.
     * Если все сравниваемые символы равны, возвращает результат
     * {@link Integer#compare(int, int)} по длинам строк.</p>
     *
     * @param left  левая строка для сравнения (не {@code null})
     * @param right правая строка для сравнения (не {@code null})
     * @return отрицательное число, если {@code left < right};
     *         ноль, если равны;
     *         положительное число, если {@code left > right}
     * @throws NullPointerException если любая из строк равна {@code null}
     */
    @Override
    public int compare(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            char lChar = left.charAt(i);
            char rChar = right.charAt(i);
            int result = Character.compare(lChar, rChar);
            if (result != 0) {
                return result;
            }
        }
        return Integer.compare(left.length(), right.length());
    }
}
