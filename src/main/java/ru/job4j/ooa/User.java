package ru.job4j.ooa;

/**
 * Класс {@code User} представляет собой модель пользователя с именем и возрастом.
 *
 * <p>Используется для хранения и изменения информации о пользователе.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User user = new User("Alice", 30);
 * user.setName("Alice Smith");
 * user.setAge(31);
 * System.out.println(user);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * User{name='Alice Smith', age=31}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User {

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Возраст пользователя.
     */
    private int age;

    /**
     * Создает нового пользователя с заданными именем и возрастом.
     *
     * @param name Имя пользователя
     * @param age  Возраст пользователя
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Устанавливает новое имя пользователя.
     *
     * @param name Новое имя пользователя.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Устанавливает новый возраст пользователя.
     *
     * @param age Новый возраст пользователя.
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Возвращает строковое представление объекта {@code User}.
     *
     * @return Строка формата {@code User{name='...', age=...}}.
     */
    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }
}