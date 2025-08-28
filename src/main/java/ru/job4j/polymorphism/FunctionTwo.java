package ru.job4j.polymorphism;

/**
 * Интерфейс {@code FunctionTwo} расширяет интерфейс {@link FunctionOne}
 * и переопределяет его методы, изменяя поведение вычислений и сообщений.
 *
 * <p>Применяется для демонстрации множественного наследования интерфейсов,
 * переопределения {@code default}-методов и выбора конкретной реализации.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FunctionTwo f = new FunctionTwo() {};
 * double result = f.function(4, 2);
 * f.functionMessage();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение из FunctionTwo
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 * @see FunctionOne
 */
public interface FunctionTwo extends FunctionOne {

    /**
     * Переопределяет функцию вычисления.
     *
     * <p>Вычисляет выражение {@code x * x - y + 5}, отличающееся от базовой реализации
     * в {@link FunctionOne}.</p>
     *
     * @param x первое значение
     * @param y второе значение
     * @return результат вычисления
     */
    @Override
    default double function(double x, double y) {
        return x * x - y + 5;
    }

    /**
     * Переопределяет вывод сообщения.
     *
     * <p>Отличается от {@link FunctionOne#functionMessage()} сообщением.</p>
     */
    @Override
    default void functionMessage() {
        System.out.println("Сообщение из FunctionTwo");
    }
}
