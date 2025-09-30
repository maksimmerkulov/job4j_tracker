package ru.job4j.encapsulation;

/**
 * A main runner class simulating an automated teller machine interaction with
 * an {@link Account}.
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
