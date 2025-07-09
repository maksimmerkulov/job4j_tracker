package ru.job4j.ex;

/**
 * Класс {@code JdbcConfig} используется для проверки конфигурации подключения к базе данных.
 *
 * <p>Проверяет корректность переданного URL. Если URL {@code null},
 * выбрасывается исключение {@link UserInputException}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * JdbcConfig.load("jdbc://localhost:8080");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Exception in thread "main" UserInputException: Url could not be null
 *     at ru.job4j.ex.JdbcConfig.load(JdbcConfig.java:6)
 *     ...
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class JdbcConfig {

    /**
     * Загружает конфигурацию JDBC по переданному URL.
     *
     * @param url Строка подключения к базе данных.
     * @throws UserInputException если URL равен {@code null}.
     */
    public static void load(String url) throws UserInputException {
        if (url == null) {
            throw new UserInputException("Url could not be null");
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Использует конструкцию {@code try-catch} для обработки исключения {@link UserInputException}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        try {
            load("jdbc://localhost:8080");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}