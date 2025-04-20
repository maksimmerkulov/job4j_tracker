package ru.job4j.pojo;

/**
 * Класс {@code ShopDrop} предоставляет метод для удаления товара из массива с последующим смещением элементов.
 *
 * <p>Может использоваться для управления списком товаров в магазине или на складе.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Product[] products = new Product[3];
 * products[0] = new Product("Milk", 10);
 * products[1] = new Product("Bread", 4);
 * products[2] = new Product("Egg", 19);
 * ShopDrop.delete(products, 1);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-20
 */
public class ShopDrop {

    /**
     * Метод {@code delete(Product[] products, int index)} удаляет элемент массива по заданному индексу,
     * сдвигая последующие элементы влево. Последняя ячейка массива обнуляется.
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
     * Метод {@code main(String[] args)} является точкой входа в программу.
     * <p>
     * Демонстрирует удаление элемента из массива товаров по индексу
     * с последующим смещением элементов влево и обнулением последней ячейки.
     * </p>
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
    }
}