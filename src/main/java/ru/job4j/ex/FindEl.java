package ru.job4j.ex;

/**
 * Класс {@code FindEl} реализует функциональность поиска строки в массиве.
 *
 * <p>Если строка не найдена, выбрасывается исключение {@link ElementNotFoundException}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] values = {"cat", "dog", "bird"};
 * String key = "dog";
 * try {
 *     int index = indexOf(values, key);
 *     System.out.println("Индекс: " + index);
 * } catch (ElementNotFoundException e) {
 *     e.printStackTrace();
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Индекс: 1
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FindEl {

    /**
     * Выполняет поиск указанной строки в массиве.
     *
     * <p>Если строка найдена в массиве, метод возвращает ее индекс.</p>
     *
     * @param value Массив строк для поиска.
     * @param key Строка, которую нужно найти.
     * @return Индекс строки в массиве.
     * @throws ElementNotFoundException если элемент не найден.
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return result;
    }

    /**
     * Точка входа в программу.
     *
     * <p>Использует конструкцию {@code try-catch} для обработки исключения {@link ElementNotFoundException}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] values = {"cat", "dog", "bird"};
        String key = "dog";
        try {
            int index = indexOf(values, key);
            System.out.println("Индекс: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}