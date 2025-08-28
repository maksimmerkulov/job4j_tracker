package ru.job4j.ooa;

/**
 * Класс {@code FinalUsage} демонстрирует использование ключевого слова {@code final}
 * для объявления неизменяемых полей и констант.
 *
 * <p>Константа {@code NAME} не может быть переопределена и используется для вывода имени в консоль.
 * Константа {@code DEFAULT_STORE_CAPACITY} может использоваться для предустановленных значений,
 * например, в конфигурации хранилища или буфера.</p>
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
 * @version 1.1
 */
public class FinalUsage {

    /**
     * Неизменяемое имя пользователя.
     */
    private static final String NAME = "Maksim";

    /**
     * Значение по умолчанию для емкости хранилища.
     */
    private static final int DEFAULT_STORE_CAPACITY = 100;

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
