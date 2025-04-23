package ru.job4j.validate;

/**
 * Класс {@code DivideByZero} реализует деление двух целых чисел с проверкой деления на ноль.
 *
 * <p>Метод {@link #divide(int, int)} возвращает результат деления двух чисел,
 * либо -1, если деление на ноль невозможно.
 *
 * <p>Пример использования:
 * <pre>{@code
 * int result = DivideByZero.divide(10, 2);    result = 5
 * int error = DivideByZero.divide(10, 0);     error = -1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-23
 */
public class DivideByZero {

    /**
     * Метод {@code divide(int first, int second)} делит первое число на второе
     * и обрабатывает деление на ноль.
     *
     * <p>Если {@code second == 0}, возвращается значение {@code -1} и
     * выводится сообщение в консоль: {@code "Div by 0, return def value -1"}.
     *
     * @param first  Делимое.
     * @param second Делитель.
     * @return Результат деления или {@code -1}, если деление на ноль.
     */
    public static int divide(int first, int second) {
        int result = -1;
        if (second == 0) {
            System.out.println("Div by 0, return def value -1");
        } else {
            result = first / second;
        }
        return result;
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу {@link #divide(int, int)}.
     *
     * <p>Делит 10 на 0 и выводит результат в консоль.
     *
     * <p>Пример вывода:
     * <pre>
     * Div by 0, return def value -1
     * -1
     * </pre>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }
}