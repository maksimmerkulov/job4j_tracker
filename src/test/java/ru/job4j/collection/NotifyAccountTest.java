package ru.job4j.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code NotifyAccountTest} содержит модульные тесты
 * для проверки метода {@link NotifyAccount#sent(List)}.
 *
 * <p>Метод {@code sent} возвращает множество уникальных аккаунтов
 * из списка, основываясь на поле паспорта.</p>
 *
 * <p>Тесты проверяют корректную фильтрацию дубликатов аккаунтов
 * с одинаковым паспортом.</p>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * List<Account> accounts = Arrays.asList(
 *         new Account("123", "Petr Arsentev", "eDer3432f"),
 *         new Account("142", "Petr Arsentev", "eDer3432f")
 * );
 * HashSet<Account> expected = new HashSet<>();
 * expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
 * expected.add(new Account("142", "Petr Arsentev", "eDer3432f"));
 * assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class NotifyAccountTest {

    /**
     * Проверяет, что при добавлении двух разных аккаунтов
     * оба уникальных аккаунта присутствуют в результате.
     */
    @Test
    public void whenAddTwoDifferentAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f")
        );
        HashSet<Account> expected = new HashSet<>();
        expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        expected.add(new Account("142", "Petr Arsentev", "eDer3432f"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
    }

    /**
     * Проверяет, что при добавлении двух аккаунтов с одинаковым паспортом
     * в результате будет один уникальный аккаунт.
     */
    @Test
    public void whenAddTwoDuplicateAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000000001")
        );
        HashSet<Account> expected = new HashSet<>();
        expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
    }

    /**
     * Проверяет, что при добавлении списка аккаунтов с несколькими дубликатами
     * в результате остаются только уникальные аккаунты по паспорту.
     */
    @Test
    public void whenAddSomeDuplicateAccounts() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Ivan Ivanov", "000000001"),
                new Account("142", "Petr Petrov", "000000002"),
                new Account("123", "Mark Markov", "000000003")
        );
        HashSet<Account> expected = new HashSet<>();
        expected.add(new Account("123", "Petr Arsentev", "eDer3432f"));
        expected.add(new Account("142", "Petr Arsentev", "eDer3432f"));
        assertThat(NotifyAccount.sent(accounts)).containsAll(expected);
    }
}
