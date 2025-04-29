package ru.job4j.tracker;

/**
 * Интерфейс {@code Input} описывает поведение ввода данных от пользователя.
 *
 * <p>Используется для получения строк и целых чисел.</p>
 *
 * <p>Пример реализации: {@link MockInput}</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public interface Input {

    /**
     * Запрашивает строку у пользователя.
     *
     * @param question Сообщение для пользователя.
     * @return Введенная строка.
     */
    String askStr(String question);

    /**
     * Запрашивает целое число у пользователя.
     *
     * @param question Сообщение для пользователя.
     * @return Введенное целое число.
     */
    int askInt(String question);
}