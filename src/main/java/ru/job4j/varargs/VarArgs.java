package ru.job4j.varargs;

/**
 * Класс {@code VarArgs} демонстрирует использование аргументов переменной длины (varargs).
 *
 * <p>Используется для объединения строковых аргументов в одну строку с помощью {@link StringBuilder}
 * и демонстрирует перегрузку методов с varargs.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * System.out.println(text());
 * System.out.println(text("aaa"));
 * System.out.println(text("aaa", "bbb", "ccc"));
 * System.out.println(text(30, "aaa", "bbb"));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *
 * aaa
 * aaabbbccc
 * 30aaabbb
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class VarArgs {

    /**
     * Объединяет переданные строковые аргументы в одну строку без разделителей.
     *
     * <p>Если аргументы не переданы, возвращается пустая строка.</p>
     *
     * @param strings Аргументы переменной длины, которые нужно объединить.
     * @return Строка, полученная объединением всех переданных аргументов.
     */
    public static String text(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    /**
     * Возвращает переданную строку без изменений.
     *
     * <p>Этот метод демонстрирует перегрузку: он отличается от метода
     * {@link #text(String...)} тем, что принимает ровно один аргумент, а не varargs.</p>
     *
     * @param string Строка, которую нужно вернуть.
     * @return Та же строка, которая была передана в качестве аргумента.
     */
    public static String text(String string) {
        return string;
    }

    /**
     * Объединяет целое число с переданными строковыми аргументами в одну строку.
     *
     * <p>Целое число добавляется в начало результирующей строки, после чего
     * следуют все строки из массива аргументов.</p>
     *
     * @param x Целое число, добавляемое в начало строки.
     * @param strings Аргументы переменной длины, которые будут добавлены после числа.
     * @return Строка, полученная объединением числа и строк.
     */
    public static String text(int x, String... strings) {
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    /**
     * Точка входа в программу.
     *
     * <p>Выводит на экран результат вызова методов с различными наборами аргументов.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        System.out.println(text());
        System.out.println(text("aaa"));
        System.out.println(text("aaa", "bbb", "ccc"));
        System.out.println(text(30, "aaa", "bbb"));
    }
}