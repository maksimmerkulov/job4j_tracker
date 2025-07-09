package ru.job4j.ex;

/**
 * Исключение {@code ElementNotFoundException} выбрасывается, когда элемент не найден в массиве.
 *
 * <p>Используется, например, в методе {@link FindEl#indexOf(String[], String)} при неудачном поиске.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * if (!found) {
 *     throw new ElementNotFoundException("Element not found");
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * ru.job4j.ex.ElementNotFoundException: Element not found
 *     at ru.job4j.ex.FindEl.indexOf(FindEl.java:...)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ElementNotFoundException extends Exception {

    /**
     * Создает исключение с заданным сообщением.
     *
     * @param message Сообщение об ошибке, описывающее причину исключения.
     */
    public ElementNotFoundException(String message) {
        super(message);
    }
}