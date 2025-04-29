package ru.job4j.polymorphism;

/**
 * Интерфейс {@code FunctionTwo} расширяет интерфейс {@link FunctionOne},
 * переопределяя методы для выполнения различных математических операций.
 *
 * <p>Методы интерфейса {@code FunctionTwo} изменяют реализацию методов
 * из {@link FunctionOne} для вычисления с другими формулами.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public interface FunctionTwo extends FunctionOne {

    /**
     * Функция вычисления значения по новой формуле x^2 - y + 5.
     * Переопределяет метод из {@link FunctionOne}.
     *
     * @param x Значение x.
     * @param y Значение y.
     * @return Результат вычисления.
     */
    default double function(double x, double y) {
        return x * x - y + 5;
    }

    /**
     * Выводит сообщение, связанное с {@code FunctionTwo}.
     * Переопределяет метод из {@link FunctionOne}.
     */
    default void functionMessage() {
        System.out.println("Сообщение из FunctionTwo");
    }
}