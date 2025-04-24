package ru.job4j.concat;

import java.util.StringJoiner;

/**
 * Класс {@code StringJoinerExample} демонстрирует использование класса {@link StringJoiner}
 * для объединения строк с заданным разделителем, префиксом и суффиксом.
 *
 * <p>Класс {@link StringJoiner} позволяет создавать строку из нескольких элементов, добавляя
 * между ними разделитель, а также оборачивая результат в заданные префикс и суффикс.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
 * stringJoiner.add("abc").add("def").add("ghi");
 * System.out.println(stringJoiner);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [abc, def, ghi]
 * [abc, def, ghi]
 * }</pre>
 *
 * @author Maksим Merkulов
 * @version 1.0
 * @since 2025-04-24
 */
public class StringJoinerExample {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Создает объект {@link StringJoiner} с разделителем <code>", "</code>,
     * префиксом <code>"["</code> и суффиксом <code>"]"</code>, добавляет в него строки и выводит результат.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ", "[", "]");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}