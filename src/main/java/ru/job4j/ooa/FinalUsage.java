package ru.job4j.ooa;

/**
 * Класс {@code FinalUsage} демонстрирует использование ключевого слова {@code final}
 * для объявления неизменяемой константы.
 *
 * <p>Константа {@code NAME} не может быть переопределена и используется для вывода имени в консоль.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FinalUsage.main(new String[]{});
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Maksim
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FinalUsage {

    /**
     * Неизменяемое имя пользователя.
     */
    private static final String NAME = "Maksim";

    /**
     * Точка входа в программу.
     *
     * <p>Выводит значение константы {@code NAME} в консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        System.out.println(NAME);
    }
}