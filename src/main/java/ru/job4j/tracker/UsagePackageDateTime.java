package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code UsagePackageDateTime} демонстрирует работу с классами {@link LocalDateTime}
 * и {@link DateTimeFormatter} из пакета {@code java.time}.
 *
 * <p>В методе {@link #main(String[])} отображаются текущие дата и время — сначала в стандартном формате,
 * затем в формате {@code "dd-MM-yyyy HH:mm:ss"}.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     Текущие дата и время до форматирования: 2025-04-17T14:35:20.123
 *     Текущие дата и время после форматирования: 17-04-2025 14:35:20
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UsagePackageDateTime {

    /**
     * Выводит текущие дату и время с использованием классов
     * {@link LocalDateTime} и {@link DateTimeFormatter}.
     *
     * <p>Сначала выводится значение без форматирования, затем — отформатированное в шаблоне
     * {@code "dd-MM-yyyy HH:mm:ss"}.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования: " + currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}