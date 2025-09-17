package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

/**
 * Класс {@code FunctionInterfaceUsage} демонстрирует работу
 * функциональных интерфейсов из пакета {@link java.util.function}.
 *
 * <p>Рассматриваются следующие интерфейсы:
 * {@link Supplier}, {@link Consumer}, {@link BiConsumer},
 * {@link Predicate}, {@link BiPredicate}, {@link Function},
 * {@link BiFunction}, {@link UnaryOperator}, {@link BinaryOperator}.
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * demoSupplier();
 * demoConsumer();
 * demoBiConsumerSimple();
 * demoBiConsumerWithSet();
 * demoPredicate();
 * demoBiPredicate();
 * demoFunction();
 * demoBiFunction();
 * demoUnaryOperator();
 * demoBinaryOperator();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * New String For Interface
 * one
 * two
 * three
 *
 * New String For Interface
 *
 * New String For Interface and Second String
 *
 * 1 is one
 * 2 is two
 * 3 is three
 *
 * Строка пустая: true
 * Строка пустая: false
 *
 * Строка содержит подстроку: true
 * Строка содержит подстроку: false
 *
 * Третий символ в строке: r
 * Третий символ в строке: c
 *
 * Результат работы бифункции: Name 123
 * Результат работы бифункции: String number 12345
 *
 * Строка после реверса: tset rof gnirtS
 * Строка после реверса: String for test
 *
 * Строка после объединения: First string Second string
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FunctionInterfaceUsage {

    /**
     * Демонстрация {@link Supplier}: возвращает строку и множество уникальных значений.
     */
    private static void demoSupplier() {
        Supplier<String> stringSupplier = () -> "New String For Interface";
        System.out.println(stringSupplier.get());

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> setSupplier = () -> new HashSet<>(list);
        Set<String> strings = setSupplier.get();
        for (String string : strings) {
            System.out.println(string);
        }
    }

    /**
     * Демонстрация {@link Consumer}: выводит строку, полученную от {@link Supplier}.
     */
    private static void demoConsumer() {
        Supplier<String> supplier = () -> "New String For Interface";
        Consumer<String> consumer = (string) -> System.out.println(string);
        consumer.accept(supplier.get());
    }

    /**
     * Демонстрация {@link BiConsumer}: объединяет строки и выводит результат.
     */
    private static void demoBiConsumerSimple() {
        Supplier<String> supplier = () -> "New String For Interface";
        BiConsumer<String, String> consumer =
                (first, second) -> System.out.println(first + second);
        consumer.accept(supplier.get(), " and Second String");
    }

    /**
     * Демонстрация {@link BiConsumer} с множеством:
     * выводит каждое уникальное слово с порядковым номером.
     */
    private static void demoBiConsumerWithSet() {
        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> supplier = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consumer =
                (first, second) -> System.out.println(first + second);
        Set<String> strings = supplier.get();
        int i = 1;
        for (String string : strings) {
            consumer.accept(i++, " is " + string);
        }
    }

    /**
     * Демонстрация {@link Predicate}: проверяет, пустая ли строка.
     */
    private static void demoPredicate() {
        Predicate<String> predicate = string -> string.isEmpty();
        System.out.println("Строка пустая: " + predicate.test(""));
        System.out.println("Строка пустая: " + predicate.test("test"));
    }

    /**
     * Демонстрация {@link BiPredicate}: проверяет,
     * содержит ли строка число как подстроку.
     */
    private static void demoBiPredicate() {
        BiPredicate<String, Integer> condition =
                (string, number) -> string.contains(number.toString());
        System.out.println("Строка содержит подстроку: "
                + condition.test("Name123", 123));
        System.out.println("Строка содержит подстроку: "
                + condition.test("Name", 123));
    }

    /**
     * Демонстрация {@link Function}: возвращает символ по индексу.
     */
    private static void demoFunction() {
        Function<String, Character> function = string -> string.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));
    }

    /**
     * Демонстрация {@link BiFunction}: объединяет строку и число.
     */
    private static void demoBiFunction() {
        BiFunction<String, Integer, String> biFunction =
                (string, number) -> string
                        .concat(" ")
                        .concat(number.toString());
        System.out.println("Результат работы бифункции: "
                + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: "
                + biFunction.apply("String number", 12345));
    }

    /**
     * Демонстрация {@link UnaryOperator}: реверс строки.
     */
    private static void demoUnaryOperator() {
        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: "
                + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: "
                + builder.apply(new StringBuilder("tset rof gnirtS")));
    }

    /**
     * Демонстрация {@link BinaryOperator}: объединение двух строк.
     */
    private static void demoBinaryOperator() {
        BinaryOperator<StringBuilder> builder =
                (first, second) -> first.append(" ").append(second);
        System.out.println(
                "Строка после объединения: " + builder.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }

    /**
     * Точка входа в программу.
     *
     * <p>Вызывает все демонстрационные методы:</p>
     * <ul>
     *     <li>{@link #demoSupplier()}</li>
     *     <li>{@link #demoConsumer()}</li>
     *     <li>{@link #demoBiConsumerSimple()}</li>
     *     <li>{@link #demoBiConsumerWithSet()}</li>
     *     <li>{@link #demoPredicate()}</li>
     *     <li>{@link #demoBiPredicate()}</li>
     *     <li>{@link #demoFunction()}</li>
     *     <li>{@link #demoBiFunction()}</li>
     *     <li>{@link #demoUnaryOperator()}</li>
     *     <li>{@link #demoBinaryOperator()}</li>
     * </ul>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        demoSupplier();
        demoConsumer();
        demoBiConsumerSimple();
        demoBiConsumerWithSet();
        demoPredicate();
        demoBiPredicate();
        demoFunction();
        demoBiFunction();
        demoUnaryOperator();
        demoBinaryOperator();
    }
}
