package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code UsagePackageDate} демонстрирует использование класса {@link java.time.LocalDateTime}
 * и форматирование даты/времени с помощью {@link java.time.format.DateTimeFormatter}.
 *
 * <p>В примере выводятся текущие дата и время до и после форматирования.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * LocalDateTime currentDateTime = LocalDateTime.now();
 * System.out.println("Текущие дата и время до форматирования: " + currentDateTime);
 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
 * String currentDateTimeFormat = currentDateTime.format(formatter);
 * System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Текущие дата и время до форматирования: 2025-04-17T13:30:30.123
 * Текущие дата и время после форматирования: 17-04-2025 13:30:30
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UsagePackageDate {

    /**
     * Точка входа в программу.
     *
     * <p>Выводит текущие дату и время в исходном виде и отформатированные по шаблону
     * {@code dd-MM-yyyy HH:mm:ss}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования: " + currentDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
