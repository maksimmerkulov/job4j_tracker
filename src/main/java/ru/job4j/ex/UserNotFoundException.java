package ru.job4j.ex;

/**
 * Исключение {@code UserNotFoundException} выбрасывается, если пользователь не найден в системе.
 *
 * <p>Используется в методах поиска пользователей, например
 * в {@link ru.job4j.ex.UserStore#findUser(User[], String)}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * throw new UserNotFoundException("User not found");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ru.job4j.ex.UserNotFoundException: User not found
 *     at ru.job4j.ex.UserStore.findUser(UserStore.java:...)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UserNotFoundException extends Exception {

    /**
     * Создает исключение с заданным сообщением.
     *
     * @param message Сообщение об ошибке.
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}