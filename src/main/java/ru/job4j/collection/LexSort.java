package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс {@code LexSort} реализует компаратор для строк,
 * представляющих задачи в формате {@code "number. text."}.
 *
 * <p>Сравнение выполняется по числовому значению
 * начального номера задачи.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] tasks = {
 *     "10. Fix bug.",
 *     "1. Implement feature.",
 *     "2. Write tests."
 * };
 * Arrays.sort(tasks, new LexSort());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * [1. Implement feature., 2. Write tests., 10. Fix bug.]
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class LexSort implements Comparator<String> {

    /**
     * Сравнивает две строки, представляющие задачи в формате
     * {@code "number. text."}, по их числовому номеру.
     *
     * <p>Алгоритм работы:</p>
     * <ol>
     *   <li>Разделяет каждую строку по символу точки ({@code "."}).</li>
     *   <li>Берет первую часть до точки — это номер задачи.</li>
     *   <li>Преобразует номер в число с помощью {@link Integer#parseInt(String)}.</li>
     *   <li>Сравнивает два числа через {@link Integer#compare(int, int)}.</li>
     * </ol>
     *
     * @param left  строка с номером и текстом задачи
     * @param right строка с номером и текстом задачи
     * @return отрицательное число, если {@code left < right};
     *         ноль, если {@code left == right};
     *         положительное число, если {@code left > right}
     * @throws NumberFormatException если номер задачи не удается преобразовать в число
     */
    @Override
    public int compare(String left, String right) {
        String[] leftParts = left.split("\\.");
        String[] rightParts = right.split("\\.");
        int leftNum = Integer.parseInt(leftParts[0]);
        int rightNum = Integer.parseInt(rightParts[0]);
        return Integer.compare(leftNum, rightNum);
    }
}
