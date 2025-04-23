package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Класс {@code StartUI} демонстрирует создание объекта {@link Item}
 * и вывод отформатированной даты его создания.
 *
 * <p>В классе создается объект {@link Item}, и выводится его дата создания в отформатированном виде.
 * Формат вывода даты: {@code "dd-MMMM-EEEE-yyyy HH:mm:ss"}.</p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 *     Дата создания: 23-апреля-четверг-2025 15:10:42
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.1
 * @since 2025-04-23
 */
public class StartUI {

    /**
     * Метод {@code main(String[] args)} создает объект {@link Item}, извлекает дату его создания
     * и выводит эту дату в отформатированном виде.
     * Формат даты: {@code "dd-MMMM-EEEE-yyyy HH:mm:ss"}.
     *
     * <p><b>Пример использования:</b></p>
     * <pre>{@code
     *     Дата создания: 17-апреля-четверг-2025 15:10:42
     * }</pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime currentDateTime = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("Дата создания: " + currentDateTimeFormat);
        System.out.println(item);
    }
}