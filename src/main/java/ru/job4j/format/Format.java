package ru.job4j.format;

import java.util.Calendar;

/**
 * Класс {@code Format} демонстрирует форматированный вывод строк
 * с использованием метода {@code String.format}.
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Форматирование строк, чисел, дат и времени.</li>
 *     <li>Вывод данных с заданным шаблоном в консоль.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * getGreeting("Максим", 37);
 * getBooleanExample(55);
 * getCharExample('b');
 * getMultilineText("Строка1", "Строка2");
 * getGreetingAndTime("Максим");
 * getFormattedDecimal(0.99);
 * getFormattedBigDecimal(5000000.0000);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Привет! Я Максим, мой возраст: 37
 * Аргумент передан? true
 * Job4j
 * Строка1
 * Строка2
 * Привет, Максим! Текущая дата: 2025-04-23, Текущее время: 12:22:29
 * Задаем число 0.99 - 0,99
 * +00005,000,000.00
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Format {

    /**
     * Демонстрирует использование спецификаторов {@code %s}
     * и {@code %d} для форматированного вывода строки.
     *
     * <p>Спецификатор {@code %s} используется для вставки строкового значения (имени),<br>
     * а {@code %d} — для вывода целого числа (возраста).</p>
     *
     * @param name имя пользователя
     * @param age  возраст пользователя
     */
    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
    }

    /**
     * Демонстрирует использование спецификатора {@code %b} для отображения булевского значения.
     *
     * @param value объект, который будет интерпретирован как булевское значение
     */
    public static void getBooleanExample(Object value) {
        System.out.println(String.format("Аргумент передан? %b", value));
    }

    /**
     * Демонстрирует использование спецификатора {@code %c} для подстановки символа в строку.
     *
     * @param symbol символ, который будет вставлен в строку
     */
    public static void getCharExample(char symbol) {
        System.out.println(String.format("Jo%c4j", symbol));
    }

    /**
     * Демонстрирует использование спецификатора {@code %n} для вывода строк с переносом.
     *
     * @param line1 первая строка
     * @param line2 вторая строка
     */
    public static void getMultilineText(String line1, String line2) {
        System.out.format("%s%n%s%n", line1, line2);
    }

    /**
     * Демонстрирует использование спецификаторов {@code %tF} и {@code %tT}
     * для форматирования текущей даты и времени.
     *
     * @param name имя пользователя
     */
    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format(
                "Привет, %s! Текущая дата: %tF, Текущее время: %tT",
                name,
                instance,
                instance
        ));
    }

    /**
     * Демонстрирует использование спецификатора {@code %.2f} для вывода числа
     * с двумя знаками после запятой.
     *
     * @param value вещественное число, которое будет отформатировано
     */
    public static void getFormattedDecimal(double value) {
        System.out.println(String.format("Задаем число 0.99 - %.2f", value));
    }

    /**
     * Демонстрирует использование спецификатора {@code %,+016.2f} для форматирования
     * большого числа с:
     * <ul>
     *     <li>Знаком {@code +}.</li>
     *     <li>Разделителями тысяч {@code ,}.</li>
     *     <li>Шириной 16 символов с ведущими нулями {@code 0}.</li>
     *     <li>Двумя знаками после запятой {@code .2f}.</li>
     * </ul>
     *
     * @param value вещественное число, которое будет отформатировано
     */
    public static void getFormattedBigDecimal(double value) {
        System.out.println(String.format("%1$,+016.2f", value));
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        getGreeting("Максим", 37);
        getBooleanExample(55);
        getCharExample('b');
        getMultilineText("Строка1", "Строка2");
        getGreetingAndTime("Максим");
        getFormattedDecimal(0.99);
        getFormattedBigDecimal(5000000.0000);
    }
}
