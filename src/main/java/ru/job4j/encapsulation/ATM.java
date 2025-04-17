package ru.job4j.encapsulation;

/**
 * Класс {@code ATM} демонстрирует работу с объектом {@link Account}.
 * <p>
 * Через метод {@link #main(String[])} осуществляется пополнение банковского счета.
 * </p>
 *
 * <p><b>Пример работы:</b></p>
 * <pre>{@code
 *     Account account = new Account();
 *     account.addMoney(100);
 *     account.addMoney(50);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class ATM {

    /**
     * Метод {@code main(String[] args)} создает объект {@link Account} и пополняет его.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        account.addMoney(50);
    }
}