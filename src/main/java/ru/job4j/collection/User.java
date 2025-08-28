package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс {@code User} представляет пользователя с именем и возрастом.
 *
 * <p>Класс реализует интерфейс {@link Comparable}, что позволяет сортировать
 * пользователей по имени в лексикографическом порядке, а при равенстве имен —
 * по возрасту (по возрастанию).</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<User> users = Arrays.asList(
 *         new User("Petr", 32),
 *         new User("Ivan", 25),
 *         new User("Ivan", 30)
 * );
 * Collections.sort(users);
 * System.out.println(users);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [User{name='Ivan', age=25},
 *  User{name='Ivan', age=30},
 *  User{name='Petr', age=32}]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class User implements Comparable<User> {

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Возраст пользователя.
     */
    private int age;

    /**
     * Конструктор для создания пользователя.
     *
     * @param name имя пользователя
     * @param age  возраст пользователя
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Сравнивает текущего пользователя с другим.
     *
     * <p>Сначала выполняется сравнение по имени. Если имена совпадают —
     * выполняется сравнение по возрасту.</p>
     *
     * @param o другой пользователь
     * @return отрицательное число, если текущий пользователь "меньше";
     *         ноль, если равны;
     *         положительное число, если "больше"
     */
    @Override
    public int compareTo(User o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = Integer.compare(this.age, o.age);
        }
        return result;
    }

    /**
     * Проверяет равенство текущего объекта с другим.
     *
     * <p>Сравнение выполняется по полям {@code name} и {@code age}.
     * Два объекта считаются равными, если оба этих поля совпадают.</p>
     *
     * @param o объект для сравнения
     * @return {@code true}, если объекты равны;
     *         {@code false} — если не равны
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
        return age == user.age
                && Objects.equals(name, user.name);
    }

    /**
     * Вычисляет хэш-код объекта.
     *
     * <p>Хэш-код формируется на основе полей {@code name} и {@code age}.
     * Если два объекта равны согласно методу {@link #equals(Object)},
     * то и их хэш-коды также будут равны.</p>
     *
     * @return целое число — хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
