package ru.job4j.polymorphism;

/**
 * Интерфейс {@code FunctionOne} предоставляет методы для выполнения
 * математических операций и работы с массивами чисел.
 *
 * <p>Методы интерфейса включают функции для вычислений, а также для получения суммы элементов
 * массива и их среднего значения.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public interface FunctionOne {

    /**
     * Функция вычисления значения по формуле x^2 - 2*y + 30.
     *
     * @param x Значение x.
     * @param y Значение y.
     * @return Результат вычисления.
     */
    default double function(double x, double y) {
        return x * x - 2 * y + 30;
    }

    /**
     * Выводит сообщение, которое связано с {@code FunctionOne}.
     */
    default void functionMessage() {
        System.out.println("Сообщение из FunctionOne");
    }

    /**
     * Получает удвоенную сумму элементов массива.
     *
     * @param numbers Массив чисел.
     * @return Удвоенная сумма элементов массива.
     */
    default int getDoubleSum(int[] numbers) {
        return getSum(numbers) * 2;
    }

    /**
     * Вычисляет среднее значение элементов массива.
     *
     * @param numbers Массив чисел.
     * @return Среднее значение элементов массива.
     */
    default double getAverage(int[] numbers) {
        return getSum(numbers) * 1.0 / numbers.length;
    }

    /**
     * Получает сумму элементов массива.
     *
     * @param numbers Массив чисел.
     * @return Сумма элементов массива.
     */
    private int getSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}