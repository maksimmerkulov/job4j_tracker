package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code ShopDropTest} содержит модульные тесты для метода {@link ShopDrop#delete(Product[], int)},
 * который удаляет элемент массива и сдвигает оставшиеся элементы влево.
 *
 * <p>Проверяется корректность удаления элемента из массива продуктов и сдвига элементов:</p>
 * <ul>
 *     <li>Удаление первого элемента</li>
 *     <li>Удаление последнего элемента</li>
 *     <li>Удаление элемента из середины (массив длиной 4 и 5)</li>
 * </ul>
 *
 * <p>Каждый тест проверяет:</p>
 * <ul>
 *     <li>Правильность сдвига элементов в массиве</li>
 *     <li>Обнуление последней ячейки массива ({@code null})</li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Product[] products = new Product[2];
 * products[0] = new Product("Milk", 10);
 * products[1] = new Product("Bread", 4);
 * Product[] result = ShopDrop.delete(products, 0);
 * assertThat(result[0].getName()).isEqualTo("Bread");
 * assertThat(result[1]).isNull();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShopDropTest {

    /**
     * Тестирует удаление первого элемента массива.
     *
     * <p>Ожидается, что оставшийся элемент сместится на первую позицию,
     * а последняя ячейка станет {@code null}.</p>
     */
    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] result = ShopDrop.delete(products, 0);
        assertThat(result[0].getName()).isEqualTo("Bread");
        assertThat(result[1]).isNull();
    }

    /**
     * Тестирует удаление последнего элемента массива.
     *
     * <p>Ожидается, что первый элемент останется без изменений,
     * а последняя ячейка станет {@code null}.</p>
     */
    @Test
    public void whenDropLast() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        Product[] result = ShopDrop.delete(products, 1);
        assertThat(result[0].getName()).isEqualTo("Milk");
        assertThat(result[1]).isNull();
    }

    /**
     * Тестирует удаление элемента с индексом 1 из массива длиной 4.
     *
     * <p>Ожидается, что элементы с индексами 2 и 3 сместятся на одну
     * позицию влево, а последняя ячейка станет {@code null}.</p>
     */
    @Test
    public void whenArrayLengthIs4AndDeleteElementWithIndex1() {
        Product[] products = new Product[4];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        int index = 1;
        Product[] result = ShopDrop.delete(products, index);
        assertThat(result[index].getName()).isEqualTo("Milk");
        assertThat(result[2].getName()).isEqualTo("Fish");
        assertThat(result[products.length - 1]).isNull();
    }

    /**
     * Тестирует удаление элемента с индексом 2 из массива длиной 5.
     *
     * <p>Ожидается, что элементы с индексами 3 и 4 сместятся на одну
     * позицию влево, а последняя ячейка станет {@code null}.</p>
     */
    @Test
    public void whenArrayLengthIs5AndDeleteElementWithIndex2() {
        Product[] products = new Product[5];
        products[0] = new Product("Bread", 4);
        products[1] = new Product("Egg", 10);
        products[2] = new Product("Milk", 2);
        products[3] = new Product("Fish", 3);
        products[4] = new Product("Fruit", 8);
        int index = 2;
        Product[] result = ShopDrop.delete(products, index);
        assertThat(result[1].getName()).isEqualTo("Egg");
        assertThat(result[index].getName()).isEqualTo("Fish");
        assertThat(result[3].getName()).isEqualTo("Fruit");
        assertThat(result[products.length - 1]).isNull();
    }
}