package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Класс {@code NotifyAccount} предоставляет утилитарный метод
 * для получения множества уникальных аккаунтов из списка.
 *
 * <p>Уникальность аккаунтов определяется методом {@code equals()}
 * класса {@link Account}, который сравнивает аккаунты по полю паспорта.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * List<Account> accounts = List.of(
 *     new Account("123", "User1", "1000"),
 *     new Account("123", "User1", "1000"),
 *     new Account("456", "User2", "500")
 * );
 * HashSet<Account> unique = NotifyAccount.sent(accounts);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class NotifyAccount {

    /**
     * Принимает список аккаунтов и возвращает множество уникальных аккаунтов.
     * Уникальность определяется методом equals() класса Account (по паспорту).
     *
     * @param accounts список аккаунтов
     * @return множество уникальных аккаунтов без дубликатов
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account account : accounts) {
            result.add(account);
        }
        return result;
    }
}
