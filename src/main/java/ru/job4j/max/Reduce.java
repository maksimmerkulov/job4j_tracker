package ru.job4j.max;

/**
 * Класс {@code Reduce} демонстрирует сохранение массива в поле класса
 * и его последующий вывод на экран.
 *
 * <p>Метод {@link #to(int[])} используется для записи массива,
 * переданного в качестве аргумента, в поле класса.</p>
 *
 * <p>Метод {@link #print()} выводит элементы сохраненного массива
 * на экран в порядке их расположения.</p>
 *
 * <p>Пример использования:
 * <pre>
 * int[] data = {1, 2, 3};
 * Reduce reduce = new Reduce();
 * reduce.to(data);
 * reduce.print();
 *
 * Вывод:
 * 1
 * 2
 * 3
 * </pre>
 * </p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-06
 */
public class Reduce {

    /**
     * Поле {@code array} представляет массив целых чисел, сохраняемый в объекте.
     */
    private int[] array;

    /**
     * Метод {@code to(int[] array)} сохраняет переданный массив в поле класса {@code array}.
     *
     * @param array Массив целых чисел, который нужно сохранить.
     */
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Метод {@code print()} выводит на экран все элементы массива,
     * сохраненного в поле класса {@code array}.
     */
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует работу методов {@link #to(int[])} и {@link #print()}.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}