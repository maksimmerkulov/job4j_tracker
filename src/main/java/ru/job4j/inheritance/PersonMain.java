package ru.job4j.inheritance;

/**
 * Класс {@code PersonMain} демонстрирует работу классов {@link Person} и {@link Programmer}.
 *
 * <p>Создаются объекты человека и программиста, вызываются методы {@code speak()} и {@code writeCode()}.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Person person = new Person();
 * System.out.println(person.speak());
 *
 * Programmer programmer = new Programmer();
 * System.out.println(programmer.speak());
 * System.out.println(programmer.writeCode());
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Я говорю.
 *
 * Я говорю.
 * Я пишу код.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class PersonMain {

    /**
     * Точка входа в программу.
     *
     * @param args Аргументы командной строки (не используются).
     */
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.speak());
        Programmer programmer = new Programmer();
        System.out.println(programmer.speak());
        System.out.println(programmer.writeCode());
    }
}