package ru.job4j.early;

/**
 * Класс {@code PasswordValidator} представляет собой утилиту для валидации паролей
 * по набору предопределенных правил безопасности.
 *
 * <p>Используется для проверки пользовательских паролей по следующим критериям:</p>
 * <ul>
 *   <li>Пароль не {@code null}</li>
 *   <li>Длина пароля от 8 до 32 символов</li>
 *   <li>Наличие хотя бы одной заглавной буквы</li>
 *   <li>Наличие хотя бы одной строчной буквы</li>
 *   <li>Наличие хотя бы одной цифры</li>
 *   <li>Наличие хотя бы одного спецсимвола (не цифра и не буква)</li>
 *   <li>Отсутствие запрещенных подстрок:
 *   {@code qwerty}, {@code 12345}, {@code password}, {@code admin}, {@code user}</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String password = "Str0ng@Pass!";
 * String validated = PasswordValidator.validate(password);
 * System.out.println(validated);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Str0ng@Pass!
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PasswordValidator {

    /**
     * Список запрещенных подстрок, которые не должны присутствовать в пароле (без учета регистра).
     */
    private static final String[] FORBIDDEN = {"qwerty", "12345", "password", "admin", "user"};

    /**
     * Метод проверят пароль по правилам:
     *  1. Если password null, то выбросить исключение "Password can't be null";
     *  2. Длина пароля находится в диапазоне [8, 32],
     *     если нет то "Password should be length [8, 32]";
     *  3. Пароль содержит хотя бы один символ в верхнем регистре,
     *     если нет то "Password should contain at least one uppercase letter");
     *  4. Пароль содержит хотя бы один символ в нижнем регистре,
     *     если нет то "Password should contain at least one lowercase letter";
     *  5. Пароль содержит хотя бы одну цифру,
     *     если нет то"Password should contain at least one figure");
     *  6. Пароль содержит хотя бы один спец. символ (не цифра и не буква),
     *     если нет то "Password should contain at least one special symbol");
     *  7. Пароль не содержит подстрок без учета регистра: qwerty, 12345, password, admin, user.
     *     Без учета регистра, значит что, например, ни qwerty ни QWERTY ни qwErty и т.п.
     *     если да, то "Password shouldn't contain substrings: qwerty, 12345, password, admin, user".
     *
     * @param password пароль
     * @return пароль, если он прошел все проверки
     * @throws IllegalArgumentException если пароль не соответствует хотя бы одному правилу
     */
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException(
                    "Password can't be null"
            );
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException(
                    "Password should be length [8, 32]"
            );
        }
        boolean hasUpCase = false;
        boolean hasLowCase = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char symbol : password.toCharArray()) {
            if (Character.isUpperCase(symbol)) {
                hasUpCase = true;
            }
            if (Character.isLowerCase(symbol)) {
                hasLowCase = true;
            }
            if (Character.isDigit(symbol)) {
                hasDigit = true;
            }
            if (!Character.isLetterOrDigit(symbol)) {
                hasSpecial = true;
            }
            if (hasUpCase && hasLowCase && hasDigit && hasSpecial) {
                break;
            }
        }
        if (!hasUpCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one uppercase letter"
            );
        }
        if (!hasLowCase) {
            throw new IllegalArgumentException(
                    "Password should contain at least one lowercase letter"
            );
        }
        if (!hasDigit) {
            throw new IllegalArgumentException(
                    "Password should contain at least one figure"
            );
        }
        if (!hasSpecial) {
            throw new IllegalArgumentException(
                    "Password should contain at least one special symbol"
            );
        }
        for (String forbidden : FORBIDDEN) {
            if (password.toLowerCase().contains(forbidden)) {
                throw new IllegalArgumentException(
                        "Password shouldn't contain substrings: qwerty, 12345, password, admin, user"
                );
            }
        }
        return password;
    }
}
