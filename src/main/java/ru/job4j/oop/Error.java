package ru.job4j.oop;

/**
 * Класс {@code Error} представляет собой модель ошибки с тремя основными полями:
 * статус активности ошибки, код статуса и сообщение.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-03-31
 */
public class Error {

    /**
     * Поле {@code active} указывает, активна ли ошибка (true — ошибка активна, false — ошибка не активна).
     */
    private boolean active;

    /**
     * Поле {@code status} хранит код статуса ошибки (например, 404, 500 и т. д.).
     */
    private int status;

    /**
     * Поле {@code message} хранит сообщение об ошибке.
     */
    private String message;

    /**
     * Явный конструктор {@code Error()} по умолчанию. Поля не инициализированы.
     */
    public Error() {
    }

    /**
     * Конструктор {@code Error(boolean active, int status, String message)} с тремя параметрами,
     * который инициализирует поля переданными значениями.
     *
     * @param active  Указывает, активна ли ошибка (true — ошибка активна, false — не активна).
     * @param status  Код статуса ошибки (например, 404 для "Not Found", 500 для "Server Error").
     * @param message Сообщение об ошибке.
     */
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    /**
     * Метод {@code printInfo()} выводит информацию о содержимом полей ошибки в консоль.
     */
    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    /**
     * Метод {@code main(String[] args)} создаёт несколько объектов {@code Error} и вызывает метод
     * {@code printInfo()} для вывода их информации.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Error errorDefault = new Error();
        errorDefault.printInfo();
        Error error = new Error(true, 404, "Page Not Found");
        error.printInfo();
    }
}
