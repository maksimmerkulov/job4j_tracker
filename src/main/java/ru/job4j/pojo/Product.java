package ru.job4j.pojo;

import java.util.Objects;

/**
 * Класс {@code Product} представляет продукт с названием и количеством.
 *
 * <p>Может использоваться для моделирования продуктов на складе,
 * в магазине или в приложении учета инвентаря.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product milk = new Product("Milk", 10);
 * Product bread = new Product("Bread", 4);
 * Product egg = new Product("Egg", 19);
 * Product[] products = new Product[3];
 * products[0] = milk;
 * products[1] = bread;
 * products[2] = egg;
 *
 * for (int index = 0; index < products.length; index++) {
 *     Product product = products[index];
 *     System.out.println(product.getName() + " - " + product.getCount());
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Milk - 10
 * Bread - 4
 * Egg - 19
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Product {

    /**
     * Название продукта.
     */
    private String name;

    /**
     * Количество продукта.
     */
    private int count;

    /**
     * Создает новый экземпляр класса {@code Product}
     * с указанным названием и количеством.
     *
     * @param name  Название продукта.
     * @param count Количество продукта.
     */
    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    /**
     * Возвращает название продукта.
     *
     * @return Строка с названием продукта.
     */
    public String getName() {
        return name;
    }

    /**
     * Устанавливает название продукта.
     *
     * @param name Новое название продукта.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Возвращает количество продукта.
     *
     * @return Количество продукта.
     */
    public int getCount() {
        return count;
    }

    /**
     * Устанавливает количество продукта.
     *
     * @param count Новое количество продукта.
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Сравнивает продукты по имени и количеству.
     *
     * @param o Объект для сравнения.
     * @return Значение {@code true}, если объекты равны по значению;
     *         значение {@code false} — в противном случае.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return count == product.count && Objects.equals(name, product.name);
    }

    /**
     * Возвращает хэш-код, соответствующий {@link #equals(Object)}.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}