package ru.job4j.tracker;

import java.time.LocalTime;

/**
 * Класс {@code UsagePackageTime} демонстрирует работу с классом {@link LocalTime} из пакета {@code java.time}.
 *
 * <p>Выводит текущее время в формате {@code HH:mm:ss.SSS} в стандартный поток вывода.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UsagePackageTime.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Текущее время: 14:23:45.123
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UsagePackageTime {

    /**
     * Выводит текущее время с использованием класса {@link LocalTime}.
     *
     * <p>Получает текущее время с помощью {@link LocalTime#now()} и печатает его в консоль.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);
    }
}