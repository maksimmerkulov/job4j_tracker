package ru.job4j.ex;

/**
 * Класс {@code FindEl} реализует функциональность поиска строки в массиве
 * и проверку на наличие в списке запрещенных значений.
 *
 * <p>Если строка не найдена, выбрасывается исключение {@link ElementNotFoundException}.</p>
 *
 * <p>Если строка найдена, но она запрещена, выбрасывается {@link ElementAbuseException}.</p>
 *
 * <p><b>Сценарии использования:</b></p>
 * <ul>
 *     <li>Поиск строки в массиве значений;</li>
 *     <li>Проверка строки на соответствие списку запрещенных значений.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * String[] values = {"cat", "dog", "bird"};
 * String[] abuses = {"cat", "dog"};
 * String key = "dog";
 * try {
 *     int index = indexOf(values, key);
 *     System.out.println("Индекс: " + index);
 *     process(values, key, abuses);
 * } catch (ElementNotFoundException e) {
 *     e.printStackTrace();
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Индекс: 1
 * ru.job4j.ex.ElementAbuseException: Element is abusive: dog
 *     at ru.job4j.ex.FindEl.sent(FindEl.java:80)
 *     at ru.job4j.ex.FindEl.process(FindEl.java:99)
 *     at ru.job4j.ex.FindEl.main(FindEl.java:124)
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.2
 */
public class FindEl {

    /**
     * Выполняет поиск указанной строки в массиве.
     *
     * <p>Если строка найдена в массиве, метод возвращает ее индекс.</p>
     *
     * @param value массив строк для поиска
     * @param key строка, которую нужно найти
     * @return индекс строки в массиве
     * @throws ElementNotFoundException если элемент не найден
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
     * Проверяет, не входит ли значение в список запрещенных слов.
     *
     * <p>Если значение содержится в массиве {@code abuses}, выбрасывается исключение.</p>
     *
     * @param value значение для проверки
     * @param abuses список запрещенных слов
     * @return {@code true}, если значение допустимо
     * @throws ElementAbuseException если значение считается недопустимым
     */
    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (value.equals(abuse)) {
                throw new ElementAbuseException("Element is abusive: " + value);
            }
        }
        return true;
    }

    /**
     * Выполняет проверку ключа в массиве и анализирует его на запрещенность.
     *
     * <p>Если элемент найден и является запрещенным, выбрасываются соответствующие исключения.
     * Все исключения перехватываются и печатаются в консоль.</p>
     *
     * @param values массив строк для поиска
     * @param key ключ для поиска
     * @param abuses список запрещенных слов
     */
    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (ElementAbuseException ea) {
            ea.printStackTrace();
        } catch (ElementNotFoundException en) {
            en.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Использует конструкцию {@code try-catch} для обработки исключения {@link ElementNotFoundException}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        String[] values = {"cat", "dog", "bird"};
        String[] abuses = {"cat", "dog"};
        String key = "dog";
        try {
            int index = indexOf(values, key);
            System.out.println("Индекс: " + index);
            process(values, key, abuses);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
