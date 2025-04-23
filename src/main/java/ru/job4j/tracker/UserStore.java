package ru.job4j.tracker;

/**
 * Класс {@code UserStore} демонстрирует работу с моделью {@link User}.
 * <p>
 * В методе {@link #main(String[])} создается пользователь с предустановленными
 * данными и выводится в консоль с использованием метода {@code toString()}.
 * </p>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * User{id=1, username='root', password='root'}
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-23
 */
public class UserStore {

    /**
     * Метод {@code main(String[] args)} — точка входа в приложение.
     * <p>Создает экземпляр класса {@link User} и выводит его данные в консоль.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        User user = new User(1, "root", "root");
        System.out.println(user);
    }
}