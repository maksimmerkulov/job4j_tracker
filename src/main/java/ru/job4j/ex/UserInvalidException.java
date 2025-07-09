package ru.job4j.ex;

/**
 * Исключение {@code UserInvalidException} выбрасывается, если пользователь найден, но считается недопустимым.
 *
 * <p>Это может происходить, если пользователь невалиден или его имя содержит менее трех символов.</p>
 *
 * <p>Наследуется от {@link UserNotFoundException}, чтобы сохранять общий контекст исключений,
 * связанных с пользователями.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * if (!user.isValid() || user.getUsername().length() < 3) {
 *     throw new UserInvalidException("User is invalid");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ru.job4j.ex.UserInvalidException: User is invalid
 *     at ru.job4j.ex.UserStore.validate(UserStore.java:...)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UserInvalidException extends UserNotFoundException {

    /**
     * Создает исключение с заданным сообщением.
     *
     * @param message Сообщение об ошибке.
     */
    public UserInvalidException(String message) {
        super(message);
    }
}