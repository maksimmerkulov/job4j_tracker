package ru.job4j.ex;

/**
 * Класс {@code User} представляет пользователя системы с именем и флагом валидности.
 *
 * <p>Используется для проверки прав доступа и наличия пользователя в системе.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User user = new User("Maksim Merkulov", true);
 * String name = user.getUsername();
 * boolean valid = user.isValid();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Maksim Merkulov
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class User {

    /**
     * Имя пользователя.
     */
    private String username;

    /**
     * Флаг валидности пользователя.
     */
    private boolean valid;

    /**
     * Создает пользователя с заданным именем и статусом валидности.
     *
     * @param username имя пользователя
     * @param valid флаг, указывающий на валидность пользователя
     */
    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return строка с именем пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Проверяет, является ли пользователь валидным.
     *
     * @return {@code true}, если пользователь валидный; иначе {@code false}
     */
    public boolean isValid() {
        return valid;
    }
}
