package ru.job4j.search;

/**
 * Класс {@code Person} представляет собой модель данных для хранения информации о человеке.
 *
 * <p>Содержит поля имени, фамилии, номера телефона и адреса. Используется, например,
 * в поисковых приложениях, справочниках или базах данных пользователей.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Person person = new Person("Иван", "Иванов", "+7 999 123 45 67", "Москва, ул. Ленина, д. 1");
 * String phone = person.getPhone();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * +7 999 123 45 67
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.1
 */
public class Person {

    /**
     * Имя пользователя.
     */
    private String name;

    /**
     * Фамилия пользователя.
     */
    private String surname;

    /**
     * Номер телефона пользователя.
     */
    private String phone;

    /**
     * Адрес пользователя.
     */
    private String address;

    /**
     * Создает объект {@code Person} с заданными данными.
     *
     * @param name    имя пользователя
     * @param surname фамилия пользователя
     * @param phone   номер телефона пользователя
     * @param address адрес пользователя
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя пользователя
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию пользователя.
     *
     * @return фамилия пользователя
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Возвращает номер телефона пользователя.
     *
     * @return номер телефона пользователя
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Возвращает адрес пользователя.
     *
     * @return адрес пользователя
     */
    public String getAddress() {
        return address;
    }
}
