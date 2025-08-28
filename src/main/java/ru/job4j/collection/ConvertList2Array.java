package ru.job4j.collection;

import java.util.List;

/**
 * Класс {@code ConvertList2Array} предназначен для преобразования
 * списка целых чисел в двумерный массив фиксированной ширины.
 *
 * <p>Если в последней строке не хватает значений,
 * оставшиеся ячейки заполняются нулями.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
 * int[][] result = ConvertList2Array.toArray(list, 3);
 * }</pre>
 *
 * <p><b>Ожидаемый вывод:</b></p>
 * <pre>{@code
 * 1 2 3
 * 4 5 6
 * 7 0 0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class ConvertList2Array {

    /**
     * Преобразует список чисел в двумерный массив.
     *
     * <p>Размер строк определяется параметром {@code cells} — количество столбцов.</p>
     * <p>Количество строк вычисляется автоматически с округлением вверх.</p>
     *
     * @param list список чисел для преобразования
     * @param cells количество ячеек в каждой строке (то есть столбцов)
     * @return двумерный массив, в который скопированы все элементы списка;
     *         недостающие ячейки заполняются значением по умолчанию (нулями)
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0;
        int cell = 0;
        for (Integer number : list) {
            array[row][cell] = number;
            cell++;
            if (cell == cells) {
                cell = 0;
                row++;
            }
        }
        return array;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу метода {@link #toArray(List, int)}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] result = toArray(list, 3);
        for (int[] row : result) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
