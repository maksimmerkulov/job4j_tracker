package ru.job4j.polymorphism;

/**
 * Класс {@code Service} демонстрирует использование хранилища данных,
 * реализующего интерфейс {@link Store}.
 *
 * <p>Позволяет сохранять данные через переданный в конструктор объект {@link Store}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * FileStore store = new FileStore();
 * Service service = new Service(store);
 * service.add();
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Service {

    /**
     * Ссылка на объект, реализующий интерфейс {@link Store},
     * через который выполняется сохранение данных.
     */
    private Store store;

    /**
     * Создает объект сервиса с заданным хранилищем данных.
     *
     * @param store объект, реализующий интерфейс {@code Store},
     *              используемый для сохранения данных.
     */
    public Service(Store store) {
        this.store = store;
    }

    /**
     * Сохраняет фиксированную строку "Petr Arsentev" в хранилище,
     * указанное при создании объекта {@link Service}.
     */
    public void add() {
        store.save("Petr Arsentev");
    }

    /**
     * Точка входа в программу.
     *
     * <p>Демонстрирует создание и использование объекта {@link Service}
     * с реализацией хранилища {@link FileStore}.</p>
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        FileStore store = new FileStore();
        Service service = new Service(store);
        service.add();
    }
}
