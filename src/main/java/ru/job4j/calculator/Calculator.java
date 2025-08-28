package ru.job4j.calculator;

/**
 * Класс {@code Calculator} предоставляет методы для выполнения операций сложения над числами типа {@code double}.
 *
 * <p>Поддерживает перегруженные версии метода {@code add} для сложения двух и трех аргументов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Calculator calc = new Calculator();
 * double result1 = calc.add(2.0, 3.0);
 * double result2 = calc.add(1.0, 2.0, 3.0);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 5.0
 * 6.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Calculator {

    /**
     * Складывает два числа типа {@code double}.
     *
     * @param first  первое слагаемое
     * @param second второе слагаемое
     * @return сумма двух чисел
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Складывает три числа типа {@code double}.
     *
     * <p>Использует перегрузку метода {@link #add(double, double)} для последовательного сложения.</p>
     *
     * @param first  первое слагаемое
     * @param second второе слагаемое
     * @param third  третье слагаемое
     * @return сумма трех чисел
     */
    public double add(double first, double second, double third) {
        double temp = add(second, third);
        return add(first, temp);
    }
}
