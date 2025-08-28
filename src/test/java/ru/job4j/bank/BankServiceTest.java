package ru.job4j.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code BankServiceTest} содержит модульные тесты для проверки работы
 * сервиса {@link BankService}.
 *
 * <p>Основные сценарии:</p>
 * <ul>
 *     <li>Добавление и удаление пользователей из системы.</li>
 *     <li>Добавление счетов пользователю, в том числе проверка дубликатов и
 *     попытки добавления к несуществующему пользователю.</li>
 *     <li>Поиск пользователей и счетов по паспорту и реквизитам.</li>
 *     <li>Перевод средств между счетами:
 *         <ul>
 *             <li>Успешный перевод при корректных данных;</li>
 *             <li>Проверка списания средств со счета отправителя;</li>
 *             <li>Недостаточно средств для перевода;</li>
 *             <li>Некорректные реквизиты счета отправителя или получателя.</li>
 *         </ul>
 *     </li>
 * </ul>
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * User user = new User("3434", "Petr Arsentev");
 * BankService bank = new BankService();
 * bank.addUser(user);
 * bank.addAccount(user.getPassport(), new Account("5546", 150D));
 * bank.addAccount(user.getPassport(), new Account("113", 50D));
 * boolean result = bank.transferMoney(user.getPassport(), "5546",
 *         user.getPassport(), "113", 150D);
 * assertThat(result).isTrue();
 * assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance()).isEqualTo(200D);
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class BankServiceTest {

    /**
     * Проверяет, что пользователь успешно добавляется в систему
     * и его можно найти по номеру паспорта.
     */
    @Test
    void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434")).isEqualTo(user);
    }

    /**
     * Проверяет, что пользователь удаляется из системы по паспорту.
     */
    @Test
    void deleteUserIsTrue() {
        User first = new User("3434", "Petr Arsentev");
        User second = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(first);
        bank.addUser(second);
        bank.deleteUser("3434");
        assertThat(bank.findByPassport(first.getPassport())).isNull();
    }

    /**
     * Проверяет, что при попытке удалить пользователя с несуществующим паспортом,
     * пользователь в системе остается.
     */
    @Test
    void deleteUserIsFalse() {
        User first = new User("3434", "Petr Arsentev");
        User second = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(first);
        bank.addUser(second);
        bank.deleteUser("343434");
        assertThat(bank.findByPassport(first.getPassport())).isEqualTo(first);
    }

    /**
     * Проверяет, что поиск счета с неверным паспортом возвращает {@code null}.
     */
    @Test
    void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("34", "5546")).isNull();
    }

    /**
     * Проверяет, что новый счет успешно добавляется пользователю.
     */
    @Test
    void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance()).isEqualTo(150D);
    }

    /**
     * Проверяет, что при добавлении счета к несуществующему пользователю
     * список его счетов остается пустым.
     */
    @Test
    void addAccountIsInvalid() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount("4343", new Account("5546", 150D));
        assertThat(bank.getAccounts(user)).isEmpty();
    }

    /**
     * Проверяет, что нельзя добавить два одинаковых счета одному пользователю.
     */
    @Test
    void addDuplicateAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("5546", 500D));
        assertThat(bank.getAccounts(user).size()).isEqualTo(1);
    }

    /**
     * Проверяет, что перевод денег между счетами одного пользователя проходит успешно.
     */
    @Test
    void transferMoneyOk() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean result = bank.transferMoney(user.getPassport(), "5546",
                user.getPassport(), "113", 150D);
        assertThat(result).isTrue();
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance()).isEqualTo(200D);
    }

    /**
     * Проверяет, что после перевода деньги списываются со счета отправителя.
     */
    @Test
    void transferMoneyOkCheckSourceAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(0D);
    }

    /**
     * Проверяет, что перевод невозможен, если реквизиты счета отправителя указаны неверно.
     */
    @Test
    void transferMoneySourceNull() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        boolean result = bank.transferMoney(user.getPassport(), "554",
                user.getPassport(), "113", 150D);
        assertThat(result).isFalse();
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(150D);
    }

    /**
     * Проверяет, что перевод невозможен, если на счете отправителя недостаточно средств.
     */
    @Test
    void transferMoneyDontHaveEnoughMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 300D);
        assertThat(bank.findByRequisite(user.getPassport(), "113").getBalance()).isEqualTo(50D);
    }

    /**
     * Проверяет, что перевод невозможен, если реквизиты счета получателя указаны неверно.
     */
    @Test
    void transferMoneyDestinationIsNull() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "1131", 150D);
        assertThat(bank.findByRequisite(user.getPassport(), "5546").getBalance()).isEqualTo(150D);
    }
}
