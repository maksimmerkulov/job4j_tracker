package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс {@code User} представляет модель пользователя банковской системы.
 *
 <p>Пользователь идентифицируется уникальным номером паспорта и хранит свое полное имя (ФИО).</p>
 *
 * <p><b>Поля:</b></p>
 * <ul>
 *   <li>{@link #passport} — номер паспорта, служит ключом для поиска и идентификации;</li>
 *   <li>{@link #username} — ФИО пользователя.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User user = new User("1234", "Ivan Petrov Sidorovich");
 * System.out.println(user.getPassport());
 * System.out.println(user.getUsername());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 1234
 * Ivan Petrov Sidorovich
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User {

    /**
     * Номер паспорта пользователя.
     */
    private String passport;

    /**
     * ФИО пользователя.
     */
    private String username;

    /**
     * Конструктор для инициализации пользователя.
     *
     * @param passport Номер паспорта.
     * @param username ФИО пользователя.
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает номер паспорта пользователя.
     *
     * @return Номер паспорта пользователя.
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает номер паспорта пользователя.
     *
     * @param passport Новый номер паспорта.
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает ФИО пользователя.
     *
     * @return ФИО пользователя.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает ФМО пользователя.
     *
     * @param username ФИО пользователя.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнивает пользователей только по номеру паспорта.
     *
     * @param o Другой объект для сравнения.
     * @return {@code true}, если номера паспортов совпадают, иначе {@code false}.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Вычисляет хэш-код на основе номера паспорта.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
