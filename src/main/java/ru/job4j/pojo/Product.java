package ru.job4j.pojo;

/**
 * Класс {@code Product} представляет товар с названием и количеством.
 *
 * <p>Может использоваться для моделирования товаров на складе,
 * в магазине или в приложении учета инвентаря.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product product = new Product("Milk", 10);
 * String name = product.getName();
 * int count = product.getCount();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-19
 */
public class Product {

    /**
     * Поле {@code name} содержит название продукта.
     */
    private String name;

    /**
     * Поле {@code count} содержит количество продукта.
     */
    private int count;

    /**
     * Конструктор {@code Product(String name, int count)} создает новый экземпляр продукта.
     *
     * @param name  Название продукта.
     * @param count Количество продукта.
     */
    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    /**
     * Метод {@code getName()} возвращает название продукта.
     *
     * @return Значение поля {@code name}.
     */
    public String getName() {
        return name;
    }

    /**
     * Метод {@code setName(String name)} устанавливает новое название продукта.
     *
     * @param name Новое значение поля {@code name}.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод {@code getCount()} возвращает количество продукта.
     *
     * @return Значение поля {@code count}.
     */
    public int getCount() {
        return count;
    }

    /**
     * Метод {@code setCount(int count)} устанавливает новое количество продукта.
     *
     * @param count Новое значение поля {@code count}.
     */
    public void setCount(int count) {
        this.count = count;
    }
}