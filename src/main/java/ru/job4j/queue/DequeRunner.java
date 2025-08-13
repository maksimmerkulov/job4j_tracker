package ru.job4j.queue;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Класс {@code DequeRunner} демонстрирует работу с интерфейсом {@link Deque}
 * и основными методами добавления, удаления и итерации по элементам.
 *
 * <p>Используются методы:
 * <ul>
 *     <li>Добавление элементов:
 *     {@link Deque#add(Object)}, {@link Deque#addFirst(Object)}, {@link Deque#addLast(Object)}</li>
 *     <li>Удаление элементов:
 *     {@link Deque#pop()}, {@link Deque#poll()}, {@link Deque#pollFirst()}, {@link Deque#pollLast()},
 *     {@link Deque#removeFirst()}</li>
 *     <li>Итерация по элементам: обычный итератор и обратный {@link Deque#descendingIterator()}</li>
 * </ul>
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Deque<String> deque = new LinkedList<>();
 * deque.add("second");
 * deque.addFirst("first");
 * deque.addLast("third");
 * for (String string : deque) {
 *     System.out.println(string);
 * }
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * first
 * second
 * third
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class DequeRunner {

    /**
     * Демонстрирует добавление элементов в {@link Deque} с помощью методов
     * {@link Deque#add(Object)}, {@link Deque#addFirst(Object)} и {@link Deque#addLast(Object)},
     * а также вывод элементов в порядке их хранения.
     */
    public static void add() {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");
        for (String string : deque) {
            System.out.println(string);
        }
    }

    /**
     * Демонстрирует удаление элементов из {@link Deque} с помощью методов:
     * <ul>
     *     <li>{@link Deque#pop()}</li>
     *     <li>{@link Deque#poll()}</li>
     *     <li>{@link Deque#pollFirst()}</li>
     *     <li>{@link Deque#pollLast()}</li>
     *     <li>{@link Deque#removeFirst()}</li>
     * </ul>
     *
     * <p>Каждый вызов удаляет и выводит соответствующий элемент.</p>
     */
    public static void popPollPollFirstPollLastRemove() {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque.poll());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque.removeFirst());
    }

    /**
     * Демонстрирует проход по элементам {@link Deque} с помощью обычного итератора.
     */
    public static void iterator() {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Демонстрирует проход по элементам {@link Deque} в обратном порядке
     * с помощью {@link Deque#descendingIterator()}.
     */
    public static void descendingIterator() {
        Deque<String> deque = new LinkedList<>();
        deque.add("second");
        deque.addFirst("first");
        deque.addLast("third");

        Iterator<String> iterator = deque.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Последовательно вызывает методы демонстрации работы с {@link Deque}.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        add();
        popPollPollFirstPollLastRemove();
        iterator();
        descendingIterator();
    }
}
