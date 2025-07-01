package ru.job4j.polymorphism;

/**
 * Интерфейс {@code FunctionOne} предоставляет набор функциональных методов
 * для вычисления математических выражений и обработки массивов целых чисел.
 *
 * <p>Содержит реализацию по умолчанию для:</p>
 * <ul>
 *   <li>Математической функции двух переменных</li>
 *   <li>Вывода сообщения</li>
 *   <li>Получения удвоенной суммы</li>
 *   <li>Вычисления среднего значения</li>
 * </ul>
 *
 * <p>Может быть использован в образовательных задачах, моделировании или
 * как основа для расширения функциональности в других интерфейсах.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FunctionOne f = new FunctionOne() {};
 * double result = f.function(4, 2);
 * f.functionMessage();
 * int[] data = {1, 2, 3};
 * int doubleSum = f.getDoubleSum(data);
 * double avg = f.getAverage(data);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение из FunctionOne
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public interface FunctionOne {

    /**
     * Вычисляет выражение {@code x * x - 2 * y + 30}.
     *
     * <p>Может использоваться для тестирования математических операций
     * или как простая обучающая функция.</p>
     *
     * @param x Первое значение.
     * @param y Второе значение.
     * @return Результат вычисления.
     */
    default double function(double x, double y) {
        return x * x - 2 * y + 30;
    }

    /**
     * Выводит сообщение в консоль.
     *
     * <p>Используется для демонстрации вызова метода по умолчанию.</p>
     */
    default void functionMessage() {
        System.out.println("Сообщение из FunctionOne");
    }

    /**
     * Возвращает удвоенную сумму всех элементов массива.
     *
     * @param numbers Массив целых чисел.
     * @return Удвоенная сумма элементов.
     */
    default int getDoubleSum(int[] numbers) {
        return getSum(numbers) * 2;
    }

    /**
     * Вычисляет среднее значение элементов массива.
     *
     * @param numbers Массив целых чисел.
     * @return Среднее арифметическое значение.
     */
    default double getAverage(int[] numbers) {
        return getSum(numbers) * 1.0 / numbers.length;
    }

    /**
     * Вычисляет сумму всех элементов массива.
     *
     * <p>Является приватным методом интерфейса и используется внутренне
     * другими методами интерфейса.</p>
     *
     * @param numbers Массив целых чисел.
     * @return Сумма элементов.
     */
    private int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}