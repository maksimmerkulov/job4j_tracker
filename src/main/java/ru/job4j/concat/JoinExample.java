package ru.job4j.concat;

/**
 * Класс {@code JoinExample} демонстрирует использование метода {@link String#join(CharSequence, CharSequence...)}
 * для объединения нескольких строк с разделителем.
 *
 * <p>Метод {@code join()} объединяет указанные строки, вставляя между ними заданный разделитель.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String result = String.join(" ", "abc", "def", "ghi");
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * abc def ghi
 * }</pre>
 *
 * @author Maksим Merkulов
 * @version 1.0
 * @since 2025-04-24
 */
public class JoinExample {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Создает строку путем объединения нескольких строк с пробелом в качестве разделителя
     * с использованием метода {@link String#join(CharSequence, CharSequence...)}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String string = String.join(" ", "abc", "def", "ghi");
        System.out.println(string);
    }
}