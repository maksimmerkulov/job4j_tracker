package ru.job4j.oop;

/**
 * Класс {@code Calculator} предоставляет методы для выполнения различных математических операций:
 * сложение, умножение, вычитание и деление, а также метод для выполнения всех операций одновременно.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Calculator calculator = new Calculator();
 * int result1 = Calculator.sum(10);
 * int result2 = calculator.multiply(5);
 * int result3 = Calculator.minus(20);
 * int result4 = calculator.divide(15);
 * int total = calculator.sumAllOperation(10, 5, 20, 15);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Adding value x (5) and number 10: 15
 * Multiplying value x (5) by number 5: 25
 * Subtracting number 20 from value x (5): 15
 * Dividing number 15 by value x (5): 3
 * Sum of all operations (sum + multiply + minus + divide) 58
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Calculator {

    private static int x = 5;

    /**
     * Складывает статическое поле {@code x} и переданное значение {@code a}.
     *
     * @param a Число, с которым нужно сложить {@code x}.
     * @return Результат сложения {@code x} и {@code a}.
     */
    public static int sum(int a) {
        return x + a;
    }

    /**
     * Вычисляет разницу между переданным числом и статическим полем {@code x}.
     *
     * @param c Число, из которого нужно вычесть {@code x}.
     * @return Результат вычитания {@code x} из {@code c}.
     */
    public static int minus(int c) {
        return c - x;
    }

    /**
     * Умножает статическое поле {@code x} на переданное значение {@code b}.
     *
     * @param b Число, на которое нужно умножить {@code x}.
     * @return Результат умножения {@code x} на {@code b}.
     */
    public int multiply(int b) {
        return x * b;
    }

    /**
     * Делит переданное число на значение {@code x}.
     *
     * @param d Число, которое нужно разделить на {@code x}.
     * @return Результат деления {@code d} на {@code x}.
     */
    public int divide(int d) {
        return d / x;
    }

    /**
     * Выполняет все операции: сложение, умножение, вычитание
     * и деление с переданным числом и возвращает их сумму.
     *
     * @return Сумма результатов всех операций.
     */
    public int sumAllOperation(int a, int b, int c, int d) {
        return sum(a) + multiply(b) + minus(c) + divide(d);
    }

    /**
     * Демонстрирует работу всех методов калькулятора.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Adding value x (5) and number 10: " + sum(10));
        System.out.println("Multiplying value x (5) by number 5: " + calculator.multiply(5));
        System.out.println("Subtracting number 20 from value x (5): " + minus(20));
        System.out.println("Dividing number 15 by value x (5): " + calculator.divide(15));
        System.out.println("Sum of all operations (sum + multiply + minus + divide) "
                + calculator.sumAllOperation(10, 5, 20, 15));
    }
}