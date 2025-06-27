package ru.job4j.tracker;

/**
 * Класс {@code User} представляет пользователя системы.
 *
 * <p>Содержит информацию о пользователе: уникальный идентификатор, имя и пароль.</p>
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
 * @version 1.0
 */
public class User {

    /**
     * Уникальный идентификатор пользователя.
     */
    private int id;

    /**
     * Имя пользователя.
     */
    private String username;

    /**
     * Пароль пользователя.
     */
    private String password;

    /**
     * Создает нового пользователя с заданными параметрами.
     *
     * @param id        Уникальный идентификатор.
     * @param username  Имя пользователя.
     * @param password  Пароль пользователя.
     */
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Возвращает идентификатор пользователя.
     *
     * @return Уникальный идентификатор.
     */
    public int getId() {
        return id;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return Имя пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Возвращает пароль пользователя.
     *
     * @return Пароль пользователя.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Возвращает строковое представление объекта {@link User}.
     *
     * @return Строка с данными пользователя.
     */
    @Override
    public String toString() {
        return "User{"
                + "id=" + id
                + ", username='" + username + '\''
                + ", password='" + password + '\''
                + '}';
    }
}