package ru.job4j.queue;

/**
 * Класс {@code Customer} представляет модель клиента с именем и количеством товара.
 *
 * <p>Объекты этого класса являются неизменяемыми записями (record), автоматически
 * предоставляющими методы {@code name()} и {@code amount()} для доступа к полям.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Customer customer = new Customer("Ivan", 5);
 * System.out.println(customer.name());
 * System.out.println(customer.amount());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ivan
 * 5
 * }</pre>
 *
 * @param name   Имя клиента.
 * @param amount Количество товара, которое хочет купить клиент.
 * @author Maksim Merkulov
 * @version 1.0
 */
public record Customer(String name, int amount) {
}
