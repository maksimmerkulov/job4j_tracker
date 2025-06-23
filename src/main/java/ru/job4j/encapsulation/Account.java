package ru.job4j.encapsulation;

/**
 * Класс {@code Account} представляет банковский счет с возможностью пополнения.
 *
 * <p>Содержит метод {@link #addMoney(int)}, который увеличивает баланс, если сумма положительная.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Account account = new Account();
 * account.addMoney(100);
 * account.addMoney(-50);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Баланс: 100
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Account {

    /**
     * Баланс счета.
     */
    private int balance;

    /**
     * Добавляет указанную сумму к балансу, если сумма положительная.
     *
     * @param money Сумма для пополнения счета. Должна быть больше нуля.
     */
    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}