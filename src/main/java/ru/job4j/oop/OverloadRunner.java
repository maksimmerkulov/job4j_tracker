package ru.job4j.oop;

/**
 * Класс {@code OverloadRunner} демонстрирует перегрузку методов {@code print} с различными наборами параметров.
 *
 * <p>Каждая перегруженная версия метода {@code print} выводит информацию о человеке: имя, возраст и статус допуска.
 * Типы и порядок аргументов различаются, что иллюстрирует возможности перегрузки методов в Java.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * OverloadRunner runner = new OverloadRunner();
 * runner.print("Alice", 25, true);
 * runner.print("Bob", 30.5, false);
 * runner.print(false, 40, "Charlie");
 * runner.print("Diana", 18);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Your name: Alice
 * Your age: 25
 * Your allow: true
 * ...
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class OverloadRunner {

    /**
     * Выводит имя, возраст (целое число) и статус допуска.
     *
     * @param name  имя пользователя
     * @param age   возраст пользователя (целое число)
     * @param allow допуск к действию
     */
    public void print(String name, int age, boolean allow) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
    }

    /**
     * Выводит имя, возраст (с плавающей точкой) и статус допуска.
     *
     * @param name  имя пользователя
     * @param age   возраст пользователя (дробное число)
     * @param allow допуск к действию
     */
    public void print(String name, double age, boolean allow) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
    }

    /**
     * Выводит статус допуска, возраст и имя (в другом порядке аргументов).
     *
     * @param allow допуск к действию
     * @param age   возраст пользователя
     * @param name  имя пользователя
     */
    public void print(boolean allow, int age, String name) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
    }

    /**
     * Выводит имя и возраст без статуса допуска.
     *
     * @param name имя пользователя
     * @param age  возраст пользователя
     */
    public void print(String name, int age) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
    }
}
