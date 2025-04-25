package ru.job4j.varargs;

/**
 * Класс {@code VarArgs} демонстрирует использование аргументов переменной длины (varargs).
 *
 * <p>Используется для объединения строковых аргументов в одну строку
 * с помощью {@link StringBuilder} и демонстрирует перегрузку методов с varargs.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * System.out.println(VarArgs.text("one", "two"));
 * System.out.println(VarArgs.text(10, "a", "b"));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * onetwo
 * 10ab
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-25
 */
public class VarArgs {

    /**
     * Метод {@code text(String... strings)} объединяет переданные
     * строковые аргументы в одну строку без разделителей.
     *
     * <p>Если аргументы не переданы, возвращается пустая строка.</p>
     *
     * <p><b>Пример использования:</b></p>
     * <pre>{@code
     * String result = VarArgs.text("hello", "world");
     * System.out.println(result);
     * }</pre>
     *
     * <p><b>Пример вывода:</b></p>
     * <pre>{@code
     * helloworld
     * }</pre>
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
     * Метод {@code text(int x, String... strings)} объединяет целое число
     * с переданными строковыми аргументами в одну строку.
     *
     * <p>Целое число добавляется в начало результирующей строки, после чего
     * следуют все строки из массива аргументов.</p>
     *
     * <p><b>Пример использования:</b></p>
     * <pre>{@code
     * String result = VarArgs.text(42, "a", "b");
     * System.out.println(result);
     * }</pre>
     *
     * <p><b>Пример вывода:</b></p>
     * <pre>{@code
     * 42ab
     * }</pre>
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
     * Метод {@code main(String[] args)} демонстрирует работу методов {@link #text(String...)}
     * и {@link #text(int, String...)}.
     *
     * <p>Выводит на экран результат вызова методов с различными наборами аргументов.</p>
     *
     * <p><b>Пример вывода:</b></p>
     * <pre>{@code
     * aaa
     * aaabbbccc
     * 30aaabbb
     * }</pre>
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