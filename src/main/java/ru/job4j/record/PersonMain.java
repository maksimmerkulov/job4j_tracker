package ru.job4j.record;

/**
 * Класс {@code PersonMain} демонстрирует создание и использование объектов {@link Person} и {@link PersonRecord}.
 *
 * <p>Класс включает вывод имени и возраста, сравнение объектов и печать строкового представления.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Person person = new Person("Иван", 30);
 * System.out.println("Имя: " + person.getName() + ", Возраст: " + person.getAge());
 * System.out.println(person);
 * PersonRecord record = new PersonRecord("Иван", 30);
 * System.out.println("Имя: " + record.name() + ", Возраст: " + record.age());
 * System.out.println(record);
 * PersonRecord record1 = new PersonRecord("Иван", 30);
 * System.out.println(record.equals(record1));
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Имя: Иван, Возраст: 30
 * Person{name='Иван', age=30}
 * Имя: Иван, Возраст: 30
 * Person{name='Иван', age=30}
 * true
 * }</pre>
 *
 * @author Maksiм Merkulov
 * @version 1.0
 */
public class PersonMain {

    /**
     * Точка входа в приложение.
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