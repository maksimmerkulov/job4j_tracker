package ru.job4j.encapsulation;

/**
 * Represents a bank account with basic balance management.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Account {

    /**
     * Current balance of the account.
     */
    private int balance;

    /**
     * Adds the specified amount of money to the balance if it is positive.
     *
     * @param money the amount to add
     */
    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
