package ru.job4j.pojo;

/**
 * Класс {@code ShopDrop} реализует логику удаления элемента из массива объектов {@link Product}
 * с последующим сдвигом элементов влево.
 *
 * <p>Метод {@link #delete(Product[], int)} сдвигает элементы массива после заданного индекса
 * влево и обнуляет последнюю ячейку.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Удаление товара из массива по индексу.</li>
 *     <li>Обработка массива с последующим выводом на экран.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product[] products = new Product[3];
 * products[0] = new Product("Milk", 10);
 * products[1] = new Product("Bread", 4);
 * products[2] = new Product("Egg", 19);
 *
 * products = ShopDrop.delete(products, 1);
 * for (int i = 0; i < products.length; i++) {
 *     Product product = products[i];
 *     if (product != null) {
 *         System.out.println(product.getName());
 *     } else {
 *         System.out.println("null");
 *     }
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Milk
 * Egg
 * null
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ShopDrop {

    /**
     * Удаляет элемент массива по заданному индексу, сдвигая последующие элементы влево.
     * Последняя ячейка массива обнуляется.
     *
     * @param products Массив товаров.
     * @param index Индекс удаляемого элемента.
     * @return Обновленный массив товаров.
     */
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует удаление элемента из массива товаров по индексу с последующим
     * смещением элементов влево и обнулением последней ячейки.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }
        products[1] = products[2];
        products[2] = null;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        products = delete(products, 1);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}