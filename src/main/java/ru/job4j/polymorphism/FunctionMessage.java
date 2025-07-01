package ru.job4j.polymorphism;

/**
 * Класс {@code FunctionMessage} реализует интерфейс {@link FunctionTwo},
 * наследуя функциональность от {@link FunctionOne} и {@link FunctionTwo}.
 *
 * <p>Использует поведение по умолчанию, определенное в интерфейсах: функцию вычисления,
 * сообщение, а также методы для работы с массивами (сумма, удвоенная сумма и среднее значение).</p>
 *
 * <p>Может быть использован для демонстрации множественного наследования интерфейсов,
 * переопределения {@code default}-методов и вызова их в коде без явной реализации в классе.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FunctionMessage message = new FunctionMessage();
 * double result = message.function(5, 2);
 * message.functionMessage();
 * int[] data = {1, 2, 3};
 * int doubleSum = message.getDoubleSum(data);
 * double avg = message.getAverage(data);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Сообщение из FunctionTwo
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @see FunctionOne
 * @see FunctionTwo
 */
public class FunctionMessage implements FunctionTwo { }