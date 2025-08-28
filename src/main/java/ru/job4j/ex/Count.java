package ru.job4j.ex;

/**
 * Класс {@code Count} выполняет подсчет суммы чисел в заданном диапазоне.
 *
 * <p>Используется для демонстрации выбрасывания исключения {@link IllegalArgumentException}
 * при некорректных входных данных — если {@code start > finish}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int sum = Count.add(2, 10);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Sum of 2 to 10 is : 44
 * }</pre>
 *
 * <p><b>Пример некорректного кода, вызывающего исключение:</b></p>
 * <pre>{@code
 * Count.add(10, 2);
 * }</pre>
 * <p>Выбросит {@link IllegalArgumentException} с сообщением:</p>
 * <pre>{@code
 * Start should be less than finish.
 * }</pre>
 *
 * <p><b>Правильный вариант с проверкой:</b></p>
 * <pre>{@code
 * if (start > finish) {
 *     throw new IllegalArgumentException("Start should be less than finish.");
 * }
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Count {

    /**
     * Вычисляет сумму целых чисел от {@code start} (включительно) до {@code finish} (исключительно).
     *
     * <p>Если {@code start > finish}, выбрасывается исключение {@link IllegalArgumentException}.</p>
     *
     * @param start начало диапазона (включительно)
     * @param finish конец диапазона (исключительно)
     * @return сумма всех чисел от {@code start} до {@code finish - 1}
     * @throws IllegalArgumentException если {@code start > finish}
     */
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than finish.");
        }
        int result = 0;
        for (int index = start; index != finish; index++) {
            result += index;
        }
        return result;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует поведение метода {@link #add(int, int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is : " + add(10, 2));
    }
}
