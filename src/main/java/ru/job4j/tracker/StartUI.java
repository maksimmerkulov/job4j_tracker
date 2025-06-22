package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code StartUI} демонстрирует получение и форматирование
 * даты создания объекта {@link Item}.
 *
 * <p>В методе {@link #main(String[])} создается объект {@code Item},
 * затем извлекается дата его создания и форматируется по шаблону
 * {@code dd-MMMM-EEEE-yyyy HH:mm:ss}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Item item = new Item();
 * LocalDateTime currentDateTime = item.getCreated();
 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
 * String currentDateTimeFormat = currentDateTime.format(formatter);
 * System.out.println(currentDateTimeFormat);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 17-April-Thursday-2025 13:50:00
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StartUI {

    /**
     * Точка входа в приложение.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime currentDateTime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println(currentDateTimeFormat);
    }
}