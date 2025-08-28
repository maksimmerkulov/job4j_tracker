package ru.job4j.queue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Класс {@code AppleStoreTest} содержит модульные тесты для проверки
 * корректности работы методов класса {@link AppleStore}.
 *
 * <p><b>Пример тестирования:</b></p>
 * <pre>{@code
 * Queue<Customer> customers = new LinkedList<>();
 * customers.add(new Customer("Petr", 1000));
 * customers.add(new Customer("Stas", 1500));
 * customers.add(new Customer("Andrey", 850));
 * customers.add(new Customer("Alexei", 900));
 * customers.add(new Customer("Iryna", 1250));
 * customers.add(new Customer("Elena", 750));
 * customers.add(new Customer("Rail", 950));
 * int count = 4;
 * AppleStore appleStore = new AppleStore(customers, count);
 * String customer = appleStore.getLastHappyCustomer();
 * assertThat(customer).isEqualTo("Alexei");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
class AppleStoreTest {

    /**
     * Проверяет, что {@link AppleStore#getLastHappyCustomer()} возвращает
     * правильное имя последнего счастливого клиента.
     */
    @Test
    void whenGetLast() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1500));
        customers.add(new Customer("Andrey", 850));
        customers.add(new Customer("Alexei", 900));
        customers.add(new Customer("Iryna", 1250));
        customers.add(new Customer("Elena", 750));
        customers.add(new Customer("Rail", 950));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getLastHappyCustomer();
        assertThat(customer).isEqualTo("Alexei");
    }

    /**
     * Проверяет, что {@link AppleStore#getFirstUpsetCustomer()} возвращает
     * правильное имя первого клиента, которому не хватило товара.
     */
    @Test
    void whenGetFirst() {
        Queue<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Petr", 1000));
        customers.add(new Customer("Stas", 1500));
        customers.add(new Customer("Andrey", 850));
        customers.add(new Customer("Alexei", 900));
        customers.add(new Customer("Iryna", 1250));
        customers.add(new Customer("Elena", 750));
        customers.add(new Customer("Rail", 950));
        int count = 4;
        AppleStore appleStore = new AppleStore(customers, count);
        String customer = appleStore.getFirstUpsetCustomer();
        assertThat(customer).isEqualTo("Iryna");
    }
}
