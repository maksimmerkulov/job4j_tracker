package ru.job4j.ex;

/**
 * Класс {@code UserStore} предоставляет методы для поиска и проверки пользователей.
 *
 * <p>Демонстрирует работу с пользовательскими исключениями.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User[] users = {new User("Maksim Merkulov", true)};
 * try {
 *     User user = UserStore.findUser(users, "Maksim Merkulov");
 *     if (UserStore.validate(user)) {
 *         System.out.println("This user has an access");
 *     }
 * } catch (UserInvalidException e) {
 *     System.out.println("User is not valid");
 * } catch (UserNotFoundException e) {
 *     System.out.println("User not found");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * This user has an access
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UserStore {

    /**
     * Выполняет поиск пользователя по логину в массиве.
     *
     * @param users массив пользователей.
     * @param login логин для поиска.
     * @return найденный пользователь.
     * @throws UserNotFoundException если пользователь не найден.
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    /**
     * Проверяет валидность пользователя.
     *
     * <p>Пользователь считается невалидным, если:</p>
     * <ul>
     *   <li>поле {@code valid} равно {@code false};</li>
     *   <li>имя содержит менее 3 символов.</li>
     * </ul>
     *
     * @param user пользователь для проверки.
     * @return {@code true}, если пользователь валидный.
     * @throws UserInvalidException если пользователь невалидный.
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    /**
     * Точка входа для демонстрации работы методов поиска и валидации пользователя.
     *
     * <p>Обрабатываются пользовательские исключения через множественный блок {@code catch}.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        User[] users = {
                new User("Maksim Merkulov", true)
        };
        try {
            User user = findUser(users, "Maksim Merkulov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println("User is not valid");
        } catch (UserNotFoundException e) {
            System.out.println("User not found");
        }
    }
}