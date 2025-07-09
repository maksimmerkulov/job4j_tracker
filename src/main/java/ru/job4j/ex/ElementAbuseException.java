package ru.job4j.ex;

/**
 * Исключение {@code ElementAbuseException} сигнализирует о том, что элемент является запрещенным.
 *
 * <p>Является подклассом {@link ElementNotFoundException} и используется, когда элемент найден,
 * но он входит в список запрещенных слов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] abuses = {"cat", "dog"};
 * String key = "dog";
 * if (Arrays.asList(abuses).contains(key)) {
 *     throw new ElementAbuseException("Element is abusive: " + key);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ru.job4j.ex.ElementAbuseException: Element is abusive: dog
 *     at ru.job4j.ex.FindEl.sent(FindEl.java:...)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ElementAbuseException extends ElementNotFoundException {

    /**
     * Создает исключение {@code ElementAbuseException} с заданным сообщением.
     *
     * @param message Сообщение об ошибке.
     */
    public ElementAbuseException(String message) {
        super(message);
    }
}