package ru.job4j.ex;

/**
 * Класс {@code FindEl} реализует поиск строки в массиве.
 *
 * <p>Если элемент не найден, выбрасывается исключение {@link ElementNotFoundException}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] value = {"cat", "dog", "bird"};
 * int index = FindEl.indexOf(value, "dog");
 * System.out.println("Индекс: " + index);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Индекс: 1
 * }</pre>
 *
 * <p><b>Пример с выброшенным исключением:</b></p>
 * <pre>{@code
 * ru.job4j.ex.ElementNotFoundException: Element not found
 *     at ru.job4j.ex.FindEl.indexOf(FindEl.java:...)
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
     * @param value массив строк для поиска.
     * @param key строка, которую нужно найти.
     * @return индекс строки в массиве.
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
     * Демонстрирует использование метода {@link #indexOf(String[], String)}.
     *
     * <p>Использует конструкцию try-catch для обработки исключения {@link ElementNotFoundException}.</p>
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] value = {"cat", "dog", "bird"};
        String key = "dog";
        try {
            int index = indexOf(value, key);
            System.out.println("Индекс: " + index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}