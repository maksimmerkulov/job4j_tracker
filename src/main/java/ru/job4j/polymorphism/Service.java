package ru.job4j.polymorphism;

/**
 * Класс {@code Service} демонстрирует использование хранилища данных,
 * реализующего интерфейс {@link Store}.
 *
 * <p>Позволяет сохранять данные через переданный в конструктор объект {@link Store}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Store store = new FileStore();
 * Service service = new Service(store);
 * service.add();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Пример вывода зависит от реализации метода save() в {@link FileStore}.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-25
 */
public class Service {

    /**
     * Поле {@code store} содержит ссылку на объект,
     * реализующий интерфейс {@link Store}, через который выполняется сохранение данных.
     */
    private Store store;

    /**
     * Конструктор {@code Service(Store store)} создает объект сервиса
     * с заданным хранилищем данных.
     *
     * @param store Объект, реализующий интерфейс {@code Store}, используемый для сохранения данных.
     */
    public Service(Store store) {
        this.store = store;
    }

    /**
     * Метод {@code add()} сохраняет фиксированную строку "Petr Arsentev"
     * в хранилище, указанное при создании объекта {@link Service}.
     *
     * <p>Для сохранения используется метод {@link Store#save(String)}.</p>
     */
    public void add() {
        store.save("Petr Arsentev");
    }

    /**
     * Метод {@code main(String[] args)} демонстрирует создание и использование объекта {@link Service}
     * с реализацией хранилища {@link FileStore}.
     *
     * <p><b>Пример вывода зависит от реализации класса {@link FileStore}.</b></p>
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        FileStore store = new FileStore();
        Service service = new Service(store);
        service.add();
    }
}