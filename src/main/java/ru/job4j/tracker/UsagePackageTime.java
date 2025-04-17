package ru.job4j.tracker;

import java.time.LocalTime;

/**
 * Класс {@code UsagePackageTime} демонстрирует работу с классом {@link LocalTime} из пакета {@code java.time}.
 * <p>
 * В методе {@link #main(String[])} выводится текущее время в формате {@code HH:mm:ss.SSS}.
 * </p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     Текущее время: 14:23:45.123
 * }</pre>
 *
 * @autor Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class UsagePackageTime {

    /**
     * Метод {@code main(String[] args)} выводит текущее время с использованием класса {@link LocalTime}.
     * <p>
     * Получает текущее время с помощью {@code LocalTime.now()} и печатает его в консоль.
     * </p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);
    }
}