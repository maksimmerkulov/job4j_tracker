package ru.job4j.queue;

import java.util.Queue;

/**
 * Класс {@code AppleStore} моделирует магазин, в котором есть очередь клиентов
 * и ограниченное количество товара.
 *
 * <p>Поле {@link #queue} содержит очередь клиентов, ожидающих покупки.</p>
 * <p>Поле {@link #count} задает количество доступного товара.</p>
 *
 * <p>Методы позволяют определить:
 * <ul>
 *     <li>Имя последнего клиента, который успел купить товар ({@link #getLastHappyCustomer()})</li>
 *     <li>Имя первого клиента, которому не хватило товара ({@link #getFirstUpsetCustomer()})</li>
 * </ul>
 * </p>
 *
 * <p>Для получения клиентов используется метод {@link Queue#poll()}, который извлекает и удаляет
 * первый элемент очереди.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Queue<Customer> customers = new LinkedList<>();
 * customers.add(new Customer("Petr", 1000));
 * customers.add(new Customer("Stas", 1500));
 * customers.add(new Customer("Andrey", 850));
 * customers.add(new Customer("Alexei", 900));
 * customers.add(new Customer("Iryna", 1250));
 * customers.add(new Customer("Elena", 750));
 * customers.add(new Customer("Rail", 950));
 *
 * int count = 4;
 * AppleStore store = new AppleStore(customers, count);
 *
 * String lastHappy = store.getLastHappyCustomer();
 * System.out.println(lastHappy)
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Alexei
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class AppleStore {

    /**
     * Очередь клиентов, ожидающих покупки.
     */
    private final Queue<Customer> queue;

    /**
     * Количество доступного товара.
     */
    private final int count;

    /**
     * Конструктор инициализирует магазин с очередью клиентов и количеством товара.
     *
     * @param queue Очередь клиентов.
     * @param count Количество доступного товара.
     */
    public AppleStore(Queue<Customer> queue, int count) {
        this.queue = queue;
        this.count = count;
    }

    /**
     * Возвращает имя последнего клиента, который получил товар.
     *
     * <p>Метод последовательно извлекает из очереди {@code count} клиентов
     * с помощью {@link Queue#poll()} и возвращает имя последнего из них.</p>
     *
     * @return Имя последнего счастливого клиента.
     */
    public String getLastHappyCustomer() {
        Customer lastHappy = null;
        for (int i = 0; i < count; i++) {
            lastHappy = queue.poll();
        }
        return lastHappy.name();
    }

    /**
     * Возвращает имя первого клиента, которому не хватило товара.
     *
     * <p>Метод сначала извлекает из очереди {@code count} счастливчиков, затем
     * возвращает имя следующего клиента, который остался без товара.</p>
     *
     * @return Имя первого недовольного клиента.
     */
    public String getFirstUpsetCustomer() {
        for (int i = 0; i < count; i++) {
            queue.poll();
        }
        return queue.poll().name();
    }
}
