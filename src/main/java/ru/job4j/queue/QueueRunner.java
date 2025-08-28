package ru.job4j.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Класс {@code QueueRunner} демонстрирует работу с интерфейсом {@link Queue}
 * и его методами на примере реализаций {@link LinkedList} и {@link ArrayBlockingQueue}.
 *
 * <p>Каждый метод иллюстрирует работу отдельной операции с очередью:
 * {@code add}, {@code remove}, {@code poll}, {@code offer}, {@code peek}, {@code element},
 * а также поведение при пустой очереди.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Queue<String> queue = new LinkedList<>();
 * queue.add("first");
 * queue.add("second");
 * queue.add("third");
 *
 * for (String string : queue) {
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
 * @version 1.1
 */
public class QueueRunner {

    /**
     * Добавляет элементы в {@link LinkedList}-очередь
     * с помощью {@link Queue#add(Object)} и выводит их на экран.
     */
    public static void add() {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        for (String string : queue) {
            System.out.println(string);
        }
    }

    /**
     * Удаляет первый элемент из очереди с помощью {@link Queue#remove()}.
     *
     * <p>Если очередь пуста — выбрасывает {@link java.util.NoSuchElementException}.</p>
     */
    public static void remove() {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        System.out.println("State of Queue before remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
        queue.remove();
        System.out.println();
        System.out.println("State of Queue after remove: ");
        for (String string : queue) {
            System.out.println(string);
        }
    }

    /**
     * Удаляет первый элемент из очереди с помощью {@link Queue#poll()}.
     *
     * <p>Если очередь пуста — возвращает {@code null} без исключения.</p>
     */
    public static void poll() {
        Queue<String> queue = new LinkedList<>();
        queue.poll();
    }

    /**
     * Демонстрирует работу {@link Queue#poll()} при пустой очереди.
     *
     * <p>Метод вернет {@code null} без исключения.</p>
     */
    public static void pollNull() {
        Queue<String> queue = new LinkedList<>();
        queue.poll();
    }

    /**
     * Демонстрирует работу {@link Queue#remove()} при пустой очереди.
     *
     * <p>Метод выбросит {@link java.util.NoSuchElementException}.</p>
     */
    public static void removeNoSuchElementException() {
        Queue<String> queue = new LinkedList<>();
        queue.remove();
    }

    /**
     * Добавляет элементы в очередь с помощью {@link Queue#offer(Object)} и выводит их на экран.
     *
     * <p>В реализации {@link LinkedList} метод {@code offer} аналогичен {@code add}.</p>
     */
    public static void offer() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        for (String string : queue) {
            System.out.println(string);
        }
    }

    /**
     * Демонстрирует работу {@link ArrayBlockingQueue} с фиксированным размером.
     *
     * <p>Четвертый элемент не будет добавлен, так как очередь заполнена.</p>
     */
    public static void offerArrayBlockingQueue() {
        Queue<String> queue = new ArrayBlockingQueue<>(3);
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");

        for (String string : queue) {
            System.out.println(string);
        }
    }

    /**
     * Возвращает первый элемент очереди с помощью {@link Queue#peek()} без его удаления.
     *
     * <p>Если очередь пуста — метод вернет {@code null}.</p>
     */
    public static void peek() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue.peek());
    }

    /**
     * Возвращает первый элемент очереди с помощью {@link Queue#element()} без его удаления.
     *
     * <p>Если очередь пуста — выбрасывает {@link java.util.NoSuchElementException}.</p>
     */
    public static void element() {
        Queue<String> queue = new LinkedList<>();
        queue.offer("first");
        queue.offer("second");
        queue.offer("third");

        System.out.println(queue.element());
    }

    /**
     * Демонстрирует {@link Queue#peek()} при пустой очереди.
     *
     * <p>Метод вернет {@code null}.</p>
     */
    public static void peekNull() {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.peek());
    }

    /**
     * Демонстрирует {@link Queue#element()} при пустой очереди.
     *
     * <p>Метод выбросит {@link java.util.NoSuchElementException}.</p>
     */
    public static void elementNoSuchElementException() {
        Queue<String> queue = new LinkedList<>();
        System.out.println(queue.element());
    }

    /**
     * Точка входа в программу.
     *
     * <p>Последовательно вызывает все методы демонстрации работы с очередью.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        add();
        remove();
        poll();
        pollNull();
        removeNoSuchElementException();
        offer();
        offerArrayBlockingQueue();
        peek();
        element();
        peekNull();
        elementNoSuchElementException();
    }
}
