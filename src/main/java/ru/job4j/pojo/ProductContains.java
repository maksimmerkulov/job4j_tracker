package ru.job4j.pojo;

/**
 * Класс {@code ProductContains} демонстрирует сравнение двух объектов типа {@link Product}
 * с помощью метода {@link Product#equals(Object)}, который сравнивает содержимое объектов.
 *
 * <p>Создаются два экземпляра {@link Product} с одинаковыми значениями полей и производится сравнение через
 * {@link Product#equals(Object)}. В результате возвращается {@code true}, так как метод {@link Product#equals(Object)}
 * переопределен для сравнения по содержимому полей {@code name} и {@code count}.</p>
 *
 * <p>Если бы использовался оператор {@code ==}, результат был бы {@code false}, так как сравниваются ссылки,
 * а не содержимое объектов.</p>
 *
 * <pre>{@code
 * Product first = new Product("Milk", 100);
 * Product second = new Product("Milk", 100);
 * boolean isEqual = first.equals(second);    true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-21
 */
public class ProductContains {

    /**
     * Метод {@code main(String[] args)} является точкой входа в программу.
     *
     * <p>Создает два объекта {@link Product} с одинаковыми значениями полей.
     * Демонстрирует разницу между:</p>
     * <ul>
     *     <li>{@code ==} — сравнение ссылок (результат {@code false})</li>
     *     <li>{@code equals()} — сравнение содержимого (результат {@code true})</li>
     * </ul>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Product first = new Product("Milk", 100);
        Product second = new Product("Milk", 100);
        boolean isEqual = first.equals(second);
        System.out.println(isEqual);
    }
}