package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Демонстрирует особенности работы с типами {@code int} и {@code Integer},
 * включая автоупаковку, автораспаковку, перегрузку методов и сравнение ссылок.
 *
 * <p>Также создает список чисел от 0 до 9 с использованием {@link ArrayList}.</p>
 *
 * <p>Пример показывает поведение при сравнении объектов {@code Integer}
 * вне и внутри диапазона кеширования (-128 до 127), а также демонстрирует
 * суммирование значений и работу с коллекциями.</p>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Box {

    /**
     * Выводит значение типа {@code Integer}.
     *
     * @param x объект типа {@code Integer}
     */
    public static void num(Integer x) {
        System.out.println("Значение типа Integer: " + x);
    }

    /**
     * Выводит значение типа {@code int}.
     *
     * @param x значение типа {@code int}
     */
    public static void num(int x) {
        System.out.println("Значение типа int: " + x);
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        int a = 1;
        Integer b;
        b = a;
        System.out.println("Integer b = " + b);
        int x = 2;
        num(x);
        Integer m = 3;
        int n = m;
        System.out.println("int n = " + n);
        Integer k = 5;
        Integer l = 6;
        System.out.println(k * l);
        Integer g = 250;
        Integer h = 250;
        System.out.println(g == h);
        Integer v = 127;
        Integer w = 127;
        System.out.println(v == w);
        Integer sum = 0;
        for (int i = 128; i < 300; i++) {
            sum += i;
        }
        System.out.println(sum);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
