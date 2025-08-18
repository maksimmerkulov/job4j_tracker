package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code OrderConvertTest} содержит модульные тесты для проверки работы
 * сервиса {@link OrderConvert}.
 *
 * <p>Основные сценарии:</p>
 * <ul>
 *     <li>Проверка корректного преобразования списка с одним заказом в HashMap.</li>
 *     <li>Проверка обработки дублирующихся номеров заказов: в карте должен остаться
 *     только последний добавленный заказ с этим номером.</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * List<Order> orders = new ArrayList<>();
 * orders.add(new Order("3sfe", "Dress"));
 * HashMap<String, Order> map = OrderConvert.process(orders);
 * Order expected = new Order("3sfe", "Dress");
 * assertThat(map.get("3sfe")).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class OrderConvertTest {

    /**
     * Проверяет, что список с одним заказом корректно преобразуется в HashMap.
     *
     * <p>Ожидается, что метод {@link OrderConvert#process(List)} создаст карту
     * с одним элементом, доступным по ключу номера заказа.</p>
     */
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        Order expected = new Order("3sfe", "Dress");
        assertThat(map.get("3sfe")).isEqualTo(expected);
    }

    /**
     * Проверяет, что при добавлении нескольких заказов с одинаковым номером
     * в HashMap остается только один элемент.
     *
     * <p>Ожидается, что размер карты после обработки списка с дубликатами
     * будет равен 1.</p>
     */
    @Test
    public void whenDuplicateOrders() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        orders.add(new Order("3sfe", "Shoes"));
        orders.add(new Order("3sfe", "Phone"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.size()).isEqualTo(1);
    }
}
