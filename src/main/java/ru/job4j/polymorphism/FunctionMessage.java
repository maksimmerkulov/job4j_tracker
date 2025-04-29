package ru.job4j.polymorphism;

/**
 * Класс {@code FunctionMessage} реализует интерфейс {@link FunctionTwo},
 * который включает дефолтные реализации для выполнения математических операций
 * и вывода сообщений.
 *
 * <p>Этот класс наследует дефолтные реализации методов {@link FunctionTwo#function},
 * {@link FunctionTwo#functionMessage} и других из интерфейса {@link FunctionTwo}.
 * Он не переопределяет методы, а использует их прямо из интерфейса.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FunctionMessage fm = new FunctionMessage();
 * System.out.println(fm.function(2, 3));
 * fm.functionMessage();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 15.0
 * Сообщение из FunctionTwo
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-29
 */
public class FunctionMessage implements FunctionTwo {
}
