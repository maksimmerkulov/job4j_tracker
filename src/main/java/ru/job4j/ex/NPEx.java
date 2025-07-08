package ru.job4j.ex;

/**
 * Класс {@code NPEx} демонстрирует типичную ошибку {@link NullPointerException},
 * возникающую при вызове метода у {@code null}-ссылки.
 *
 * <p>Используется для показа необходимости предварительной проверки переменной на {@code null}
 * перед обращением к ее методам или полям.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * NPEx.main(new String[0]);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Petr Arsentev has a size : 14
 * }</pre>
 *
 * <p><b>Что происходит:</b></p>
 * <ul>
 *   <li>Первый элемент массива содержит строку — ее длина успешно выводится.</li>
 *   <li>Остальные элементы равны {@code null}, поэтому метод {@code length()} у них не вызывается.</li>
 * </ul>
 *
 * <p><b>Пример некорректного кода, вызывающего исключение {@link NullPointerException}:</b></p>
 * <pre>{@code
 * System.out.println(element.length());
 * }</pre>
 *
 * <p><b>Правильный вариант:</b></p>
 * <pre>{@code
 * if (element != null) {
 *     System.out.println(element.length());
 * }
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class NPEx {

    /**
     * Точка входа в программу.
     *
     * <p>Выводит имя и его длину для каждого элемента массива.</p>
     *
     * <p>Проверяет элементы массива на {@code null}, чтобы избежать {@link NullPointerException}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        String[] shops = new String[5];
        shops[0] = "Petr Arsentev";
        for (int index = 0; index < shops.length; index++) {
            String element = shops[index];
            if (element != null) {
                System.out.println(element + " has a size : " + element.length());
            }
        }
    }
}