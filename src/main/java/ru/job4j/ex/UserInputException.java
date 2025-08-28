package ru.job4j.ex;

/**
 * Исключение {@code UserInputException} сигнализирует о некорректном пользовательском вводе.
 *
 * <p>Используется для обозначения ошибок, связанных с вводом данных,
 * например, {@code null}-значения, нарушающие ожидаемые условия.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * if (url == null) {
 *     throw new UserInputException("Url could not be null");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * UserInputException: Url could not be null
 *     at ru.job4j.ex.JdbcConfig.load(JdbcConfig.java:...)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UserInputException extends Exception {

    /**
     * Создает исключение с заданным сообщением.
     *
     * @param message сообщение об ошибке, описывающее причину исключения
     */
    public UserInputException(String message) {
        super(message);
    }
}
