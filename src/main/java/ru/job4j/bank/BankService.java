package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс {@code BankService} представляет собой сервис для управления пользователями
 * и их банковскими счетами.
 *
 * <p>Используется для регистрации новых клиентов, удаления клиентов,
 * добавления счетов, поиска счетов и перевода средств между ними.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * BankService bank = new BankService();
 * User user = new User("1234", "Ivan Petrov Sidorovich");
 * bank.addUser(user);
 * bank.addAccount("1234", new Account("req1", 1000));
 * bank.addAccount("1234", new Account("req2", 500));
 *
 * boolean success = bank.transferMoney("1234", "req1", "1234", "req2", 300);
 * System.out.println(success);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class BankService {

    /**
     * Хранит всех пользователей и их счета.
     *
     * <p>Ключом является объект {@link User}, который содержит паспорт и имя клиента.</p>
     * <p>Значением является список счетов {@link Account}, принадлежащих пользователю.
     * У одного пользователя может быть несколько счетов.</p>
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя в систему.
     *
     * <p>Если пользователь уже существует, повторно не добавляется.</p>
     *
     * @param user Объект {@link User}, который необходимо зарегистрировать.
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Удаляет пользователя по номеру паспорта.
     *
     * @param passport Паспорт пользователя, которого нужно удалить.
     */
    public void deleteUser(String passport) {
        User user = findByPassport(passport);
        if (user != null) {
            users.remove(user);
        }
    }

    /**
     * Добавляет банковский счет к пользователю.
     *
     * <p>Если счет уже существует, он не добавляется повторно.</p>
     *
     * @param passport Паспорт пользователя, которому добавляется счет.
     * @param account Счет {@link Account}, который нужно привязать.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Находит пользователя по номеру паспорта.
     *
     * @param passport Номер паспорта.
     * @return Найденный пользователь {@link User} или {@code null}, если не найден.
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Находит банковский счет по реквизитам и паспорту владельца.
     *
     * @param passport Паспорт владельца счета.
     * @param requisite Реквизиты счета.
     * @return Счет {@link Account}, если найден, иначе {@code null}.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = getAccounts(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Переводит средства между двумя счетами.
     *
     * <p>Перевод возможен только если оба счета существуют и на исходном счете
     * достаточно средств.</p>
     *
     * @param sourcePassport Паспорт отправителя.
     * @param sourceRequisite Реквизиты счета отправителя.
     * @param destinationPassport Паспорт получателя.
     * @param destinationRequisite Реквизиты счета получателя.
     * @param amount Сумма перевода.
     * @return {@code true}, если перевод выполнен успешно, иначе {@code false}.
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account source = findByRequisite(sourcePassport, sourceRequisite);
        Account dest = findByRequisite(destinationPassport, destinationRequisite);
        if (source != null && dest != null && source.getBalance() >= amount) {
            source.setBalance(source.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            return true;
        }
        return false;
    }

    /**
     * Возвращает список счетов пользователя.
     *
     * @param user Пользователь.
     * @return Список счетов {@link Account}, связанных с пользователем.
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
