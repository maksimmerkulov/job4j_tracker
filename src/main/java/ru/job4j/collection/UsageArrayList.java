package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Демонстрирует базовое использование {@link ArrayList} со строками.
 *
 * <p>Создает список имен и выводит каждое имя в консоль.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class UsageArrayList {

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
