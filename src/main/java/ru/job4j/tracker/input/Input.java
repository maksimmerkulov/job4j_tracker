package ru.job4j.tracker.input;

/**
 * Интерфейс {@code Input} описывает поведение ввода данных от пользователя.
 *
 * <p>Используется для получения строк и целых чисел.</p>
 *
 * <p>Примеры реализаций: {@link MockInput}, {@link ConsoleInput}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public interface Input {

    /**
     * Запрашивает строку у пользователя.
     *
     * @param question сообщение для пользователя.
     * @return введенная строка.
     */
    String askStr(String question);

    /**
     * Запрашивает целое число у пользователя.
     *
     * @param question сообщение для пользователя.
     * @return введенное целое число.
     */
    int askInt(String question);
}