package ru.job4j.escapechars;

/**
 * Класс {@code EscapeExample} демонстрирует работу с экранированием символов
 * и управляющими последовательностями в Java.
 *
 * <p>Используется для практики вывода специальных символов в строках,
 * а также изучения поведения управляющих последовательностей:
 * перевода строки, табуляции, возврата каретки и удаления символов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * EscapeExample.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Я изучаю на "Job4j" экранирование символов
 * "
 * '
 * Я изучаю на 'Job4j' экранирование символов
 * C:\projects\job4j\File.java
 * Новый текст
 * Первая строка
 * Вторая строкаБез отступа
 *     Один отступ
 *         Два отступа
 * Job4j
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
 */
public class EscapeExample {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Демонстрирует использование экранированных символов и управляющих
     * последовательностей в строках. Выводит на экран различные примеры работы с ними.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String string = "Я изучаю на \"Job4j\" экранирование символов";
        System.out.println(string);
        char escape = '\"';
        System.out.println(escape);
        System.out.println('\'');
        string = "Я изучаю на 'Job4j' экранирование символов";
        System.out.println(string);
        string = "C:\\projects\\job4j\\File.java";
        System.out.println(string);
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        System.out.print("Первая строка\nВторая строка");
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        System.out.println("Job4jjj\b\b");
    }
}