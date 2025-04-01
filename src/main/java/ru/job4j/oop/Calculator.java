package ru.job4j.oop;

/**
 * Класс {@code Calculator} предоставляет методы для выполнения различных математических операций:
 * сложение, умножение, вычитание и деление, а также метод для выполнения всех операций одновременно.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-01
 */
public class Calculator {

    /**
     * Статическое поле {@code x} используется во всех операциях калькулятора.
     */
    private static int x = 5;

    /**
     * Статический метод {@code sum(int y)} складывает статическое поле {@code x} и переданное значение {@code y}.
     *
     * @param y Число, с которым нужно сложить {@code x}.
     * @return Результат сложения {@code x} и {@code y}.
     */
    public static int sum(int y) {
        return x + y;
    }

    /**
     * Статический метод {@code minus(int y)} вычисляет разницу между статическим полем {@code x} и переданным числом.
     *
     * @param y Число, из которого нужно вычесть {@code x}.
     * @return Результат вычитания {@code x} из {@code y}.
     */
    public static int minus(int y) {
        return y - x;
    }

    /**
     * Нестатический метод {@code multiply(int y)} умножает статическое поле {@code x} на переданное значение {@code y}.
     *
     * @param y Число, на которое нужно умножить {@code x}.
     * @return Результат умножения {@code x} на {@code y}.
     */
    public int multiply(int y) {
        return x * y;
    }

    /**
     * Нестатический метод {@code divide(int y)} делит переданное число на значение {@code x}.
     *
     * @param y Число, которое нужно разделить на {@code x}.
     * @return Результат деления {@code y} на {@code x}.
     */
    public int divide(int y) {
        return y / x;
    }

    /**
     * Нестатический метод {@code sumAllOperation(int y)} выполняет все операции: сложение, умножение,
     * вычитание и деление с переданным числом и возвращает их сумму.
     *
     * @param y Число, которое используется во всех операциях.
     * @return Сумма результатов всех операций.
     */
    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    /**
     * Статический метод {@code main(String[] args)} демонстрирует работу всех методов калькулятора.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Adding value x (5) and number 10: " + sum(10));
        System.out.println("Multiplying value x (5) by number 5: " + calculator.multiply(5));
        System.out.println("Subtracting value x (5) from number 20: " + minus(20));
        System.out.println("Dividing number 20 by value x (5): " + calculator.divide(20));
        System.out.println("Sum of all operations (sum + multiply + minus + divide) "
                           + "with number 10: " + calculator.sumAllOperation(10));
    }
}