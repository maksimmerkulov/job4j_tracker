package ru.job4j.pojo;

/**
 * Класс {@code ProductContains} демонстрирует сравнение объектов {@link Product}
 * методом {@link Product#equals(Object)}.
 *
 * <p>Создает два продукта с одинаковыми полями и сравнивает их с помощью {@link Product#equals(Object)}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product first = new Product("Milk", 100);
 * Product second = new Product("Milk", 100);
 * boolean isEqual = first.equals(second);
 *
 * System.out.println(isEqual);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ProductContains {

    /**
     * Точка входа в программу.
     *
     * <p>Создает два экземпляра класса {@link Product} с одинаковыми данными,
     * сравнивает их методом {@link Product#equals(Object)} и выводит результат сравнения.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean isEqual = first.equals(second);
        System.out.println(isEqual);
    }
}
