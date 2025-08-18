package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс {@code Order} представляет собой модель заказа с уникальным номером и именем клиента.
 *
 * <p>Используется для хранения и сравнения заказов. Два заказа считаются равными,
 * если совпадают и номер, и имя.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Order order1 = new Order("123", "Ivan Ivanov");
 * Order order2 = new Order("123", "Ivan Ivanov");
 *
 * boolean isEqual = order1.equals(order2);
 * System.out.println(order1);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * Order{number='123', name='Ivan Ivanov'}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Order {

    /**
     * Уникальный номер заказа.
     */
    private String number;

    /**
     * Имя клиента, оформившего заказ.
     */
    private String name;

    /**
     * Конструктор для инициализации заказа.
     *
     * @param number Уникальный номер заказа.
     * @param name   Имя клиента.
     */
    public Order(String number, String name) {
        this.number = number;
        this.name = name;
    }

    /**
     * Возвращает номер заказа.
     *
     * @return Строка с номером заказа.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Возвращает строковое представление заказа.
     *
     * @return Строка вида {@code Order{number='...', name='...'}}.
     */
    @Override
    public String toString() {
        return "Order{"
                + "number='" + number + '\''
                + ", name='" + name + '\''
                + '}';
    }

    /**
     * Сравнивает два заказа по номеру и имени.
     *
     * @param o Другой объект.
     * @return {@code true}, если номер и имя совпадают, иначе {@code false}.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(number, order.number)
                && Objects.equals(name, order.name);
    }

    /**
     * Вычисляет хэш-код заказа на основе номера и имени.
     *
     * @return Хэш-код заказа.
     */
    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }
}
