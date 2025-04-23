package ru.job4j.format;

import java.util.Calendar;

/**
 * Класс {@code Format} демонстрирует форматированный вывод строк с использованием метода {@code String.format}.
 *
 * <p>Включает методы для приветствия с именем и возрастом, приветствия с текущей датой и временем,
 * а также вывода чисел с заданной точностью и с разделением тысяч.
 *
 * <p>Пример использования:
 * <pre>{@code
 * Format.getGreeting("Максим", 37);
 * Format.getGreetingAndTime("Максим");
 * Format.printFormattedDouble(0.99);
 * Format.printFormattedWithCommas(5000000.0000);
 * }</pre>
 *
 * <p>Пример вывода:
 * <pre>
 * Привет! Я Максим, мой возраст: 37
 * Привет, Максим! Текущая дата: 2025-04-23, Текущее время: 18:37:42
 * Задаем число 0.99 - 0.99
 * Задаем число с запятыми 5,000,000.00
 * </pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-23
 */
public class Format {

    /**
     * Метод {@code getGreeting(String name, int age)} выводит приветствие с указанием имени и возраста.
     *
     * @param name Имя пользователя.
     * @param age  Возраст пользователя.
     */
    public static void getGreeting(String name, int age) {
        System.out.println(String.format("Привет! Я %s, мой возраст: %d", name, age));
    }

    /**
     * Метод {@code getGreetingAndTime(String name)} выводит приветствие с текущей датой и временем.
     *
     * <p>Используется текущая системная дата и время.
     *
     * @param name Имя пользователя.
     */
    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.println(String.format("Привет, %s! Текущая дата: %tF, Текущее время: %tT",
                name, instance, instance));
    }

    /**
     * Метод {@code printFormattedDouble(double value)} выводит число с двумя знаками после запятой.
     *
     * @param value Число, которое нужно вывести в отформатированном виде.
     */
    public static void printFormattedDouble(double value) {
        System.out.println(String.format("Задаем число %.2f - %.2f", value, value));
    }

    /**
     * Метод {@code printFormattedWithCommas(double value)} выводит число с запятыми для разделения тысяч
     * и с двумя знаками после запятой.
     *
     * <p>Пример вывода:
     * <pre>{@code
     * Задаем число с запятыми 5,000,000.00
     * }</pre>
     *
     * @param value Число, которое нужно вывести в отформатированном виде.
     */
    public static void printFormattedWithCommas(double value) {
        System.out.println(String.format("%1$,+016.2f", value));
    }

    /**
     * Точка входа в программу.
     *
     * <p>Метод {@code main(String[] args)} демонстрирует работу методов
     * {@link #getGreeting(String, int)}, {@link #getGreetingAndTime(String)},
     * {@link #printFormattedDouble(double)} и {@link #printFormattedWithCommas(double)}.
     *
     * <p>Сначала выводит в консоль приветствие с именем и возрастом, затем — приветствие с текущей датой и временем,
     * после этого — число с фиксированной точностью, и в конце — число с разделением тысяч.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        getGreeting("Максим", 37);
        getGreetingAndTime("Максим");
        printFormattedDouble(0.99);
        printFormattedWithCommas(5000000.0000);
    }
}