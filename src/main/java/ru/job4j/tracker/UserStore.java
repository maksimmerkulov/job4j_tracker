package ru.job4j.tracker;

/**
 * Класс {@code UserStore} демонстрирует работу с моделью {@link User}.
 *
 * <p>В методе {@link #main(String[])} создается пользователь с предустановленными
 * данными и выводится в консоль с использованием метода {@link User#toString()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User user = new User(1, "root", "root");
 * System.out.println(user);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * User{id=1, username='root', password='root'}
 * }</pre>
 *
 * @author Maksiм Merkulov
 * @version 1.1
 */
public class UserStore {

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        User user = new User(1, "root", "root");
        System.out.println(user);
    }
}
