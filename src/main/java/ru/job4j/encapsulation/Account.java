package ru.job4j.encapsulation;

/**
 * Класс {@code Account} представляет собой простой банковский счет.
 * <p>
 * Содержит поле {@code balance}, хранящее текущий баланс счета, и метод для пополнения счета.
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 *     Account account = new Account();
 *     account.addMoney(1000);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class Account {

    /**
     * Поле {@code balance} содержит текущий баланс счета.
     */
    private int balance;

    /**
     * Метод {@code addMoney(int money)} увеличивает баланс счета на указанную сумму,
     * если сумма положительная.
     *
     * @param money Сумма, на которую необходимо пополнить счет. Должна быть положительной.
     */
    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}