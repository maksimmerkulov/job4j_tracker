package ru.job4j.ex;

/**
 * Класс {@code Factorial} вычисляет факториал числа.
 *
 * <p>Используется для демонстрации цикла с накоплением произведения и обработки некорректного ввода.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Factorial factorial = new Factorial();
 * int result = factorial.calc(5);
 * System.out.println(result);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 120
 * }</pre>
 *
 * <p>Если передано отрицательное число, выбрасывается {@link IllegalArgumentException}.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Factorial {

    /**
     * Вычисляет факториал числа {@code number}.
     *
     * <p>Факториал — это произведение всех натуральных чисел от {@code 1} до {@code number}.
     * Метод не поддерживает отрицательные числа. Используется цикл от {@code 2} до {@code number} включительно.</p>
     *
     * @param number число, факториал которого необходимо вычислить
     * @return факториал числа
     * @throws IllegalArgumentException если {@code number < 0}
     */
    public int calc(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number could not be less than 0");
        }
        int result = 1;
        for (int index = 2; index <= number; index++) {
            result *= index;
        }
        return result;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Вызывает метод {@link #calc(int)} с примером неправильного ввода.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        new Factorial().calc(-1);
    }
}
