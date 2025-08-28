package ru.job4j.concat;

/**
 * Класс {@code ConcatExample} демонстрирует использование метода
 * {@link String#concat(String)} для объединения строк.
 *
 * <p>Метод {@link String#concat(String)} объединяет текущую строку
 * с указанной строкой и возвращает новую строку.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String string = "abc".concat("def").concat("ghi").concat("jkl");
 * System.out.println(string);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * abcdefghijkl
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ConcatExample {

    /**
     * Точка входа в программу.
     *
     * <p>Создает строку путем последовательного объединения строк с помощью метода
     * {@link String#concat(String)} и выводит результат в консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String string = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(string);
    }
}
