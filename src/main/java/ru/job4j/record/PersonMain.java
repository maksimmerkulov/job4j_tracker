package ru.job4j.record;

/**
 * Provides an entry point to demonstrate the difference between a class
 * and a record.
 *
 * <p>Example output:
 * <pre>{@code
 * Name: Ivan, Age: 30
 * Person{name='Ivan', age=30}
 * Name: Ivan, Age: 30
 * Person{name='Ivan', age=30}
 * true
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PersonMain {

    /**
     * Entry point of the program.
     *
     * @param args command-line arguments; not used
     */
    public static void main(String[] args) {
        Person person = new Person("Ivan", 30);
        System.out.println("Name: " + person.getName()
                + ", Age: " + person.getAge());
        System.out.println(person);
        PersonRecord record = new PersonRecord("Ivan", 30);
        System.out.println("Name: " + record.name() + ", Age: " + record.age());
        System.out.println(record);
        PersonRecord record1 = new PersonRecord("Ivan", 30);
        System.out.println(record.equals(record1));
    }
}
