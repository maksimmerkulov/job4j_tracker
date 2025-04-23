package ru.job4j.tracker;

/**
 * Класс {@code User} представляет пользователя системы.
 * Содержит информацию о пользователе: уникальный идентификатор, имя пользователя и пароль.
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-23
 */
public class User {

    /**
     * Поле {@code id} представляет уникальный идентификатор пользователя.
     */
    private int id;

    /**
     * Поле {@code username} содержит имя пользователя.
     */
    private String username;

    /**
     * Поле {@code password} хранит пароль пользователя.
     */
    private String password;

    /**
     * Конструктор {@code User(int id, String username, String password)}
     * для создания нового объекта {@link User}.
     *
     * @param id Уникальный идентификатор пользователя.
     * @param username Имя пользователя.
     * @param password Пароль пользователя.
     */
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    /**
     * Метод {@code getId()} получает уникальный идентификатор пользователя.
     *
     * @return Идентификатор пользователя.
     */
    public int getId() {
        return id;
    }

    /**
     * Метод {@code getUsername()} получает имя пользователя.
     *
     * @return Имя пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод {@code getPassword()} получает пароль пользователя.
     *
     * @return Пароль пользователя.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Метод {@code toString()} возвращает строковое представление объекта {@link User}.
     *
     * @return Строка, представляющая объект {@link User}.
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