package ru.job4j.polymorphism;

/**
 * Класс {@code MainFunction} реализует интерфейсы {@link FunctionOne} и {@link FunctionTwo},
 * переопределяя метод {@link FunctionOne#function(double, double)} для использования
 * реализации из интерфейса {@link FunctionTwo}.
 *
 * <p>В данном примере, метод {@link MainFunction#function(double, double)} вызывает метод
 * {@link FunctionTwo#function(double, double)} для выполнения вычислений с использованием
 * формулы из интерфейса {@link FunctionTwo}.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * MainFunction mainFunction = new MainFunction();
 * double result = mainFunction.function(3, 4);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 3.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public class MainFunction implements FunctionOne, FunctionTwo {

    /**
     * Переопределенный метод {@link FunctionOne#function(double, double)},
     * который вызывает реализацию метода из интерфейса {@link FunctionTwo}.
     *
     * <p>Использует формулу из интерфейса {@link FunctionTwo} для выполнения вычислений.</p>
     *
     * @param x Первое число для вычислений.
     * @param y Второе число для вычислений.
     * @return Результат вычисления по формуле из {@link FunctionTwo#function(double, double)}.
     */
    @Override
    public double function(double x, double y) {
        return FunctionTwo.super.function(x, y);
    }
}