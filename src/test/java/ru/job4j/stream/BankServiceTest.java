package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for the {@link BankService} class.
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
class BankServiceTest {

    /**
     * Verifies that a user is correctly found by passport.
     */
    @Test
    void whenUserWasFound() {
        Map<User, List<Account>> users = Map.of(
                new User("123", "name_1"), List.of(
                        new Account("321123", 200D),
                        new Account("123321", 100D)
                )
        );
        User result = new BankService(users).findByPassport("123");
        User expected = new User("123", "name_1");
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that search returns null when user passport is not present.
     */
    @Test
    void whenUserWasNotFound() {
        Map<User, List<Account>> users = Map.of(
                new User("123", "name_1"), List.of(
                        new Account("321123", 200D),
                        new Account("123321", 100D)
                )
        );
        User result = new BankService(users).findByPassport("321");
        assertThat(result).isNull();
    }

    /**
     * Verifies that an account is correctly found by passport and requisite.
     */
    @Test
    void whenAccountWasFound() {
        Map<User, List<Account>> users = Map.of(
                new User("123", "name_1"), List.of(
                        new Account("321123", 200D),
                        new Account("123321", 100D)
                )
        );
        Account result =
                new BankService(users).findByRequisite("123", "321123");
        Account expected = new Account("321123", 200D);
        assertThat(result).isEqualTo(expected);
    }

    /**
     * Verifies that search returns null when account requisite is not present.
     */
    @Test
    void whenAccountWasNotFound() {
        Map<User, List<Account>> users = Map.of(
                new User("123", "name_1"), List.of(
                        new Account("321123", 200D),
                        new Account("123321", 100D)
                )
        );
        Account result =
                new BankService(users).findByRequisite("123", "123456");
        assertThat(result).isNull();
    }
}
