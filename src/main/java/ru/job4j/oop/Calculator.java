package ru.job4j.oop;

/**
 * Класс {@code Calculator} предоставляет методы для выполнения различных математических операций:
 * сложение, умножение, вычитание и деление, а также метод для выполнения всех операций одновременно.
 *
 * <p>Также содержит вложенный статический класс {@link Multiple} для возведения числа в квадрат.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Calculator calculator = new Calculator();
 * Calculator.Multiple multiple = Calculator.getMultiple(3);
 * System.out.println("Сложение значения x (5) и числа 10: " + sum(10));
 * System.out.println("Умножение значения x (5) на число 5: " + calculator.multiply(5));
 * System.out.println("Вычитание из числа 20 значения x (5): " + minus(20));
 * System.out.println("Деление числа 15 на значение x (5): " + calculator.divide(15));
 * System.out.println("Сумма всех операций (сложение + умножение + вычитание + деление): "
 * + calculator.sumAllOperation(10, 5, 20, 15));
 * System.out.println("Квадрат числа равен: " + multiple.getResult());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сложение значения x (5) и числа 10: 15
 * Умножение значения x (5) на число 5: 25
 * Вычитание из числа 20 значения x (5): 15
 * Деление числа 15 на значение x (5): 3
 * Сумма всех операций (сложение + умножение + вычитание + деление): 58
 * Квадрат числа равен: 9
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class Calculator {

    /**
     * Статическое значение, используемое во всех вычислениях.
     */
    private static int x = 5;

    /**
     * Возвращает объект {@link Multiple}, содержащий квадрат переданного числа.
     *
     * @param value исходное число
     * @return объект {@code Multiple} с результатом
     */
    public static Multiple getMultiple(int value) {
        int result = value * value;
        return new Multiple(result);
    }

    /**
     * Складывает статическое поле {@code x} и переданное значение {@code a}.
     *
     * @param a число, с которым нужно сложить {@code x}
     * @return результат сложения {@code x} и {@code a}
     */
    public static int sum(int a) {
        return x + a;
    }

    /**
     * Вычисляет разницу между переданным числом и статическим полем {@code x}.
     *
     * @param c число, из которого нужно вычесть {@code x}
     * @return результат вычитания {@code x} из {@code c}
     */
    public static int minus(int c) {
        return c - x;
    }

    /**
     * Умножает статическое поле {@code x} на переданное значение {@code b}.
     *
     * @param b число, на которое нужно умножить {@code x}
     * @return результат умножения {@code x} на {@code b}
     */
    public int multiply(int b) {
        return x * b;
    }

    /**
     * Делит переданное число на значение {@code x}.
     *
     * @param d число, которое нужно разделить на {@code x}
     * @return результат деления {@code d} на {@code x}
     */
    public int divide(int d) {
        return d / x;
    }

    /**
     * Выполняет четыре операции: сложение, умножение, вычитание и деление,
     * и возвращает сумму всех результатов.
     *
     * @param a число для сложения
     * @param b число для умножения
     * @param c число для вычитания
     * @param d число для деления
     * @return сумма всех результатов
     */
    public int sumAllOperation(int a, int b, int c, int d) {
        return sum(a) + multiply(b) + minus(c) + divide(d);
    }

    /**
     * Статический вложенный класс для хранения результата возведения числа в квадрат.
     */
    public static class Multiple {

        /**
         * Результат возведения числа в квадрат.
         */
        private final int result;

        /**
         * Создает объект {@code Multiple} с заданным результатом.
         *
         * @param number число, результат возведения которого в квадрат будет сохранен
         */
        public Multiple(int number) {
            result = number;
        }

        /**
         * Возвращает результат возведения числа в квадрат.
         *
         * @return результат вычисления
         */
        public int getResult() {
            return result;
        }
    }

    /**
     * Демонстрирует работу всех методов калькулятора.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Calculator.Multiple multiple = Calculator.getMultiple(3);
        System.out.println("Сложение значения x (5) и числа 10: " + sum(10));
        System.out.println("Умножение значения x (5) на число 5: " + calculator.multiply(5));
        System.out.println("Вычитание из числа 20 значения x (5): " + minus(20));
        System.out.println("Деление числа 15 на значение x (5): " + calculator.divide(15));
        System.out.println("Сумма всех операций (сложение + умножение + вычитание + деление): "
                + calculator.sumAllOperation(10, 5, 20, 15));
        System.out.println("Квадрат числа равен: " + multiple.getResult());
    }
}
