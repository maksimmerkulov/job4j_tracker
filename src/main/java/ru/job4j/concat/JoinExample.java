package ru.job4j.concat;

/**
 * Класс {@code JoinExample} демонстрирует использование метода
 * {@link String#join(CharSequence, CharSequence...)}
 * для объединения нескольких строк с разделителем.
 *
 * <p>Метод {@link String#join(CharSequence, CharSequence...)} объединяет
 * указанные строки, вставляя между ними заданный разделитель.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String string = String.join(" ", "abc", "def", "ghi");
 * System.out.println(string);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * abc def ghi
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class JoinExample {

    /**
     * Точка входа в программу.
     *
     * <p>Создает строку путем объединения нескольких строк с пробелом в качестве разделителя
     * с использованием метода {@link String#join(CharSequence, CharSequence...)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String string = String.join(" ", "abc", "def", "ghi");
        System.out.println(string);
    }
}
