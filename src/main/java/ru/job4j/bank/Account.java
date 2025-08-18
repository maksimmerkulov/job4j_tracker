package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс {@code Account} представляет модель банковского счета.
 *
 * <p>Счет содержит реквизиты и баланс. Один пользователь может иметь несколько счетов.</p>
 *
 * <p><b>Поля:</b></p>
 * <ul>
 *   <li>{@link #requisite} — уникальные реквизиты счета;</li>
 *   <li>{@link #balance} — текущий баланс на счете.</li>
 * </ul>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Account account = new Account("req123", 1000.0);
 * System.out.println(account.getRequisite());
 * System.out.println(account.getBalance());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * req123
 * 1000.0
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Account {

    /**
     * Реквизиты счета, служат для уникальной идентификации.
     */
    private String requisite;

    /**
     * Баланс счета.
     */
    private double balance;

    /**
     * Конструктор для инициализации счета.
     *
     * @param requisite Реквизиты счета.
     * @param balance Начальный баланс счета.
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты счета.
     *
     * @return Реквизиты счета.
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Устанавливает новые реквизиты счета.
     *
     * @param requisite Новые реквизиты счета.
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Возвращает текущий баланс счета.
     *
     * @return Баланс счета.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанавливает баланс счета.
     *
     * @param balance Новый баланс счета.
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивает счета по реквизитам.
     *
     * @param o Другой объект для сравнения.
     * @return {@code true}, если реквизиты совпадают, иначе {@code false}.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Вычисляет хэш-код на основе реквизитов счета.
     *
     * @return Хэш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
