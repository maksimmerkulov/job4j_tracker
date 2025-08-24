package ru.job4j.queue;

import java.util.PriorityQueue;

/**
 * Класс {@code Transaction} представляет собой транзакцию с уникальным идентификатором,
 * назначением и суммой.
 *
 * <p>Используется в {@link PriorityQueue} для демонстрации работы с очередями и компараторами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Transaction t1 = new Transaction(1, "number_1", 100);
 * Transaction t2 = new Transaction(2, "number_2", 1000);
 * System.out.println(t1);
 * System.out.println(t2);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Transaction{id=1, purpose='number_1', amount=100}
 * Transaction{id=2, purpose='number_2', amount=1000}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Transaction {

    /**
     * Уникальный идентификатор транзакции.
     */
    private int id;

    /**
     * Назначение транзакции.
     */
    private String purpose;

    /**
     * Сумма транзакции.
     */
    private int amount;

    /**
     * Конструктор для создания новой транзакции.
     *
     * @param id уникальный идентификатор транзакции
     * @param purpose назначение транзакции
     * @param amount сумма транзакции
     */
    public Transaction(int id, String purpose, int amount) {

        this.id = id;
        this.purpose = purpose;
        this.amount = amount;
    }

    /**
     * Возвращает сумму транзакции.
     *
     * @return сумма транзакции
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Возвращает строковое представление транзакции.
     *
     * @return строка в формате {@code Transaction{id=..., purpose='...', amount=...}}
     */
    @Override
    public String toString() {
        return "Transaction{"
                + "id=" + id
                + ", purpose='" + purpose + '\''
                + ", amount=" + amount
                + '}';
    }
}
