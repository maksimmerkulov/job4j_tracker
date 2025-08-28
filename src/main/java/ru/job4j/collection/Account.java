package ru.job4j.collection;

import java.util.Objects;

/**
 * Класс {@code Account} представляет банковский аккаунт с уникальным идентификатором — паспортом.
 *
 * <p>Объекты этого класса считаются равными, если у них совпадает поле {@code passport}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Account acc1 = new Account("12345", "Ivan Ivanov", "1000");
 * Account acc2 = new Account("12345", "Ivan Ivanov", "2000");
 * boolean equal = acc1.equals(acc2);
 * System.out.println(acc1);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Account{passport='12345', username='Ivan Ivanov', deposit='1000'}
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Account {

    /**
     * Паспорт — уникальный идентификатор аккаунта.
     */
    private String passport;

    /**
     * Имя владельца аккаунта.
     */
    private String username;

    /**
     * Сумма депозита (хранится как строка).
     */
    private String deposit;

    /**
     * Создает объект {@code Account} с заданными паспортом,
     * именем пользователя и депозитом.
     *
     * @param passport уникальный номер паспорта
     * @param username имя владельца аккаунта
     * @param deposit сумма депозита в виде строки
     */
    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    /**
     * Сравнивает текущий объект с другим на равенство по полю {@code passport}.
     *
     * @param o объект для сравнения
     * @return {@code true}, если поля совпадают; иначе {@code false}
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
        return Objects.equals(passport, account.passport);
    }

    /**
     * Вычисляет хэш-код объекта на основе паспорта.
     *
     * @return хэш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    /**
     * Возвращает строковое представление аккаунта с паспортом,
     * именем пользователя и суммой депозита.
     *
     * @return строка с описанием аккаунта
     */
    @Override
    public String toString() {
        return "Account{"
                + "passport='" + passport + '\''
                + ", username='" + username + '\''
                + ", deposit='" + deposit + '\''
                + '}';
    }
}
