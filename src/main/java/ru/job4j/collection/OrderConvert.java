package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Класс {@code OrderConvert} предназначен для преобразования списка заказов
 * в карту (map), где ключом является номер заказа, а значением — сам заказ.
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Order> orders = List.of(
 *     new Order("123", "Ivan Ivanov"),
 *     new Order("456", "Petr Petrov")
 * );
 * HashMap<String, Order> map = OrderConvert.process(orders);
 * System.out.println(map.get("123"));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Order{number='123', name='Ivan Ivanov'}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class OrderConvert {

    /**
     * Преобразует список заказов в карту.
     *
     * <p>Ключом будет номер заказа, значением — объект {@link Order}.</p>
     *
     * @param orders список заказов
     * @return карта заказов с номерами в качестве ключей
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
