package ru.job4j.ex;

/**
 * Класс {@code FactorialRecursion} реализует рекурсивный алгоритм вычисления факториала числа.
 *
 * <p>До исправления содержал бесконечную рекурсию и вызывал {@link StackOverflowError},
 * так как отсутствовало условие выхода. Ошибка устранена добавлением условного ветвления.</p>
 *
 * <p>Используется для демонстрации правильной работы рекурсии с базовым случаем.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int result = FactorialRecursion.calc(3);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример результата:</b></p>
 * <pre>{@code
 * 6
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class FactorialRecursion {

    /**
     * Вычисляет факториал числа {@code n} с использованием рекурсии.
     *
     * <p>Добавлено условие выхода: {@code if (n == 0 || n == 1)} —
     * предотвращает бесконечную рекурсию и исключение {@link StackOverflowError}.</p>
     *
     * @param n число, факториал которого необходимо вычислить
     * @return факториал числа {@code n}
     */
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return calc(n - 1) * n;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Вычисляет факториал числа {@code 3} и выводит результат.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int result = calc(3);
        System.out.println(result);
    }
}
