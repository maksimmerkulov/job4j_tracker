package ru.job4j.inheritance;

/**
 * Класс {@code Person} представляет человека.
 *
 * <p>Содержит базовое поведение — способность говорить.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Person person = new Person();
 * String words = person.speak();
 * System.out.println(words);
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Я говорю.
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Person {

    /**
     * Возвращает строку с сообщением о том, что человек говорит.
     *
     * @return Строка с сообщением о том, что человек говорит.
     */
    public String speak() {
        return "Я говорю.";
    }
}