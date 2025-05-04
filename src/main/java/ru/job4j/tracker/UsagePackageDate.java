package ru.job4j.tracker;

import java.time.LocalDate;

/**
 * Класс {@code UsagePackageDate} демонстрирует работу с классом {@link LocalDate} из пакета {@code java.time}.
 *
 * <p>Используется для вывода текущей даты в стандартном формате ISO (гггг-мм-дд) через консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * UsagePackageDate.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Текущая дата: 2025-04-17
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UsagePackageDate {

    /**
     * Выводит текущую дату с использованием класса {@link LocalDate}.
     *
     * <p>Получает текущую дату с помощью {@link LocalDate#now()} и печатает ее в консоль.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);
    }
}