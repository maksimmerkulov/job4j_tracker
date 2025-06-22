package ru.job4j.inheritance;

/**
 * Класс {@code Animal} представляет обобщенное животное.
 *
 * <p>Содержит базовое поведение, доступное для всех животных — нестатический
 * метод {@link #instanceInvoke()} и статический метод {@link #staticInvoke()}.</p>
 *
 * <p>Этот класс может быть расширен подклассами, которые переопределяют или скрывают указанные методы.</p>
 *
 * <p><b>Пример использования:</b></p>
 * <pre>{@code
 * Animal animal = new Animal();
 * animal.instanceInvoke();
 * Animal.staticInvoke();
 * }</pre>
 *
 * <p><b>Пример вывода:</b></p>
 * <pre>{@code
 * Вызов метода экземпляра Animal
 * Вызов статического метода Animal
 * }</pre>
 *
 * @author Maksim Merkulov
 * @version 1.0
 */
public class Animal {

    /**
     * Выводит сообщение о вызове метода экземпляра {@code Animal}.
     *
     * <p>Метод может быть переопределен в подклассах.</p>
     */
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Animal");
    }

    /**
     * Выводит сообщение о вызове статического метода {@code Animal}.
     *
     * <p>Метод может быть скрыт в подклассах.</p>
     */
    public static void staticInvoke() {
        System.out.println("Вызов статического метода Animal");
    }
}