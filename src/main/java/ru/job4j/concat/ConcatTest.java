package ru.job4j.concat;

/**
 * Класс {@code ConcatTest} демонстрирует производительность при конкатенации строк
 * с использованием {@link StringBuilder}.
 *
 * <p>Программа замеряет время выполнения цикла, в котором происходит последовательное
 * добавление чисел к строке. Это позволяет оценить эффективность использования
 * {@link StringBuilder} по сравнению с обычной строкой {@link String}.</p>
 *
 * <p>Пример использования:</p>
 * <pre>{@code
 * long startTime = System.currentTimeMillis();
 * StringBuilder builder = new StringBuilder("Job4j");
 * for (int index = 0; index < 9999; index++) {
 *     builder.append(index);
 * }
 *
 * System.out.println("Миллисекунд: "
 *         + (System.currentTimeMillis() - startTime));
 * }</pre>
 *
 * <p>Пример вывода:</p>
 * <pre>{@code
 * Миллисекунд: 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ConcatTest {

    /**
     * Точка входа в программу.
     *
     * <p>Создает строку с помощью {@link StringBuilder}, к которой последовательно добавляются числа от 0 до 9998.
     * В конце программа выводит количество миллисекунд, затраченных на выполнение операции.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            builder.append(index);
        }
        System.out.println("Миллисекунд: "
                + (System.currentTimeMillis() - startTime));
    }
}
