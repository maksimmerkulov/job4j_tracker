package ru.job4j.max;

/**
 * Класс {@code Reduce} демонстрирует сохранение массива в поле класса
 * и его последующий вывод на экран.
 *
 * <p>Используется для демонстрации работы с массивами: сохранения и вывода
 * их содержимого. Метод {@link #to(int[])} сохраняет массив в объекте,
 * а метод {@link #print()} выводит элементы массива в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * int[] array = {1, 2, 3};
 * Reduce reduce = new Reduce();
 * reduce.to(array);
 * reduce.print();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 1
 * 2
 * 3
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Reduce {

    /**
     * Массив целых чисел, сохраняемый в объекте.
     */
    private int[] array;

    /**
     * Сохраняет переданный массив в поле класса {@code array}.
     *
     * @param array массив целых чисел, который нужно сохранить
     */
    public void to(int[] array) {
        this.array = array;
    }

    /**
     * Выводит на экран все элементы массива,
     * сохраненного в поле класса {@code array}.
     */
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    /**
     * Демонстрирует работу методов {@link #to(int[])} и {@link #print()}.
     *
     * <p>Создает массив из трех чисел, сохраняет его в объекте класса
     * {@code Reduce}, затем выводит все элементы массива в консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
