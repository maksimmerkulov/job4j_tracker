package ru.job4j.early;

import java.util.Set;

import static java.lang.Character.isDigit;

/**
 * Класс {@code PhoneNumberValidator} выполняет проверку строк на соответствие формату телефонного номера.
 *
 * <p>Ожидается формат: {@code <код> <номер>}, где номер состоит из двух частей, разделенных дефисом.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PhoneNumberValidator.ValidationResult result = PhoneNumberValidator.validPhoneNumber("123 456-7890");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Status: VALID, Message: Valid
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PhoneNumberValidator {

    /**
     * Разрешенные символы, помимо цифр.
     */
    private static final Set<Character> ALLOWED_CHARACTERS = Set.of('(', ')', '-');

    /**
     * Результат проверки строки на валидность.
     *
     * <p>Содержит статус (валидна/невалидна) и сообщение с пояснением.</p>
     */
    public static class ValidationResult {
        /**
         * Возможные статусы проверки.
         */
        public enum Status {
            /**
             * Статус: номер телефона валиден.
             */
            VALID,

            /**
             * Статус: номер телефона невалиден.
             */
            INVALID
        }

        /**
         * Статус результата.
         */
        private Status status;

        /**
         * Сообщение, поясняющее результат.
         */
        private String message;

        /**
         * Создает результат проверки.
         *
         * @param status  статус результата
         * @param message поясняющее сообщение
         */
        public ValidationResult(Status status, String message) {
            this.status = status;
            this.message = message;
        }
    }

    /**
     * Проверяет, соответствует ли строка формату телефонного номера.
     *
     * <p>Формат: {@code <числовой_код> <основной_номер>}, где основной номер содержит дефис.</p>
     *
     * @param phoneNumber строка с номером телефона
     * @return результат проверки в виде {@link ValidationResult}
     */
    public static ValidationResult validPhoneNumber(String phoneNumber) {
        String[] totalParts = phoneNumber.split(" ");
        if (totalParts.length != 2) {
            return new ValidationResult(
                    ValidationResult.Status.INVALID,
                    "String is not consisted from two parts, delimited by space"
            );
        }
        String number = totalParts[1];
        String[] numberParts = number.split("-");
        if (numberParts.length != 2) {
            return new ValidationResult(
                    ValidationResult.Status.INVALID,
                    "Number is not consisted from two parts, delimited by -"
            );
        }
        if (!isNumeric(totalParts[0]) || !isNumeric(number)) {
            return new ValidationResult(
                    ValidationResult.Status.INVALID,
                    "String contains denied characters"
            );
        }
        return new ValidationResult(ValidationResult.Status.VALID, "Valid");
    }

    /**
     * Вспомогательный метод для проверки, содержит ли строка только цифры и разрешенные символы.
     *
     * @param string проверяемая строка
     * @return {@code true}, если строка допустима
     */
    private static boolean isNumeric(String string) {
        for (var i = 0; i < string.length(); i++) {
            var symbol = string.charAt(i);
            if (!ALLOWED_CHARACTERS.contains(symbol) && !isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
}
