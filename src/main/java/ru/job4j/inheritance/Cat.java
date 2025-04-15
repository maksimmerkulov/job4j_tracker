package ru.job4j.inheritance;

/**
 * Класс {@code Cat} представляет собой потомка класса {@link Animal}.
 *
 * <p>Переопределяет метод экземпляра {@link #instanceInvoke()}, чтобы отразить поведение кота.
 * Также скрывает статический метод {@link #staticInvoke()} родительского класса.</p>
 *
 * <p>Пример использования:
 * <pre>{@code
 * Animal animal = new Cat();
 * animal.instanceInvoke();       Вызов метода экземпляра Cat
 * Animal.staticInvoke();         Вызов статического метода Animal
 * Cat.staticInvoke();            Вызов статического метода Cat
 * }</pre>
 *
 * <p>Демонстрирует принципы переопределения и скрытия методов в иерархии классов.</p>
 *
 * @author Maksim Merkulov
 * @version 1.0
 * @since 2025-04-15
 */
public class Cat extends Animal {

    /**
     * Переопределённый метод {@code instanceInvoke()} экземпляра, отражающий поведение {@code Cat}.
     */
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экземпляра Cat");
    }

    /**
     * Статический метод {@code staticInvoke()}, скрывающий метод родителя {@link Animal#staticInvoke()}.
     */
    public static void staticInvoke() {
        System.out.println("Вызов статического метода Cat");
    }
}