package ru.job4j.encapsulation;

/**
 * Класс {@code ATM} представляет собой демонстрацию операций с банковским счетом.
 *
 * <p>Создает объект {@link Account}, пополняет счет двумя суммами.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Account account = new Account();
 * account.addMoney(100);
 * account.addMoney(50);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Баланс: 100
 * Баланс: 150
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class ATM {

    /**
     * Точка входа в программу.
     *
     * <p>Создает объект {@link Account}, выполняет два пополнения
     * и выводит баланс после каждого действия.</p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(100);
        account.addMoney(50);
    }
}