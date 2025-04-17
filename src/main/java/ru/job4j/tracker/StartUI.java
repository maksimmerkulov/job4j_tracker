package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code StartUI} демонстрирует создание объекта {@link Item}
 * и вывод отформатированной даты его создания.
 * <p>
 * Используется шаблон форматирования {@code "dd-MMMM-EEEE-yyyy HH:mm:ss"}.
 * </p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     Дата создания: 17-апреля-четверг-2025 15:10:42
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class StartUI {

    /**
     * Метод {@code main(String[] args)} создает объект {@link Item}, извлекает дату его создания
     * и выводит ее в отформатированном виде.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime currentDateTime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Дата создания: " + currentDateTimeFormat);
    }
}
