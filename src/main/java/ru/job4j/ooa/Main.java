package ru.job4j.ooa;

/**
 * Класс {@code Main} демонстрирует работу с объектом {@link User}, объявленным как {@code final}.
 *
 * <p>Несмотря на то что переменная {@code FIRST_USER} объявлена как {@code final},
 * можно изменять внутреннее состояние объекта — его поля через сеттеры.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * final User FIRST_USER = new User("Maksim", 36);
 * System.out.println("Вывод в консоль до изменения.");
 * System.out.println(FIRST_USER);
 * FIRST_USER.setName("Maksim Merkulov");
 * FIRST_USER.setAge(37);
 * System.out.println("Вывод в консоль после изменения.");
 * System.out.println(FIRST_USER);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Вывод в консоль до изменения.
 * User{name='Maksim', age=36}
 * Вывод в консоль после изменения.
 * User{name='Maksim Merkulov', age=37}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Main {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link User} с фиксированной ссылкой ({@code final}) и демонстрирует,
     * что можно изменять его поля с помощью методов {@code setName()} и {@code setAge()}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        final User FIRST_USER = new User("Maksim", 36);
        System.out.println("Вывод в консоль до изменения.");
        System.out.println(FIRST_USER);
        FIRST_USER.setName("Maksim Merkulov");
        FIRST_USER.setAge(37);
        System.out.println("Вывод в консоль после изменения.");
        System.out.println(FIRST_USER);
    }
}
