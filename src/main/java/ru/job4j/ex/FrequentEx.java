package ru.job4j.ex;

/**
 * Класс {@code FrequentEx} демонстрирует перебор элементов массива строк с выводом на консоль.
 *
 * <p>Используется для демонстрации ошибки {@link ArrayIndexOutOfBoundsException}
 * и ее устранения через корректное условие цикла.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FrequentEx.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Ebay
 * Amazon
 * Ozon
 * }</pre>
 *
 * <p><b>Пример некорректного кода, вызывающего исключение:</b></p>
 * <pre>{@code
 * for (int index = 0; index <= shops.length; index++) {
 *     System.out.println(shops[index]);
 * }
 * }</pre>
 *
 * <p><b>Правильный вариант:</b></p>
 * <pre>{@code
 * for (int index = 0; index < shops.length; index++) {
 *     System.out.println(shops[index]);
 * }
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class FrequentEx {

    /**
     * Точка входа в программу.
     *
     * <p>Печатает все элементы массива {@code shops}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (int index = 0; index < shops.length; index++) {
            System.out.println(shops[index]);
        }
    }
}
