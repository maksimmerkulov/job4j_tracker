package ru.job4j.tracker.input;

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
 * @version 1.2
 */
public class ConsoleInput implements Input {

    /**
     * Создает объект {@link Scanner}, который используется для получения данных с консоли.
     *
     * <p>Считывает данные с консоли, позволяя использовать методы {@link #askStr(String)}
     * и {@link #askInt(String)} для получения строковых и целочисленных значений от пользователя.</p>
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Запрашивает строковый ввод от пользователя.
     *
     * <p>Выводит вопрос и ожидает ввода строки с консоли. Введенная строка будет возвращена.</p>
     *
     * @param question вопрос, который будет выведен пользователю.
     * @return строка, введенная пользователем.
     */
    @Override
    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Запрашивает ввод целого числа от пользователя.
     *
     * <p>Выводит вопрос и ожидает ввода строки с консоли, а затем преобразует его в целое число.
     * Введенное число будет возвращено.</p>
     *
     * @param question вопрос, который будет выведен пользователю.
     * @return целое число, введенное пользователем.
     * @throws NumberFormatException если введенная строка не является допустимым числом.
     */
    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}