package ru.job4j.concat;

/**
 * Класс {@code ConcatExample} демонстрирует использование метода {@link String#concat(String)}
 * для объединения строк.
 *
 * <p>Метод {@code concat()} объединяет текущую строку с указанной строкой и возвращает новую строку.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String result = "abc".concat("def").concat("ghi").concat("jkl");
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * abcdefghijkl
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
 */
public class ConcatExample {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Создает строку путем последовательного объединения строк с помощью метода
     * {@link String#concat(String)} и выводит результат в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String string = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string);
    }
}