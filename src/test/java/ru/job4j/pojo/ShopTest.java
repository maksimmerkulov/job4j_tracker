package ru.job4j.pojo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ShopTest} содержит модульные тесты для метода {@link Shop#indexOfNull(Product[])}.
 *
 * <p>Тесты проверяют корректность определения первой пустой (null) ячейки в массиве продуктов:</p>
 * <ul>
 *     <li>{@link #whenLastNull()} — проверка, когда последняя ячейка не инициализирована.</li>
 *     <li>{@link #whenFirstNull()} — проверка, когда первая ячейка не инициализирована.</li>
 *     <li>{@link #whenHasNotNull()} — проверка, когда все ячейки инициализированы.</li>
 * </ul>
 *
 * <p>Ожидаемое поведение метода — возвращать индекс первой {@code null}-ячейки или {@code -1}, если таких нет.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Product[] products = new Product[5];
 * products[0] = new Product("Milk", 10);
 * products[1] = new Product("Bread", 4);
 * products[2] = new Product("Egg", 19);
 * int result = Shop.indexOfNull(products);
 * int expected = 3;
 * assertThat(result).isEqualTo(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ShopTest {

    /**
     * Проверка, что метод возвращает индекс 3, если null находится в конце инициализированной части массива.
     */
    @Test
    public void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int result = Shop.indexOfNull(products);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверка, что метод возвращает 0, если первая ячейка массива не инициализирована.
     */
    @Test
    public void whenFirstNull() {
        Product[] products = new Product[5];
        products[1] = new Product("Milk", 10);
        int result = Shop.indexOfNull(products);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Проверка, что метод возвращает -1, если все ячейки массива инициализированы.
     */
    @Test
    public void whenHasNotNull() {
        Product[] products = new Product[1];
        products[0] = new Product("Milk", 10);
        int result = Shop.indexOfNull(products);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}
