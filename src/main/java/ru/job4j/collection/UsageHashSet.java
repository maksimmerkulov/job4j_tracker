package ru.job4j.collection;

import java.util.HashSet;

/**
 * Класс {@code UsageHashSet} демонстрирует работу с коллекцией {@link HashSet} в Java.
 *
 * <p>Используется для примера добавления элементов в множество и демонстрации того,
 * что {@link HashSet} не допускает дубликатов.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * HashSet<String> autos = new HashSet<>();
 * autos.add("Lada");
 * autos.add("BMW");
 * autos.add("Volvo");
 * autos.add("Lada");
 * autos.add("Toyota");
 * for (String auto : autos) {
 *     System.out.println(auto);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Volvo
 * Toyota
 * Lada
 * BMW
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class UsageHashSet {

    /**
     * Точка входа в программу.
     *
     * <p>Создает {@link HashSet} строк, добавляет несколько значений
     * (включая повторяющееся) и выводит уникальные значения в консоль.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Lada");
        autos.add("Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
