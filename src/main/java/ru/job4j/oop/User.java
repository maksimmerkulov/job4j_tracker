package ru.job4j.oop;

/**
 * Класс {@code User} представляет собой модель пользователя с именем и возрастом.
 *
 * <p>Используется для демонстрации определения прав на вождение на основе возраста.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * User user = new User("Ivan", 20);
 * boolean result = user.canDrive();
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
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
    private String name;

    /**
     * Возраст пользователя.
     */
    private int age;

    /**
     * Определяет, может ли пользователь водить машину.
     *
     * <p>Пользователь может водить, если ему исполнилось 18 лет и более.</p>
     *
     * @return {@code true}, если возраст пользователя 18 лет или больше;
     *         {@code false} — в противном случае
     */
    public boolean canDrive() {
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
