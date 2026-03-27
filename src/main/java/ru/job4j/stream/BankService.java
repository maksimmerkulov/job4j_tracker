package ru.job4j.stream;

import java.util.List;
import java.util.Map;

/**
 * Bank service for managing users and their accounts using Stream API.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class BankService {

    /** Map of users and their associated account lists. */
    private final Map<User, List<Account>> users;

    /**
     * Creates a new {@code BankService} with the specified user-account map.
     *
     * @param users the initial data map
     */
    public BankService(Map<User, List<Account>> users) {
        this.users = users;
    }

    /**
     * Finds a user by their passport number.
     *
     * @param passport the passport to search for
     * @return the {@code User} if found, otherwise {@code null}
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(user -> user.passport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Finds an account by user passport and account requisite.
     *
     * @param passport  the user passport
     * @param requisite the account requisite
     * @return the {@code Account} if found, otherwise {@code null}
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user).stream()
                .filter(account -> account.requisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }
}
