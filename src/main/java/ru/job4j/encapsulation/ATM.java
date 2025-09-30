package ru.job4j.encapsulation;

/**
 * Simulates an automated teller machine interaction with an account.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ATM {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        account.addMoney(50);
    }
}
