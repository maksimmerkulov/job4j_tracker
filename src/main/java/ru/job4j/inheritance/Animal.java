package ru.job4j.inheritance;

/**
 * Класс {@code Animal} демонстрирует базовое поведение животных.
 *
 * <p>Содержит:
 * <ul>
 *     <li>Метод экземпляра {@link #instanceInvoke()} — выводит сообщение о вызове нестатического метода.</li>
 *     <li>Статический метод {@link #staticInvoke()} — выводит сообщение о вызове статического метода.</li>
 * </ul>
 *
 * <p>Пример использования:
 * <pre>{@code
 * Animal animal = new Animal();
 * animal.instanceInvoke();       Вызов метода экземпляра Animal
 * Animal.staticInvoke();         Вызов статического метода Animal
 * }</pre>
 *
 * <p>Данный класс является родительским для другого класса {@link Cat}.
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-15
 */
public class Animal {

    /**
     * Нестатический метод {@code instanceInvoke()}.
     */
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Animal");
    }

    /**
     * Статический метод {@code staticInvoke()}.
     */
    public static void staticInvoke() {
        System.out.println("Вызов статического метода Animal");
    }
}
