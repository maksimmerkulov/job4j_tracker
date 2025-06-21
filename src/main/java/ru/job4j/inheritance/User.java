package ru.job4j.inheritance;

/**
 * Класс {@code User} наследуется от {@link Base} и представляет пользователя.
 *
 * <p>В методе {@link #main(String[])} создается экземпляр {@code User},
 * что вызывает конструкторы обоих классов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User user = new User();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Default Base constructor.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User extends Base {

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        User user = new User();
    }
}