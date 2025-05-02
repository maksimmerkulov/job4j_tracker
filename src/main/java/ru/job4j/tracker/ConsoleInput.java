package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс {@code ConsoleInput} представляет собой реализацию интерфейса {@link Input}
 * для получения пользовательского ввода с консоли.
 *
 * <p>Используется для чтения строк и целых чисел от пользователя. Может применяться
 * в интерактивных консольных приложениях, таких как трекер заявок.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Input input = new ConsoleInput();
 * String name = input.askStr("Введите имя: ");
 * int id = input.askInt("Введите id: ");
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Введите имя: Максим
 * Введите id: 37
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @since 2025-05-02
 */
public class ConsoleInput implements Input {

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
     * @return Строка, введенная пользователем.
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Запрашивает ввод целого числа от пользователя.
     *
     * <p>Метод выводит вопрос и ожидает ввода строки с консоли, а затем преобразует его в целое число.
     * Введенное число будет возвращено.</p>
     *
     * @param question Вопрос, который будет выведен пользователю.
     * @return Целое число, введенное пользователем.
     * @throws NumberFormatException Если введенная строка не является допустимым числом.
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}