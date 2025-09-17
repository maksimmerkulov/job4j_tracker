package ru.job4j.function;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Класс {@code StrategyUsage} демонстрирует применение стратегий
 * с использованием функциональных интерфейсов {@link Predicate} и {@link Function}.
 *
 * <p>Метод {@link #check(Predicate, String)} используется для проверки строки
 * по условию, переданному через {@link Predicate}.
 * Метод {@link #transform(Function, String)} выполняет преобразование строки
 * через {@link Function}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * StrategyUsage usage = new StrategyUsage();
 *
 * boolean isEmpty = usage.check(string -> string.isEmpty(), "");
 * boolean startsWith = usage.check(
 *         string -> string.startsWith("Fun"),
 *         "Functional interface"
 * );
 * boolean contains = usage.check(
 *         string -> string.contains("rn"),
 *         "Surname Name"
 * );
 *
 * String upper = usage.transform(
 *         string -> string.toUpperCase(),
 *         "aBCdEfghKLmnpRstU"
 * );
 * String concat = usage.transform(
 *         string -> string.concat("работает корректно."),
 *         "Строка после преобразования: "
 * );
 * String trimmed = usage.transform(
 *         string -> string.trim(),
 *         "    aBC dEfghK Lmnp RstU        "
 * );
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Результат работы: true
 * Результат работы: true
 * Результат работы: true
 *
 * Строка после преобразования: ABCDEFGHKLMNPRSTU
 * Строка после преобразования: работает корректно.
 * Строка после преобразования: aBC dEfghK Lmnp RstU
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class StrategyUsage {

    /**
     * Проверяет строку на соответствие условию.
     *
     * @param predicate условие для проверки
     * @param string    проверяемая строка
     * @return {@code true}, если строка удовлетворяет условию,
     *         иначе {@code false}
     */
    public boolean check(Predicate<String> predicate, String string) {
        return predicate.test(string);
    }

    /**
     * Преобразует строку по заданной функции.
     *
     * @param function функция преобразования
     * @param string   исходная строка
     * @return преобразованная строка
     */
    public String transform(Function<String, String> function, String string) {
        return function.apply(string);
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует работу методов {@link #check(Predicate, String)}
     * и {@link #transform(Function, String)} с различными лямбда-выражениями.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        string -> string.contains("rn"), "Surname Name"
                )
        );

        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        string -> string.toUpperCase(), "aBCdEfghKLmnpRstU"
                )
        );
        System.out.println(
                usage.transform(
                        string -> string.concat("работает корректно."),
                        "Строка после преобразования: "
                )
        );
        System.out.println(
                "Строка после преобразования: " + usage.transform(
                        string -> string.trim(), "    aBC dEfghK Lmnp RstU        "
                )
        );
    }
}
