package ru.job4j.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

/**
 * Класс {@code FunctionalInterfaces} демонстрирует использование
 * встроенных функциональных интерфейсов Java: {@link BiConsumer},
 * {@link BiPredicate}, {@link Supplier}, {@link Function}, {@link Consumer}.
 *
 * <p>В программе создается {@link Map}, значения которого обрабатываются
 * через функциональные интерфейсы для вставки, фильтрации и преобразования.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Map<Integer, String> map = new HashMap<>();
 * BiConsumer<Integer, String> biConsumer =
 *         (key, value) -> map.put(key, value);
 * biConsumer.accept(1, "one");
 * biConsumer.accept(2, "two");
 * biConsumer.accept(3, "three");
 * biConsumer.accept(4, "four");
 * biConsumer.accept(5, "five");
 * biConsumer.accept(6, "six");
 * biConsumer.accept(7, "seven");
 *
 * BiPredicate<Integer, String> biPredicate =
 *         (key, value) -> key % 2 == 0
 *                         || value.length() == 4;
 * for (Integer key : map.keySet()) {
 *     if (biPredicate.test(key, map.get(key))) {
 *         System.out.println("key: " + key + " value: " + map.get(key));
 *     }
 * }
 *
 * Supplier<List<String>> supplier =
 *         () -> new ArrayList<>(map.values());
 * List<String> strings = supplier.get();
 *
 * Consumer<String> consumer = string -> System.out.println(string);
 * Function<String, String> function = string -> string.toUpperCase();
 * for (String string : strings) {
 *     consumer.accept(function.apply(string));
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * key: 2 value: two
 * key: 4 value: four
 * key: 5 value: five
 * key: 6 value: six
 *
 * ONE
 * TWO
 * THREE
 * FOUR
 * FIVE
 * SIX
 * SEVEN
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class FunctionalInterfaces {

    /**
     * Точка входа в программу.
     *
     * <p>Создает карту, добавляет элементы через {@link BiConsumer},
     * фильтрует через {@link BiPredicate}, собирает список значений
     * через {@link Supplier} и выводит их в верхнем регистре
     * через {@link Function} и {@link Consumer}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        BiConsumer<Integer, String> biConsumer =
                (key, value) -> map.put(key, value);
        biConsumer.accept(1, "one");
        biConsumer.accept(2, "two");
        biConsumer.accept(3, "three");
        biConsumer.accept(4, "four");
        biConsumer.accept(5, "five");
        biConsumer.accept(6, "six");
        biConsumer.accept(7, "seven");

        BiPredicate<Integer, String> biPredicate =
                (key, value) -> key % 2 == 0
                        || value.length() == 4;
        for (Integer key : map.keySet()) {
            if (biPredicate.test(key, map.get(key))) {
                System.out.println("key: " + key + " value: " + map.get(key));
            }
        }

        Supplier<List<String>> supplier = () -> new ArrayList<>(map.values());
        List<String> strings = supplier.get();

        Consumer<String> consumer = string -> System.out.println(string);
        Function<String, String> function = string -> string.toUpperCase();
        for (String string : strings) {
            consumer.accept(function.apply(string));
        }
    }
}
