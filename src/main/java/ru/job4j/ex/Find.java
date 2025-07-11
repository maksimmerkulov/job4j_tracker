package ru.job4j.ex;

/**
 * Класс {@code Find} предоставляет метод для получения элемента массива по индексу.
 *
 * <p>Используется для извлечения строки из массива по заданному индексу с предварительной
 * проверкой границ массива.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] data = {"apple", "banana", "cherry"};
 * String result = Find.get(data, 1);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * banana
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Find {

    /**
     * Возвращает элемент массива по указанному индексу.
     *
     * <p>Метод предварительно проверяет, что индекс находится в допустимых границах. В противном случае
     * генерируется исключение {@link IllegalArgumentException} с соответствующим сообщением.</p>
     *
     * @param data  Массив строк, из которого извлекается элемент.
     * @param index Индекс искомого элемента.
     * @return Строка из массива по заданному индексу.
     * @throws IllegalArgumentException если индекс меньше 0 или больше либо равен длине массива.
     */
    public static String get(String[] data, int index) {
        if (index < 0 || index >= data.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return data[index];
    }
}