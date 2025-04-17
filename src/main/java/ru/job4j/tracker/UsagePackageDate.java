package ru.job4j.tracker;

import java.time.LocalDate;

/**
 * Класс {@code UsagePackageDate} демонстрирует работу с классом {@link LocalDate} из пакета {@code java.time}.
 * <p>
 * В методе {@link #main(String[])} выводится текущая дата в стандартном формате ISO (гггг-мм-дд).
 * </p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     Текущая дата: 2025-04-17
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class UsagePackageDate {

    /**
     * Метод {@code main(String[] args)} выводит текущую дату с использованием класса {@link LocalDate}.
     * <p>
     * Получает текущую дату с помощью {@code LocalDate.now()} и печатает ее в консоль.
     * </p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);
    }
}