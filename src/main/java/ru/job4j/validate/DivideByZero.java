package ru.job4j.validate;

/**
 * Класс {@code DivideByZero} демонстрирует пример безопасного деления с проверкой делителя.
 *
 * <p>При попытке деления на 0 вместо выбрасывания исключения возвращается значение по умолчанию {@code -1}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int result = divide(10, 0);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Div by 0, return def value -1
 * -1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DivideByZero {

    /**
     * Делит {@code first} на {@code second}, предварительно проверяя делитель на ноль.
     *
     * @param first  Числитель.
     * @param second Знаменатель.
     * @return Результат деления, либо -1, если {@code second} равен 0.
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
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int result = divide(10, 0);
        System.out.println(result);
    }
}