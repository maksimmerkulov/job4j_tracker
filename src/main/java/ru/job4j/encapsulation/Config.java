package ru.job4j.encapsulation;

/**
 * Класс {@code Config} представляет конфигурационный объект с набором свойств.
 * <p>
 * Содержит методы для поиска значения по ключу и вывода текущей позиции.
 * </p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 *     Config config = new Config("application");
 *     config.print();    Выведет значение поля position
 *     String value = config.getProperty("url");
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-17
 */
public class Config {

    /**
     * Поле {@code name} хранит название конфигурации.
     */
    private String name;

    /**
     * Поле {@code position} хранит текущую позицию (индекс или смещение).
     */
    private int position;

    /**
     * Поле {@code properties} содержит массив свойств конфигурации.
     */
    private String[] properties;

    /**
     * Конструктор {@code Config(String name)} создает объект конфигурации с заданным именем.
     *
     * @param name Название конфигурации.
     */
    public Config(String name) {
        this.name = name;
    }

    /**
     * Метод {@code print()} выводит значение поля {@code position} в консоль.
     */
    public void print() {
        System.out.println(position);
    }

    /**
     * Метод {@code getProperty(String key)} возвращает значение свойства по заданному ключу.
     *
     * @param key Ключ свойства.
     * @return Значение, соответствующее ключу.
     */
    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Приватный метод {@code search(String key)} выполняет поиск свойства по ключу.
     *
     * @param key Ключ свойства.
     * @return Значение свойства (в текущей реализации возвращает сам ключ).
     */
    private String search(String key) {
        return key;
    }
}