package ru.job4j.pojo;

import java.util.Objects;

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
 * @version 1.1
 * @since 2025-04-21
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
     * Переопределенный метод {@code equals(Object o)} сравнивает продукты по имени и количеству.
     *
     * @param o Объект для сравнения.
     * @return {@code true}, если объекты равны по значению; {@code false} — в противном случае.
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
     * Переопределенный метод {@code hashCode()} возвращает хэш-код, соответствующий {@link #equals(Object)}.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, count);
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