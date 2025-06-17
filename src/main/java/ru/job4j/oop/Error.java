package ru.job4j.oop;

/**
 * Класс {@code Error} представляет собой модель ошибки с информацией об активности ошибки,
 * статусе и сообщении.
 *
 * <p>Данный класс позволяет создавать объекты с помощью конструкторов и выводить информацию
 * об ошибке с помощью метода {@link #printInfo()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Error errorDefault = new Error();
 * errorDefault.printInfo();
 *
 * Error notFound = new Error(true, 404, "Not Found");
 * notFound.printInfo();
 *
 * Error serverError = new Error(false, 500, "Internal Server Error");
 * serverError.printInfo();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Active: false
 * Status: 0
 * Message: null
 *
 * Active: true
 * Status: 404
 * Message: Not Found
 *
 * Active: false
 * Status: 500
 * Message: Internal Server Error
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Error {

    /**
     * Флаг, указывающий на наличие ошибки.
     */
    private boolean active;

    /**
     * Код ошибки.
     */
    private int status;

    /**
     * Сообщение ошибки.
     */
    private String message;

    /**
     * Конструктор по умолчанию.
     * Инициализирует поля стандартными (по умолчанию) значениями.
     */
    public Error() {
    }

    /**
     * Конструктор с параметрами.
     *
     * @param active Наличие ошибки.
     * @param status Код ошибки.
     * @param message Описание ошибки.
     */
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    /**
     * Выводит информацию о содержимом полей ошибки в консоль.
     */
    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    /**
     * Создает несколько объектов {@link Error} и вызывает метод
     * {@link #printInfo()} для вывода их информации.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Error errorDefault = new Error();
        Error notFound = new Error(true, 404, "Not Found");
        Error serverError = new Error(false, 500, "Internal Server Error");
        errorDefault.printInfo();
        notFound.printInfo();
        serverError.printInfo();
    }
}