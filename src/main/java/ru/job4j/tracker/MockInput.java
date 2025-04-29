package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс {@code MockInput} реализует интерфейс {@link Input} и предоставляет методы для получения
 * данных с консоли. Этот класс используется для имитации ввода данных в тестах, что позволяет
 * проверять работу программы, моделируя действия пользователя.
 *
 * <p>Используется для автоматического тестирования, когда необходимо задать заранее определенные
 * данные, которые будут "введены" пользователем в тестах.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input mockInput = new MockInput();
 * String name = mockInput.askStr("Как тебя зовут?");
 * int age = mockInput.askInt("Сколько тебе лет?");
 * System.out.println("Имя пользователя: " + name);
 * System.out.println("Возраст: " + age);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Как тебя зовут? Максим
 * Сколько тебе лет? 37
 * Имя пользователя: Максим
 * Возраст: 37
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public class MockInput implements Input {

    /**
     * Создает объект {@link Scanner}, который используется для получения данных с консоли.
     *
     * <p>Объект {@link Scanner} будет считывать данные с консоли, позволяя использовать методы
     * {@link #askStr(String)} и {@link #askInt(String)} для получения строковых и целочисленных
     * значений от пользователя.</p>
     *
     * @see Scanner
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Запрашивает строковый ввод от пользователя.
     *
     * <p>Метод выводит вопрос и ожидает ввода строки с консоли. Введенная строка будет возвращена.</p>
     *
     * @param question Вопрос, который будет выведен пользователю.
     * @return Введенная пользователем строка.
     */
    @Override
    public String askStr(String question) {
        System.out.print(question + " ");
        return scanner.nextLine();
    }

    /**
     * Запрашивает целое число от пользователя.
     *
     * <p>Метод выводит вопрос и ожидает ввода числа с консоли. Введенная строка проверяется на корректность.
     * Если ввод не является корректным числом, пользователю будет предложено ввести число заново.</p>
     *
     * @param question Вопрос, который будет выведен пользователю.
     * @return Введенное пользователем число.
     */
    @Override
    public int askInt(String question) {
        int result = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(question + " ");
            String input = scanner.nextLine();
            try {
                result = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Пожалуйста, введите целое число.");
            }
        }
        return result;
    }

    /**
     * Главный метод для демонстрации работы класса {@code MockInput}.
     *
     * <p>Метод вызывает {@link #askStr(String)} и {@link #askInt(String)} для получения имени и возраста
     * пользователя, а затем выводит эти данные.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Input mockInput = new MockInput();
        String name = mockInput.askStr("Как тебя зовут?");
        int age = mockInput.askInt("Сколько тебе лет?");
        System.out.println("Имя пользователя: " + name);
        System.out.println("Возраст: " + age);
    }
}