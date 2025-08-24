package ru.job4j.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Класс {@code TransactionSortDescByAmount} реализует интерфейс {@link Comparator}
 * для объектов {@link Transaction} и выполняет сортировку по сумме транзакции
 * в порядке убывания.
 *
 * <p>Используется в {@link PriorityQueue} для упорядочивания транзакций по
 * уменьшению суммы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * PriorityQueue<Transaction> transactions = new PriorityQueue<>(new TransactionSortDescByAmount());
 * transactions.offer(new Transaction(1, "number_1", 100));
 * transactions.offer(new Transaction(2, "number_2", 1000));
 * transactions.offer(new Transaction(3, "number_3", 85));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Current element: Transaction{id=2, number='number_2', amount=1000}
 * Current element: Transaction{id=1, number='number_1', amount=100}
 * Current element: Transaction{id=3, number='number_3', amount=85}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class TransactionSortDescByAmount implements Comparator<Transaction> {

    /**
     * Сравнивает две транзакции {@link Transaction} по сумме {@code amount} в порядке убывания.
     *
     * @param o1 первая транзакция для сравнения
     * @param o2 вторая транзакция для сравнения
     * @return отрицательное число, если {@code o2.amount > o1.amount},
     *         положительное, если {@code o2.amount < o1.amount}, 0 если равны
     */
    @Override
    public int compare(Transaction o1, Transaction o2) {
        return Integer.compare(o2.getAmount(), o1.getAmount());
    }
}
