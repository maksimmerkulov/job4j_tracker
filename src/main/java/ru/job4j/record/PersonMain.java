package ru.job4j.record;

/**
 * Класс {@code PersonMain} демонстрирует создание и использование объектов {@link Person} и {@link PersonRecord}.
 * <p>
 * Пример включает вывод имени и возраста, сравнение объектов и печать строкового представления.
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Имя: Иван, Возраст: 30
 * Person{name='Иван', age=30}
 * Имя: Иван, Возраст: 30
 * PersonRecord[name=Иван, age=30]
 * true
 * }</pre>
 *
 * @author Maksим Merkulov
 * @version 1.0
 * @since 2025-04-24
 */
public class PersonMain {

    /**
     * Метод {@code main(String[] args)} демонстрирует работу классов {@link Person} и {@link PersonRecord}.
     * <p>
     * Создаются объекты, выводятся значения полей и производится сравнение.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Person person = new Person("Иван", 30);
        System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Иван", 30);
        System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord("Иван", 30);
        System.out.println(record.equals(record1));
    }
}