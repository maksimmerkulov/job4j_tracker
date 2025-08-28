package ru.job4j.encapsulation;

/**
 * Класс {@code Config} представляет конфигурационный объект с набором свойств.
 *
 * <p>Содержит методы для поиска значения по ключу и вывода текущей позиции.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Config config = new Config("app.properties");
 * config.print();
 * String value = config.getProperty("username");
 * System.out.println("Property: " + value);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * 0
 * Property: username
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Config {

    /**
     * Название конфигурации.
     */
    private String name;

    /**
     * Текущая позиция (индекс или смещение).
     */
    private int position;

    /**
     * Массив свойств конфигурации.
     */
    private String[] properties;

    /**
     * Конструктор создает объект конфигурации с заданным именем.
     *
     * @param name название конфигурации
     */
    public Config(String name) {
        this.name = name;
    }

    /**
     * Выводит значение поля {@code position} в консоль.
     */
    public void print() {
        System.out.println(position);
    }

    /**
     * Возвращает значение свойства по заданному ключу.
     *
     * @param key ключ свойства
     * @return значение, соответствующее ключу
     */
    public String getProperty(String key) {
        return search(key);
    }

    /**
     * Выполняет поиск свойства по ключу.
     *
     * @param key ключ свойства
     * @return значение свойства (в текущей реализации возвращает сам ключ)
     */
    private String search(String key) {
        return key;
    }
}
