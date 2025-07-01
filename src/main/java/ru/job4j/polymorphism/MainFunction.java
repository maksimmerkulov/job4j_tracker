package ru.job4j.polymorphism;

/**
 * Класс {@code MainFunction} реализует интерфейсы {@link FunctionOne} и {@link FunctionTwo},
 * разрешая конфликт между одинаковыми методами за счет явного указания {@code FunctionTwo.super.function(x, y)}.
 *
 * <p>Представляет собой пример множественного наследования интерфейсов с одинаковыми {@code default}-методами
 * и явного выбора конкретной реализации.</p>
 *
 * <p>Также унаследует методы {@code getAverage}, {@code getDoubleSum} и {@code functionMessage}
 * из {@link FunctionOne} и {@link FunctionTwo} (если не переопределены).</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * MainFunction f = new MainFunction();
 * double result = f.function(4, 2);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 19.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see FunctionOne
 * @see FunctionTwo
 */
public class MainFunction implements FunctionOne, FunctionTwo {

    /**
     * Вызывает реализацию метода {@link FunctionTwo#function(double, double)} из {@link FunctionTwo}.
     *
     * <p>Это необходимо, поскольку интерфейсы {@link FunctionOne} и {@link FunctionTwo}
     * содержат {@code default}-метод с одинаковой сигнатурой.</p>
     *
     * @param x Первое значение.
     * @param y Второе значение.
     * @return Результат вычисления по формуле {@code x * x - y + 5}.
     */
    @Override
    public double function(double x, double y) {
        return FunctionTwo.super.function(x, y);
    }
}