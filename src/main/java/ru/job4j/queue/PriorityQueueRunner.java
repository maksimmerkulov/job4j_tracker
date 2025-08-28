package ru.job4j.queue;

import java.util.PriorityQueue;

/**
 * Класс {@code PriorityQueueRunner} демонстрирует работу с {@link PriorityQueue}.
 *
 * <p>Включает методы для добавления элементов в очередь {@code offer()},
 * извлечения и удаления элементов с помощью {@code poll()} и просмотра
 * текущего элемента с помощью {@code peek()}.</p>
 *
 * <p>Используются примеры как для строк, так и для объектов {@link Transaction}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PriorityQueue<String> stringQueue = new PriorityQueue<>();
 * stringQueue.offer("f");
 * stringQueue.offer("a");
 * stringQueue.offer("s");
 * stringQueue.offer("e");
 * printStringElements(stringQueue);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Current element: a
 * Current element: e
 * Current element: f
 * Current element: s
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class PriorityQueueRunner {

    /**
     * Демонстрирует добавление строк в {@link PriorityQueue}
     * и их сортировку по алфавиту.
     */
    public void offerStringsDemo() {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("f");
        stringQueue.offer("a");
        stringQueue.offer("s");
        stringQueue.offer("e");
        printStringElements(stringQueue);
    }

    /**
     * Демонстрирует добавление объектов {@link Transaction}
     * в {@link PriorityQueue} с использованием компаратора
     * {@link TransactionSortDescByAmount} для сортировки по убыванию суммы.
     */
    public void offerTransactionsDemo() {
        PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 550));
        printTransactionElements(transactions);
    }

    /**
     * Демонстрирует извлечение строк с помощью {@link PriorityQueue#poll()}.
     * Каждый вызов {@code poll()} возвращает и удаляет текущий минимальный элемент.
     */
    public void pollDemoStrings() {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("f");
        stringQueue.offer("a");
        stringQueue.offer("s");
        stringQueue.offer("e");
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());
    }

    /**
     * Демонстрирует последовательное извлечение строк из очереди
     * с использованием {@code poll()} до опустошения очереди.
     * Когда очередь пуста, {@code poll()} возвращает {@code null}.
     */
    public void pollDemoWithNull() {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();
        stringQueue.offer("f");
        stringQueue.offer("a");
        stringQueue.offer("s");
        stringQueue.offer("e");
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());
        stringQueue.poll();
        System.out.println("Current element: " + stringQueue.poll());
    }

    /**
     * Демонстрирует просмотр текущего элемента {@link Transaction}
     * в {@link PriorityQueue} с использованием {@code peek()},
     * не удаляя его из очереди.
     */
    public void peekDemoTransactions() {
        PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 550));
        System.out.println("Current element: " + transactions.peek());
        System.out.println("Current element: " + transactions.peek());
        transactions.poll();
        System.out.println("Current element: " + transactions.peek());
        transactions.poll();
        System.out.println("Current element: " + transactions.peek());
    }

    /**
     * Демонстрирует добавление нескольких объектов {@link Transaction}
     * с одинаковыми суммами и их обработку в {@link PriorityQueue}.
     */
    public void offerMultipleTransactionsDemo() {
        PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
        transactions.offer(new Transaction(1, "number_1", 100));
        transactions.offer(new Transaction(2, "number_2", 1000));
        transactions.offer(new Transaction(3, "number_3", 85));
        transactions.offer(new Transaction(4, "number_4", 100));
        transactions.offer(new Transaction(5, "number_5", 1000));
        transactions.offer(new Transaction(6, "number_6", 550));
        transactions.offer(new Transaction(7, "number_7", 100));
        transactions.offer(new Transaction(8, "number_8", 1000));
        printTransactionElements(transactions);
    }

    /**
     * Выводит элементы строки из {@link PriorityQueue} до опустошения очереди.
     *
     * @param queue очередь строк
     */
    private static void printStringElements(PriorityQueue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    /**
     * Выводит элементы {@link Transaction} из {@link PriorityQueue} до опустошения очереди.
     *
     * @param queue очередь объектов {@link Transaction}
     */
    private static void printTransactionElements(PriorityQueue<Transaction> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Current element: " + queue.poll());
        }
    }

    /**
     * Точка входа в программу.
     *
     * <p>Запускает демонстрацию всех методов класса.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        PriorityQueueRunner runner = new PriorityQueueRunner();
        runner.offerStringsDemo();
        runner.offerTransactionsDemo();
        runner.pollDemoStrings();
        runner.pollDemoWithNull();
        runner.peekDemoTransactions();
        runner.offerMultipleTransactionsDemo();
    }
}
