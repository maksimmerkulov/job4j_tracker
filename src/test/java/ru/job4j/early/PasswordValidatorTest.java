package ru.job4j.early;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Класс {@code PasswordValidatorTest} предназначен для модульного тестирования класса {@link PasswordValidator}.
 *
 * <p>Проверяет корректность валидации паролей по следующим критериям:</p>
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
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * String password = "Ln2$mrTY12";
 * String expected = "Ln2$mrTY12";
 * String result = PasswordValidator.validate(password);
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class PasswordValidatorTest {

    /**
     * Проверка валидного пароля — все условия соблюдены.
     */
    @Test
    void whenPasswordIsValid() {
        String password = "Ln2$mrTY12";
        String expected = "Ln2$mrTY12";
        String result = PasswordValidator.validate(password);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверка на {@code null} пароль — должно выброситься исключение.
     */
    @Test
    void whenPasswordIsNull() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(null)
        );
        String expected = "Password can't be null";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка, что длина пароля меньше 8 символов — ошибка.
     */
    @Test
    void whenPasswordLengthLess8() {
        String password = "Ln2$mrT";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should be length [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка, что длина пароля больше 32 символов — ошибка.
     */
    @Test
    void whenPasswordLengthMore32() {
        String password = "Ln2$mrTY3245nMdsdfdfPPPg$#dg124531";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should be length [8, 32]";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка отсутствия заглавной буквы — ошибка.
     */
    @Test
    void whenPasswordNotContainUpperCaseLetter() {
        String password = "ln2$mrty12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one uppercase letter";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка отсутствия строчной буквы — ошибка.
     */
    @Test
    void whenPasswordNotContainLowerCaseLetter() {
        String password = "LN2$MRTY12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one lowercase letter";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка отсутствия цифры в пароле — ошибка.
     */
    @Test
    void whenPasswordNotContainFigure() {
        String password = "LnI$mrTYUo";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one figure";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка отсутствия спецсимвола в пароле — ошибка.
     */
    @Test
    void whenPasswordNotContainSpecialSymbol() {
        String password = "Ln2pmrTY12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password should contain at least one special symbol";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка наличия запрещенной подстроки {@code qwerty} — ошибка.
     */
    @Test
    void whenPasswordContainSubstringQWERTY() {
        String password = "Ln2$mrQWerTY12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка наличия запрещенной подстроки {@code 12345} — ошибка.
     */
    @Test
    void whenPasswordContainSubstring12345() {
        String password = "Ln2$mrTY12345";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка наличия запрещенной подстроки {@code password} — ошибка.
     */
    @Test
    void whenPasswordContainSubstringPassword() {
        String password = "LnPaSsWoRd2$mrTY12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка наличия запрещенной подстроки {@code admin} — ошибка.
     */
    @Test
    void whenPasswordContainSubstringAdmin() {
        String password = "Ln2$aDmiNrTY12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }

    /**
     * Проверка наличия запрещенной подстроки {@code user} — ошибка.
     */
    @Test
    void whenPasswordContainSubstringUser() {
        String password = "Ln2$mUSerTY12";
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> PasswordValidator.validate(password)
        );
        String expected = "Password shouldn't contain substrings: qwerty, 12345, password, admin, user";
        assertThat(exception.getMessage()).isEqualTo(expected);
    }
}
