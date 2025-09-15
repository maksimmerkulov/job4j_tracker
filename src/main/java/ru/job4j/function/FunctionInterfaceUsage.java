package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.*;

/**
 * Demonstrates the usage of functional interfaces
 * from {@link java.util.function}.
 *
 * <p>Example output for {@code demoSupplier}:
 * <pre>{@code
 * New String For Interface
 * one
 * two
 * three
 * }</pre>
 *
 * <p>Example output for {@code demoConsumer}:
 * <pre>{@code
 * New String For Interface
 * }</pre>
 *
 * <p>Example output for {@code demoBiConsumerSimple}:
 * <pre>{@code
 * New String For Interface and Second String
 * }</pre>
 *
 * <p>Example output for {@code demoBiConsumerWithSet}:
 * <pre>{@code
 * 1 is one
 * 2 is two
 * 3 is three
 * }</pre>
 *
 * <p>Example output for {@code demoPredicate}:
 * <pre>{@code
 * String empty: true
 * String empty: false
 * }</pre>
 *
 * <p>Example output for {@code demoBiPredicate}:
 * <pre>{@code
 * String contains substring: true
 * String contains substring: false
 * }</pre>
 *
 * <p>Example output for {@code demoFunction}:
 * <pre>{@code
 * Third character: r
 * Character: c
 * }</pre>
 *
 * <p>Example output for {@code demoBiFunction}:
 * <pre>{@code
 * Result of BiFunction: Name 123
 * Result of BiFunction: String number 12345
 * }</pre>
 *
 * <p>Example output for {@code demoUnaryOperator}:
 * <pre>{@code
 * Reversed string: tset rof gnirtS
 * Reversed string: String for test
 * }</pre>
 *
 * <p>Example output for {@code demoBinaryOperator}:
 * <pre>{@code
 * Joined string: First string Second string
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FunctionInterfaceUsage {

    /**
     * Demonstrates {@link Supplier}.
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
     * Demonstrates {@link Consumer}.
     */
    private static void demoConsumer() {
        Supplier<String> supplier = () -> "New String For Interface";
        Consumer<String> consumer = System.out::println;
        consumer.accept(supplier.get());
    }

    /**
     * Demonstrates {@link BiConsumer}.
     */
    private static void demoBiConsumerSimple() {
        Supplier<String> supplier = () -> "New String For Interface";
        BiConsumer<String, String> consumer =
                (first, second) -> System.out.println(first + second);
        consumer.accept(supplier.get(), " and Second String");
    }

    /**
     * Demonstrates {@link BiConsumer} with a set.
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
     * Demonstrates {@link Predicate}.
     */
    private static void demoPredicate() {
        Predicate<String> predicate = String::isEmpty;
        System.out.println("String empty: " + predicate.test(""));
        System.out.println("String empty: " + predicate.test("test"));
    }

    /**
     * Demonstrates {@link BiPredicate}.
     */
    private static void demoBiPredicate() {
        BiPredicate<String, Integer> condition =
                (string, number) -> string.contains(number.toString());
        System.out.println("String contains substring: "
                + condition.test("Name123", 123));
        System.out.println("String contains substring: "
                + condition.test("Name", 123));
    }

    /**
     * Demonstrates {@link Function}.
     */
    private static void demoFunction() {
        Function<String, Character> function = string -> string.charAt(2);
        System.out.println("Third character: " + function.apply("first"));
        System.out.println("Third character: " + function.apply("second"));
    }

    /**
     * Demonstrates {@link BiFunction}.
     */
    private static void demoBiFunction() {
        BiFunction<String, Integer, String> biFunction =
                (string, number) -> string
                        .concat(" ")
                        .concat(number.toString());
        System.out.println("Result of BiFunction: "
                + biFunction.apply("Name", 123));
        System.out.println("Result of BiFunction: "
                + biFunction.apply("String number", 12345));
    }

    /**
     * Demonstrates {@link UnaryOperator}.
     */
    private static void demoUnaryOperator() {
        UnaryOperator<StringBuilder> builder = StringBuilder::reverse;
        System.out.println("Reversed string: "
                + builder.apply(new StringBuilder("String for test")));
        System.out.println("Reversed string: "
                + builder.apply(new StringBuilder("tset rof gnirtS")));
    }

    /**
     * Demonstrates {@link BinaryOperator}.
     */
    private static void demoBinaryOperator() {
        BinaryOperator<StringBuilder> builder =
                (first, second) -> first.append(" ").append(second);
        System.out.println(
                "Joined string: " + builder.apply(
                        new StringBuilder("First string"),
                        new StringBuilder("Second string")
                )
        );
    }

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
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
